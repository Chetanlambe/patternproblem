/*
     *
     *
 * * * * *
     *
     *
Draw the above pattern
 */
import java.util.Scanner;
public class starplus {
    public static void main(String[] args) {
        int n,i,j,a,d;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row only odd number");
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                a = n/2+1;   // if we enter n=5 -> 5/2+1 = 3
                if(j==a || i==a)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }
}
