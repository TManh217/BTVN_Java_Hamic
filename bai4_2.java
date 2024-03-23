package Btt3_hamic;

import java.util.Scanner;

public class bai4_2 {
    static  int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       int n = keyboard.nextInt();
       int m = keyboard.nextInt();
       int a[][] = new int[n][m];
       inputMatrix(a,keyboard);
       
    }
    
    public static void inputMatrix(int[][] matrix, Scanner keyboard) { // cau a
       
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j< matrix[i].length;j++){
                matrix[i][j] = keyboard.nextInt();
                if ( max < matrix[i][j]) max = matrix[i][j]; // cau b
            }
        }
    }

    public static int[][] mtvuong(int [][]matrix){ // cau d
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if (j<i) matrix[i][j] =0;
            }
        }
        return matrix;

    }
    public static void print(int[][] matrix) {
        for (int i=0;i< matrix.length;i++){
           for (int j=0;j< matrix[i].length;j++){
              System.out.print(matrix[i][j]+" ");
           }
       System.out.println();
       }
   }
}