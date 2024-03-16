package Btt2_hamic;
import java.util.Scanner;
public class b32g {
    public static double taylor(double x){
        double sum = x;
        double tmp = x;
        int i = 2;
        while(Math.abs(tmp) >= 1e-18){
            tmp*= -x/i;
            sum += tmp; 
            i++;
        }
        System.out.println("Phan du thu "+i+" la "+tmp);
        //System.out.println("khai trien den so thu "+i);
        return sum;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        System.out.println(taylor(Math.E-1));

    }
}
