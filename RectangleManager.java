package BTHamicTuan5;
import java.util.*;

public class RectangleManager {
     
    public static ArrayList<Rectangle> inputRectangle(){
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n vao");
        int n = Integer.parseInt(sc.nextLine());
        for (int i=0;i<n;i++){
            String form = sc.nextLine();
            if (form.equals("v")){
                float side = Float.parseFloat(sc.nextLine());
                String color = sc.nextLine();
                Square square = new Square(side,color);
                rectangles.add(square);
            } else if (form.equals("cn")){
                float length = Float.parseFloat(sc.nextLine());
                float width = Float.parseFloat(sc.nextLine());
                String color = sc.nextLine();
                Rectangle rectangle = new Rectangle(length,width,color);
                rectangles.add(rectangle);
            }
        }
        sc.close();
        return rectangles;
    }
    
    public static void printRectangle(ArrayList<Rectangle> rectangles){
        for (int i=0;i<rectangles.size();i++){
            System.out.println(rectangles.get(i).toString());
        }
    }
    public static void sortByArea(ArrayList<Rectangle> rectangles){
        Collections.sort(rectangles,new SortByArea());
    }
    public static ArrayList<Rectangle> findSquaresMinArea(ArrayList<Rectangle> rectangles){
        ArrayList<Rectangle> msquare = new ArrayList<Rectangle>();
        double min = Double.MAX_VALUE;
        for(int i=0;i<rectangles.size();i++){
            if (rectangles.get(i) instanceof Square){
                //System.out.println("3");
                if(rectangles.get(i).getArea() < min){
                    msquare.clear();
                    msquare.add(rectangles.get(i));
                    //System.out.println("1");
                    min = rectangles.get(i).getArea();
                }
                else if (rectangles.get(i).getArea() == min){
                    //System.out.println("2");
                    msquare.add(rectangles.get(i));
                }
            }
        }
        return msquare;
    }

    public static ArrayList<Rectangle> findKPerimeter(ArrayList<Rectangle> rectangles,int k){
        Collections.sort(rectangles,new SortByPerimeter());
        printRectangle(rectangles);
        int count=1;
        Rectangle tmp = null;
        ArrayList  list = new ArrayList<Rectangle>(); 
        for (int i=1;i<rectangles.size();i++){
            if (rectangles.get(i-1).getPerimeter() < rectangles.get(i).getPerimeter()){
                count++;
            }
            if (count == k){
                    tmp = rectangles.get(i);
                    break;
            }
            
            
        }
        if (tmp == null) return null;
        for (Rectangle rectangle : rectangles){
            if (rectangle.getPerimeter() == tmp.getPerimeter() ){
                list.add(rectangle);
            }
        }
        return list;
       
    }
    public static void main(String[] args) {
        //ArrayList<Rectangle> a = inputRectangle();
        ArrayList<Rectangle> a = new ArrayList<>();
        a.add(new Square(3,"r"));
        a.add(new Rectangle(3,2,"r"));
        a.add(new Square(2.5f,"g"));
        a.add(new Square(4,"b"));
        sortByArea(a);
        printRectangle(a);
        System.out.println("min area la:");
        printRectangle(findSquaresMinArea(a));
        ArrayList<Rectangle> b = findKPerimeter(a, 1);
        if (b == null){
            System.out.println("Null");
        }
        else {
            System.out.println("ptu lon thu k la");
            printRectangle(b);
        }


    }
}

