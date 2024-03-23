package Btt3_hamic;
import java.util.Scanner;

public class bai41 {
    public static int [] inputArr(int []a,Scanner sc){
        for (int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
     
       }
       return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        inputArr(arr,sc);
        System.out.println(arr[-1]);
        printarr(arr);
    }

    public static void printarr(int a[]){
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void findMax(int a[]){
        // cau b
        int max = a[0];
        for (int i=1;i<a.length;i++){
            if ( a[i] >max ) {
                max = a[i];
            }
        }
        System.out.println("max la: "+max);
    }

    public static void sumArr(int a[]){
        // cau c
        int sum = 0;
        for (int i=0;i<a.length;i++){
            sum+= a[i];
        }
        System.out.println("sum of arr la: "+sum);
    }

    public static void bb_sort(int arr[]){
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j<arr.length-i ;j++){
                if (arr[j]>arr[j+1]) {
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    public static int [] fake_arr(int arr[]){
        int n = arr.length;
        int [] fa = new int[n];
        for(int i = 0 ;i < n;i++){
            fa[i] = Integer.MAX_VALUE;
        }
        int j=1;
        fa[0] = arr[0];
        for(int i=1;i<n;i++){
            if (arr[i] > arr[i-1]){
               fa[j] = arr[i];
               j++; 
            }
        }
        
       return fa;
    }

    public static void findMinK(int[] a, int k){
        // cau d
        bb_sort(a);
        int [] fa = fake_arr(a);

        if ( fa[k-1] != Integer.MAX_VALUE) {
            System.out.println(fa[k-1]);
        } else {
            System.out.println("khong ton tai");
        }

    }

    public static boolean checkISeq(int []a){
        // cau e
        for (int i=1;i<a.length;i++){
            if (a[i] <= a[i-1]) return false;
        }
        return true;
    }
    public static void decrease_sort(int arr[]){
        //cau f
        for(int i = 0; i < arr.length;i++){
            for(int j = 0; j<arr.length-i ;j++){
                if (arr[j]<arr[j+1]) {
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

}
