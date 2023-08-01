/*
    *
   ***
  *****
 *******
  *****
   ***
    *
Draw the diamond pattern
 */

import java.util.Scanner;
public class diamondStar {
    public static void main(String[] args) {
        int n,i,j,k;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 0f row");
        n = sc.nextInt();
        int nst = 1;
        int nsp = n/2;
        int ml = n/2+1;
        for(i=1;i<=n;i++){
            for(j=1;j<=nsp;j++){      // if n=7 -> nsp = n/2 -> 7/2= 3
                System.out.print(" ");
            }
            for(k=1;k<=nst;k++){      // nst = 1
                System.out.print("*");
            }
            if(i<ml){      // middle line ml = (n/2+1)
                nsp--;
                nst += 2;
            }else{
                nsp++;
                nst -= 2;
            }
            System.out.println();
        }
    }
}
