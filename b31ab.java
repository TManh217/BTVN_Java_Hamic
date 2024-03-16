package Btt2_hamic;

import java.util.Scanner;

public class b31ab {
    public static boolean checkprime(int n){
        if (n <2) return false;
        for (int i=2; i*i<=n;i++){
            if (n%i ==0) return false;
            
        }
        return true;
    }
    public static boolean check_sprime(int n){
        if (n<2) return false;
        while (n> 0) {
            if (checkprime(n)== false) return false;
            n=n/10;
        }
        return true;
    }
    
    public static void main(String []args){
       // Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(args[0]);
        if (check_sprime(n)) System.out.println("True");
        else System.out.println("False");
        
    }
}
