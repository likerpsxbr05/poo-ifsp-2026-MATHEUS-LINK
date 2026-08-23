import java.util.Scanner;

import static java.lang.Math.pow;

public class Loops_II {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int termo  = a;

            for(int k = 0; k < n; k++){
                int conta = ((int)Math.pow(2,k) * b);
                termo = termo + conta;
                System.out.printf("%d ",termo);
            }

            System.out.printf("\n");
        }


        in.close();
    }
}
