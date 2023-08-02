/*
1234567
123 567
12   67
1     7
Draw the above pattern
 */
import java.util.Scanner;
public class pyramidUltaNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of row");
        n = sc.nextInt();
        int nst = n;
        int nsp = 1;
        for(int i=1;i<=2*n+1;i++){
            System.out.print(i);
        }
        System.out.println();
        for(int i=1;i<=n;i++){
            int a = 1;
            for(int j=1;j<=nst;j++){
                System.out.print(a);
                a++;
            }
            for(int k=1;k<=nsp;k++){
                System.out.print(" ");
                a++;
            }
            for(int j=1;j<=nst;j++){
                System.out.print(a);
                a++;
            }
            nsp +=2;
            nst--;
            System.out.println();
        }
    }
}
