package Btt1_hamic;

public class b123 {
    public static void main(String[] args) {
        double a,b,c,x,y,z;
        double pi = Math.PI;
        a = Double.parseDouble(args[0]);
        b = Double.parseDouble(args[1]);
        c = Double.parseDouble(args[2]);
        x = Double.parseDouble(args[3]);
        y = Double.parseDouble(args[4]);
        z = Double.parseDouble(args[5]);
        
       System.out.print("D = "+Math.sqrt((a-x)*(a-x)+(y-b)*(y-b)+(c-z)*(c-z)));
        
        
    }
}
