package Btt3_hamic;
import java.util.Scanner;
public class bai4_2c {
  

    public static void main (String[] args) {
       Scanner keyboard = new Scanner(System.in);
       int n = keyboard.nextInt();
       int m = keyboard.nextInt();
       int a[][] = new int[n][m];
       inputMatrix(a,keyboard);
       int arr[] = sumColumns(a);
       print_indexArray(arr);
    }
    
   public static void inputMatrix(int[][] matrix, Scanner keyboard) {
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j< matrix[i].length;j++){
                matrix[i][j] = keyboard.nextInt();
            }
        }
    }
    
    public static int[] sumColumns(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[1].length;
        int arr[] = new int[m];
        for (int i =0 ;i< m;i++){
            for (int j=0;j<n;j++){
                arr[i] += matrix[j][i];
            }
        }
        return arr;
    }
    
    public static void print_indexArray(int[] a) {
        int max = a[0];
        int max2= Integer.MIN_VALUE;
        int idx =-1;
        for (int i =1 ;i<a.length;i++){
            if (max < a[i]) max = a[i];
        }
        for (int i=0 ;i<a.length;i++){
            if (max2 <a[i] && a[i]!=max) {
                max2 = a[i];
                idx = i;
            }
        }
        System.out.println(idx);
    }

}

