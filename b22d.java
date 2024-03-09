package Btt1_hamic;

public class b22d {
    public static void main(String[] args) {
        double  a= Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        if (a != 0 && b != 0) System.out.println("x = "+ (-b)/a);
        else if (a == 0 && b == 0) System.out.println("pt vsn");
        else if ( a==0 && b != 0) System.out.println("pt vo nghiem");
        else System.out.println(0);
   }
}
