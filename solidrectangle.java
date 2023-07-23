//print solid rectange & taken the input from the user
import java.util.Scanner;
public class solidrectangle {
    public static void main(String[] args) {
        int n,i,m,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter th number of row");
        n = sc.nextInt();// n is denoted by the row
        System.out.println("enter the number of column");
        m = sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=m;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
