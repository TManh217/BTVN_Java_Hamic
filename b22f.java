package Btt1_hamic;

public class b22f {
    public static void main(String[] args) {
        double  a= Double.parseDouble(args[0]);
        double   b= Double.parseDouble(args[1]);
        double  c= Double.parseDouble(args[2]);
        double d = Double.parseDouble(args[3]);
        double  e= Double.parseDouble(args[4]);
        double f = Double.parseDouble(args[5]);
        double x,y;
        if ( b*d -e*a !=0){
            y = (c*d-f*a)/(b*d-e*a);
            x = c*d/a*b - b*d*y;
            System.out.println("x="+x+" y="+y);
        } else if ( b*d -e*a ==0 && c*d-f*a ==0) System.out.println("pt vsn");
        else if ( b*d -e*a ==0 && c*d-f*a !=0) System.out.println("pt vo nghiem");
    
        

    }
}
