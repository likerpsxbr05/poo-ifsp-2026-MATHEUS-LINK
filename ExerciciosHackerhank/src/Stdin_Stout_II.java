import java.util.Scanner;

public class Stdin_Stout_II {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        int resultado;
        if(2 <= numero && numero <= 20){
            for(int i = 1; i <=10; i++){
                resultado = numero * i;
                System.out.printf("%d x %d = %d\n",numero ,i ,resultado);
            }
        }

    }
}
