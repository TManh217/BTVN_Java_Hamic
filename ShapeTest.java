import java.util.Scanner;
import java.util.ArrayList;
public class ShapeTest{
    public static void main(String[] args) {
        Arraylist<Shape> list = inputArr();
        printRes(list);

    }
    public static Arraylist<Shape> inputArr(){
        Arraylist<Shape> list = new Arraylist<Shape>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInteger(sc.nextLine());
        while(true){
            String str = sc.nextLine();
            String arr[] = str.split(" ");
            if (arr[0].equals("v")){
                double canh = Double.parseDouble(arr[1]);
                Square tmp = new Square(canh);
                list.add(tmp);

            }
            else if (arr[0].equals("t")){
                double r = Double.parseDouble(arr[1]);
                Circle tmp = new Circle(r);
                list.add(tmp);
            }
            else if (arr[0].equals("g")){
                double a = Double.parseDouble(arr[1]);
                double b = Double.parseDouble(arr[2]);
                Rectangle tmp = new Rectangle(a,b);
                list.add(tmp);
            }
            else break;
        }
        return list;

    }

    public static void printRes(ArrayList<Shape> list){
        for(int  i=0;i<list.size();i++){
            Shape s = list.get(i);
            System.out.print(s.getArea()+" ");
        }

    }    
}
