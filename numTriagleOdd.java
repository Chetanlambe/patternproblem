/*
1
3 5
7 9 11
13 15 17 19
draw the above pattern
 */
import java.util.Scanner;
public class numTriagleOdd {
    public static void main(String[] args) {
        int i,j,k,n;
        k = 1;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number row");
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(k+" ");
                k=k+2;
            }
            System.out.println();
        }

    }
}
