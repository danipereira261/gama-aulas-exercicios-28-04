package exercicio1;

import java.time.LocalDate;

public class Pessoa {

    private String nome;
    private LocalDate dataNascimento;
    private Integer anos;
    private Float altura;

    private Integer getIdadePessoa(LocalDate dataNascimento) {
        return LocalDate.now().compareTo(dataNascimento);
    }

    @Override
    public String toString() {
        return "{nome = " + nome + '\'' +
                ", '" + anos + " anos'," +
                "'altura = " + altura + "'}";
    }

    public void print(Object o) {
        System.out.println(o.toString());
    }

    public Pessoa() {
    }

    public Pessoa(String nome, LocalDate dataNascimento, Integer anos, Float altura) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.anos = anos;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getAnos() {
        return anos;
    }

    public void setAnos() {

        this.anos = getIdadePessoa(this.getDataNascimento());
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }
}