import java.util.Scanner;

public class End_of_File {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int linha = 1;

        while (teclado.hasNextLine()) {
            String texto = teclado.nextLine();
            System.out.println(linha + " " + texto);
            linha++;
        }

        teclado.close();
    }
}
