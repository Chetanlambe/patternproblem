/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
Draw the above pattern
 */
import java.util.Scanner;
public class numTriangle {
    public static void main(String[] args) {
        int i,j,k,n;
        k = 1;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of row");
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
