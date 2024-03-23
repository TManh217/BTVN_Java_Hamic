package Btt3_hamic;

import java.util.Scanner;

class sangnt {
   
    public static void sangnt(int arr[],int k){
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
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int arr[] = new int[b+1];
        sangnt(arr,b);
        for (int i=a;i<=b;i++){
            if (arr[i] == 0) System.out.print(i+" ");
        }
        
    }
}