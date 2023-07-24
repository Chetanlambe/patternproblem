/*
 ******
 *    *
 *    *
 ******
draw the above hollow rectangle pattern
 */
import java.util.Scanner;
public class solidBorderRectangle {
    public static void main(String[] args) {
        int i,j,n,m;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of row");
        n = sc.nextInt();
        System.out.println("Enter the number of the column");
        m = sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=m;j++){
                if(i==1 || i==n || j==1 || j==m){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
