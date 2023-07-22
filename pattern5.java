
/*
1 0 0 0 0
0 2 0 0 0
0 0 3 0 0
0 0 0 4 0
0 0 0 0 5
draw the above pattern
 */
import java.util.Scanner;
public class pattern19 {
    public static void main(String[] args) {
        int n,i,j,k;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of row");
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<i;j++){
                System.out.print("0 ");
            }
            System.out.print(i+" ");
            for(k=i;k<n;k++){
                System.out.print(0+" ");
            }
            System.out.println();
        }

    }
}
