/*
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
draw the above pattern
 */
import java.util.Scanner;
public class pattern22 {
    public static void main(String[] args) {
        int n,j,i,k;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row");
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=n;j>i;j--){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }


    }
}
