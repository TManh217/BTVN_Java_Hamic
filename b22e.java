package Btt1_hamic;

import java.util.Scanner;

public class b22e {
     public static void main(String []agrs){
        Scanner sc=new Scanner(System.in);
        double a=Double.parseDouble(args[0]);
        double b=Double.parseDouble(args[1]);
        double c=Double.parseDouble(args[2]);
        double delta = b*b - 4*a*c;
        if ( delta < 0){
            System.out.println("Pt vo nghiem");

        } else if ( delta == 0){
            System.out.println ( -b/(2*a));
        } else {
            System.out.println ("x1=" + (-b+Math.sqrt(delta))/(2*a));
            System.out.println ("x2=" + (-b-Math.sqrt(delta))/(2*a));
        }
    }
}
