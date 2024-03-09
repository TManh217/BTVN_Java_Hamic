package Btt1_hamic;

public class b127 {
    public static void main(String[] args) {
        int a,b,t;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        t = Integer.parseInt(args[2]);
        int s = 0;
        for(int i=a;i<=b;i++){
            if(i%t==0) s+=i;
        }
        System.out.print(s);
    }
}
