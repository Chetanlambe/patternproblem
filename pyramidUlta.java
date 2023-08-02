/*
 *********
 **** ****
 ***   ***
 **     **
 *       *
Draw the above pattern
 */
import java.util.Scanner;
public class pyramidUlta {
    public static void main(String[] args) {
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of row");
        n =  sc.nextInt();
        for(int i=1;i<=2*n+1;i++){
            System.out.print("*");
        }
        System.out.println();
        int nst = n;
        int nsp = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
            for(int k=1;k<=nsp;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=nst;j++){
                System.out.print("*");
            }
            nst--;
            nsp+=2;
            System.out.println();
        }

    }
}
