// Print star triangle reverse

import java.util.Scanner;
public class startringlerevrese {
    public static void main(String[] args) {
        int n,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        n = sc.nextInt();
        for(i=n;i>=1;i--){
            for(j=i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
