/*
    *
   ***
  *****
 *******
Draw the star pyramid
 */
import java.util.Scanner;
public class starPyramid {
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
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
