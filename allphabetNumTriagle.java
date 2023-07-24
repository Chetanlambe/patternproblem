/*
1
A B
1 2 3
A B C D
1 2 3 4 5
A B C D E F
draw the above pattern
 */

import java.util.Scanner;
public class allphabetNumTriagle {
    public static void main(String[] args) {
        int a,d,i,j,n;
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row");
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            a=1;
            if(i%2==0){
                for(j=1;j<=i;j++){
                    d = a+64;
                    ch = (char)d;
                    System.out.print(ch+" ");
                    a++;
                }
            }else{
                for(j=1;j<=i;j++){
                    System.out.print(j+" ");
                }
            }
            System.out.println();


        }

    }
}
