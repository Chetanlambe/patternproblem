/*
    1
   121
  12321
 1234321
123454321
 */
import java.util.Scanner;
public class pattern17 {
    public static void main(String[] args) {
        int i,j,l,rows,k;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row");
        rows =sc.nextInt();

        for (i = 1; i <= rows; i++)
        {
            for (j = rows; j > i; j--)
            {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++)
            {
                System.out.print(k);
            }
            for (l = i - 1; l >= 1; l--)
            {
                System.out.print(l);
            }
            System.out.println();
        }

    }
}
