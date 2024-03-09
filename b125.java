package Btt1_hamic;

public class b125 {
    public static void main(String[] args) {
      String c = args[0];
      char a = c.charAt(0);
      char b = c.charAt(1);
      a = Character.toLowerCase(a);
      b = Character.toLowerCase(b);
      System.out.print(Math.abs(a-b));
    }
}
