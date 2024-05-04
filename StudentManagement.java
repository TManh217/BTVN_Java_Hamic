package BTHamic_Tuan4;
import java.util.Scanner;
public class StudentManagement {
    public static Student[] inputStudent(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n");
        int n = Integer.parseInt(sc.nextLine());
        Student [] stu = new Student[n];
        for(int i=0;i<n;i++){
            System.out.println("nhap student vao");
            String s = sc.nextLine();
            String arr[] = s.split(" ");
            stu[i] = new Student();
            stu[i].setId(arr[0]);
            stu[i].setName(arr[1]);
            stu[i].setBirth(arr[2]);
            stu[i].setGender(arr[3]);
            stu[i].setAddress(arr[4]);
        }
        return stu;
    }
    public static void outputStudent(Student[] stu){
        for(int i=0;i<stu.length;i++){
            System.out.println(stu[i].toString());
        }
    }
    public static boolean compareString(String a,String b){
        char ar1[] = a.toCharArray();
        char ar2[] = b.toCharArray();
        int i=0;
        while(i<ar1.length){
            if (ar1[i]<ar2[i]){
                return true;
            }
            else if (ar1[i]>ar2[i]){
                return false;
            }
            else{
                i++;
            }
        }
        return true;
    }
    public static void sortByName(Student[] stu){
        int n = stu.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (compareString(stu[i].getName(), stu[j].getName()) == false ){
                    Student tmp = stu[i];
                    stu[i] = stu[j];
                    stu[j] = tmp;
                }
            }
        }
        return;
    }
    public static void sortByGender(Student[] stu){
        int n = stu.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (compareString(stu[i].getGender(), stu[j].getGender()) == false ){
                    Student tmp = stu[i];
                    stu[i] = stu[j];
                    stu[j] = tmp;
                }
            }
        }
    
    }
    public static Student[] filterByGender(Student[] stu,String inputGender){
        int count=0;
        int n = stu.length;
        for (int i=0;i<n;i++){
            if (stu[i].getGender().equals(inputGender)){
                count++;
            }  
        }
        Student[] gen = new Student[count];
        int j=0;
        for (int i=0;i<n;i++){
            if (stu[i].getGender().equals(inputGender)){
                gen[j]=stu[i];
                j++;
            }  
        }
        return gen;
    }
    public static Student[] filterById(Student[] stu,String inputId){
        int count=0;
        int n = stu.length;
        for (int i=0;i<n;i++){
            String s = stu[i].getId().substring(0, 1);
            if (s.equals(inputId)){
                count++;
            }  
        }
        Student[] gen = new Student[count];
        int j=0;
        for (int i=0;i<n;i++){
               String str = stu[i].getId().substring(0, 1);
            if (str.equals(inputId)){
                gen[j] = stu[i];
                j++;
            }  
        }
        return gen;
    }
    public static void main(String[] args) {
        Student students[] = inputStudent();
        sortByName(students);
        outputStudent(students);
        sortByGender(students);
        outputStudent(students);
        Student nam[] = filterByGender(students,"Male");
        Student k68[] = filterById(students,"23");
        outputStudent(nam);
        outputStudent(k68);
    }

}
