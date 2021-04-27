package exercicios;

import java.time.LocalDate;
import java.time.Month;

public class Gerenciador {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Daniele");
        pessoa1.setDataNascimento(LocalDate.of(1988, Month.JANUARY, 26));
        pessoa1.setAltura(1.65F);
        pessoa1.setAnos();
        pessoa1.print(pessoa1);

        agenda.armazenaPessoa(pessoa1);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Felipe");
        pessoa2.setDataNascimento(LocalDate.of(1985, Month.OCTOBER, 10));
        pessoa2.setAltura(1.75F);
        pessoa2.setAnos();
        pessoa2.print(pessoa2);

        agenda.armazenaPessoa(pessoa2);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Maria");
        pessoa3.setDataNascimento(LocalDate.of(1965, Month.JULY, 19));
        pessoa3.setAltura(1.65F);
        pessoa3.setAnos();
        pessoa3.print(pessoa3);

        agenda.armazenaPessoa(pessoa3);

        Pessoa pessoa4 = new Pessoa();
        pessoa4.setNome("Deise");
        pessoa4.setDataNascimento(LocalDate.of(1991, Month.SEPTEMBER, 5));
        pessoa4.setAltura(1.65F);
        pessoa4.setAnos();
        pessoa4.print(pessoa4);

        agenda.armazenaPessoa(pessoa4);

        Pessoa pessoa5 = new Pessoa();
        pessoa5.setNome("Leandro");
        pessoa5.setDataNascimento(LocalDate.of(1985, Month.MARCH, 22));
        pessoa5.setAltura(1.75F);
        pessoa5.setAnos();
        pessoa5.print(pessoa5);

        agenda.armazenaPessoa(pessoa5);

        Pessoa pessoa6 = new Pessoa();
        pessoa6.setNome("Thiago");
        pessoa6.setDataNascimento(LocalDate.of(2002, Month.MAY, 7));
        pessoa6.setAltura(1.80F);
        pessoa6.setAnos();
        pessoa6.print(pessoa6);

        agenda.armazenaPessoa(pessoa6);

        Pessoa pessoa7 = new Pessoa();
        pessoa7.setNome("Anna");
        pessoa7.setDataNascimento(LocalDate.of(2010, Month.FEBRUARY, 10));
        pessoa7.setAltura(1.60F);
        pessoa7.setAnos();
        pessoa7.print(pessoa7);

        agenda.armazenaPessoa(pessoa7);

        Pessoa pessoa8 = new Pessoa();
        pessoa8.setNome("Sonia");
        pessoa8.setDataNascimento(LocalDate.of(1964, Month.JANUARY, 22));
        pessoa8.setAltura(1.55F);
        pessoa8.setAnos();
        pessoa8.print(pessoa8);

        agenda.armazenaPessoa(pessoa8);

        Pessoa pessoa9 = new Pessoa();
        pessoa9.setNome("Marcondes");
        pessoa9.setDataNascimento(LocalDate.of(1966, Month.OCTOBER, 4));
        pessoa9.setAltura(1.65F);
        pessoa9.setAnos();
        pessoa9.print(pessoa9);

        agenda.armazenaPessoa(pessoa9);

        Pessoa pessoa10 = new Pessoa();
        pessoa10.setNome("Joao");
        pessoa10.setDataNascimento(LocalDate.of(2000, Month.AUGUST, 31));
        pessoa10.setAltura(1.65F);
        pessoa10.setAnos();
        pessoa10.print(pessoa10);

        agenda.armazenaPessoa(pessoa10);

        agenda.print();
        System.out.println("Buscando Pessoa pelo Nome: " + agenda.buscaPessoa("Daniele"));
        agenda.removePessoa("Daniele");
        agenda.print();
    }
}