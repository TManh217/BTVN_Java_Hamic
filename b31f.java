package Btt2_hamic;

public class b31f {
    public static double taylorSeq(int n, double x){
        double sum = 0;
        double tmp = 1;
        double pi = Math.PI;
        for(int i=1;i<=2*n+1;i++ ){
            tmp = tmp*(x*pi/180)/i;
            sum+= Math.sin(x*pi/180+ i*pi/2)*tmp;
        }
        return sum;
    }
    public static void main(String []args){
        int n = Integer.parseInt(args[0]);
        double x = Double.parseDouble(args[1]);
        System.out.println(taylorSeq(n,x));
    }
}
