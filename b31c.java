package Btt2_hamic;

import java.util.Scanner;

public class b31c {
    static int k=10001;
    static int [] arr= new int[k];
    public static void sangnt(){
        arr[0]=1;
        arr[1]=1;
        for (int i = 2;i<k;i++){
            if (arr[i]==0){
                for(int j=2*i;j<k;j+=i){
                    arr[j]=1;
                }
            }
        }
    }
    
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int d =1;
        sangnt();
        for (int i=1;i<k;i++){
            if (arr[i]==0){
                if (d>n) break;
                System.out.print(i+" ");
                d++;
            }
        }
        
    }
}
