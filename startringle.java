// print the startringle pattern

import java.util.Scanner;
public class startringle {
    public static void main(String[] args) {
        int n,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the row");
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
