/*
      A
    A B
  A B C
A B C D
draw th above pattern
 */
import java.util.Scanner;
public class abcrevTrigle {
    public static void main(String[] args) {
        int i,j,k,a,n,d;
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            a = 1;
            for(j=1;j<=i;j++){
                d = a+64;
                char ch = (char)d;
                System.out.print(ch+" ");
                a++;
            }
            System.out.println();
        }
    }
}
