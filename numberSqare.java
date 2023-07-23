// print the pattern of the number square
import java.util.Scanner;
public class numberSqare {
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        n = sc.nextInt();
        for(i=1;i<n;i++){
            for(j=1;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
