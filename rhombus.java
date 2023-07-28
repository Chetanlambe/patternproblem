/*
    ****
   ****
  ****
 ****
drow the rhombus
 */
import java.util.Scanner;
public class rhombus {
    public static void main(String[] args) {
        int i,j,n,k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=n;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
