package Btt2_hamic;

import java.util.Scanner;

public class b31d {
      public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fa=0;
        int fb=1;
        int tmp;
        for (int i=2;i<=n;i++){
            tmp=fa+fb;
            fa= fb;
            fb=tmp;

        }
        System.out.println(fb);

    }
    
}
