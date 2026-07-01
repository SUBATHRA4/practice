import java.util.*;

public class BinaryToInteger {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int i=0,sum=0;
      while(n>0){
        int digit=n%10;
        sum +=digit*(Math.pow(2,i));
        n=n/10;
        i++;
      }
      System.out.println(sum);
    }
}