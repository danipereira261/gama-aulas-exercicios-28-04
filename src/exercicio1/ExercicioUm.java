package exercicio1;

import java.util.Scanner;

public class ExercicioUm {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scan.next();

        System.out.println("Digite sua data de nascimento, sem pontos e sem traços");
        String dataNascimento = scan.next();

        System.out.println(pessoa.getIdadePessoa(dataNascimento));

        System.out.println("Digite sua altura");
        Float altura = scan.nextFloat();

    }
}
