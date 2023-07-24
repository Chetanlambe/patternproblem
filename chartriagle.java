/*
A
A B
A B C
A B C D
A B C D E
draw the above pattern
 */

import java.util.Scanner;
public class chartriagle {
    public static void main(String[] args) {
        // ASCII value of A=65 & a=97
        int n,i,j,a,d;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the row");
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            a=1;
            for(j=1;j<=i;j++){
              d = a+64; // no 65 is the ASCII value of A
              ch = (char)d; // this number 65 -> give ch = A
                System.out.print(ch+" ");
                a++;
            }
            System.out.println();
        }
    }
}
