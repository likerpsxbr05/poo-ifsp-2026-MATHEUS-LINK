import java.util.Scanner;

public class Output_Formatting {
    public static void main(String[] args) {

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner teclado = new Scanner(System.in);
        String a[] = new String[3];
        int b[] = new int[3];
        for(int i = 0 ; i<3 ; i++){
            a[i] = teclado.next();
            b[i] = teclado.nextInt();

        }
        System.out.println("================================");
        for(int i = 0 ; i<3 ; i++){
            System.out.printf("%-15s%03d\n",a[i],b[i]);

        }
        System.out.println("================================");


    }
}
