/*
1
1 0
1 0 1
1 0 1 0
1 0 1 0 1
draw the above pattern
 */

import java.util.Scanner;
public class pattern18 {
    public static void main(String[] args) {
        int n,i,j;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of row");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(j%2 +" ");
            }
            System.out.println();
        }

    }
}
