package Estudo;

import javax.lang.model.type.NullType;
import java.util.Scanner;
import java.util.*;

public class Cliente {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = teclado.nextLine();

        ContaBancaria usuario = new ContaBancaria(nome);

        System.out.println("Escolha o numero da sua conta");
        int numero = teclado.nextInt();

        usuario.setNumeroConta(numero);
        System.out.println("Esse é o numero da sua conta de agr em diante" + usuario.getNumeroConta());

       /* ArrayList<String> array = new ArrayList<>();

        while(true){
            String entrada = teclado.nextLine();
           if(entrada != " "){
               break;
           }else{
               array.add(entrada);
           }

        }*/

        double[] array = new double[10];

        char opcao;

        do{
            System.out.println(usuario.getTitular() + " oque vc gostaria de fazer: ");
            System.out.println("    Deposito:(A)");
            System.out.println("    Saque:(B)");
            System.out.println("    Sair:(S)");
            opcao = teclado.next().charAt(0);

        switch (opcao) {
            case 'A':
            case 'a':
                System.out.println("Qual o valor a depositar: ");
                usuario.depositar(teclado.nextDouble());
                System.out.println("Saldo: " + usuario.getSaldo());
                System.out.println("Divida: " + usuario.getDivida());
                break;

            case 'B':
            case 'b':
                System.out.println("Qual o valor a sacar: ");
                usuario.sacar(teclado.nextDouble());
                System.out.println("Saldo: " + usuario.getSaldo());
                System.out.println("Divida: " + usuario.getDivida());
                break;

            case 'S':
            case 's':
                System.out.println("Encerrando, ate breve");
                System.out.println("Saldo: " + usuario.getSaldo());
                System.out.println("Divida: " + usuario.getDivida());
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }
        }while(opcao != 'S');


    }
}
