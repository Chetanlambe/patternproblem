/*
   1
  121
 12321
1234321
Draw the above pattern
 */
import java.util.Scanner;
public class pyramidnumUD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j,k,n,a,l;
        System.out.println("enter the number of row");
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(k=1;k<=i;k++){
                System.out.print(k);
            }
            a = i-1;
            for(l=1;l<=i-1;l++){
                System.out.print(a);
                a--;
            }
            System.out.println();
        }

    }
}
