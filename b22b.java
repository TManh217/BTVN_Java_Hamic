package Btt1_hamic;

public class b22b {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n <= 0 ) System.out.println("false");
        else if (n % 400 == 0 ) System.out.println("true");
        else if (n % 4 == 0 && n % 100 !=0) System.out.println("true");
        else System.out.println("false");
   }
}
