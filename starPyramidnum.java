/*
   1
  123
 12345
1234567
Draw the num Pyramid
 */
import java.util.Scanner;
public class starPyramidnum {
    public static void main(String[] args) {
        int i,j,k,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=2*i-1;k++){    // use formula -> An=1+(n-1)2 || 2n-1
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
