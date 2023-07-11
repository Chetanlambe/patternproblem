/*
    5
   4 5
  3 4 5
 2 3 4 5
1 2 3 4 5

 */
import java.util.Scanner;
public class pattern16 {
    public static void main(String[] args) {
        int n,i,j,k;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of the row");
        n=sc.nextInt();
        for(i=n;i>=1;i--){
            for(j=1;j<i;j++){
                System.out.print(" ");
            }
            for(k=i;k<=n;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
