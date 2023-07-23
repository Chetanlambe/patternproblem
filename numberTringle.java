// print the numberTringle show in below
/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */

import java.util.Scanner;
public class numberTringle {
    public static void main(String[] args) {
        int n,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row");
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
