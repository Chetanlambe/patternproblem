/*
1
01
101
0101
Draw the bove pattern
 */
import java.util.Scanner;
public class zeroAndoneTriagle {
    public static void main(String[] args) {
        int i,j,n,a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            if(i%2!=0)
                a = 1;
            else
                a = 0;
            for(j=1;j<=i;j++){
                System.out.print(a+" ");
                if(a==0) a=1;
                else a=0;
            }
            System.out.println();
        }

    }
}
