/*
A B C D
A B C D
A B C D
A B C D
draw the above code
 */
import java.util.Scanner;
public class charrectangle {
    public static void main(String[] args) {
        // ASCII value of A = 65 & a = 97
        int n,i,j,a,d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            a = 1;
            for(j=1;j<=n;j++){
                d = a+64;
                char ch = (char)d;
                System.out.print(ch+" ");
                a++;
            }
            System.out.println();
        }

    }
}
