package Btt2_hamic;

public class b32a {
    public static int Palindrome(int n)
    {
        int first = n;
        //begin edit
        int sum=0;
        while (n>0){
            int a = n%10;
            n = n/10;
            sum=sum*10+a;
            
        }
        
        return sum;
    }

    public static void main(String args[])
    {
    int n = Integer.parseInt(args[0]);
    System.out.print(Palindrome(n));
    
    
    }
}
