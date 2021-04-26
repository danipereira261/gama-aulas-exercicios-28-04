package exercicio1;

import java.time.LocalDate;
import java.time.Month;

public class ExercicioUm {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Daniele");
        pessoa.setDataNascimento(LocalDate.of(1988, Month.JANUARY, 26));
        pessoa.setAltura(1.65F);
        pessoa.setAnos();
        pessoa.print(pessoa);
    }
}
