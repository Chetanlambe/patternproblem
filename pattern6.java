/*
1 1 1 1 1
1 1 1 2 2
1 1 3 3 3
1 4 4 4 4
5 5 5 5 5
draw the above pattern
 */
import java.util.Scanner;
public class pattern20 {
    public static void main(String[] args) {
        int n,i,k,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of the row");
        n = sc.nextInt();
        for(i=1;i<=n;i++) {
            for (j = n; j > i; j--) {
                System.out.print(1 + " ");
            }
            for (k = 1; k <=i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }


    }
}
