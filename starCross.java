/*
 *   *
  * *
   *
 *  *
*    *
* draw the above star pattern

 */
import java.util.Scanner;
public class starCross {
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row");
        n= sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i==j || i+j==n+1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
