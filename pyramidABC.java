/*
      A
    A B C
  A B C D E
A B C D E F G
draw the above ABC pyramid
 */
import java.util.Scanner;
public class pyramisABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,j,k,a,d;
        char ch;
        System.out.println("Enter the number of row");
        n =sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            a = 1;
            for(k=1;k<=2*i-1;k++){
                d = a + 64;
                ch = (char)d;
                System.out.print(ch+" ");
                a++;
            }
            System.out.println();
        }
    }
}
