package exercicios;

import java.util.ArrayList;
import java.util.List;

public class Agenda extends Pessoa {


    private List<Pessoa> pessoas = new ArrayList<>();

    public void armazenaPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public Pessoa buscaPessoa(String nome) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().equals(nome)) {
                return pessoa;
            }
        }
        return null;
    }

    public void removePessoa(String nome) {
        for (int i = 0; i < pessoas.size(); i++) {
            Pessoa p = pessoas.get(i);
            if (p.getNome().equals(nome)) {
                pessoas.remove(p);
                break;
            }
        }
    }

    public void print() {
        System.out.println("Imprimir Lista de contatos: " + pessoas);
    }


}
