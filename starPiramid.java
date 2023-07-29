/*
    *
   ***
  *****
 *******
Draw the star pyramid pattern
 */
import java.util.Scanner;
public class starPiramid {
    public static void main(String[] args) {
        int i,j,k,n,nst;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        n = sc.nextInt();
        nst = 1;   // nst means number of star
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=nst;k++){
                System.out.print("*");
            }
            nst = nst+2;
            System.out.println();
        }
    }
}
