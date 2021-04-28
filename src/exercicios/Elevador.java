package exercicios;

public class Elevador implements FuncionalidadesElevador {

    private Integer andarAtual;
    private Integer totalDeAndares;
    private Integer capacidadeDoElevador;
    private Integer pessoasPresentes;

    public Elevador() {
    }

    public Elevador(Integer andarAtual, Integer totalDeAndares, Integer capacidadeDoElevador, Integer pessoasPresentes) {
        this.andarAtual = andarAtual;
        this.totalDeAndares = totalDeAndares;
        this.capacidadeDoElevador = capacidadeDoElevador;
        this.pessoasPresentes = pessoasPresentes;
    }

    public Integer getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(Integer andarAtual) {
        this.andarAtual = andarAtual;
    }

    public Integer getTotalDeAndares() {
        return totalDeAndares;
    }

    public void setTotalDeAndares(Integer totalDeAndares) {
        this.totalDeAndares = totalDeAndares;
    }

    public Integer getCapacidadeDoElevador() {
        return capacidadeDoElevador;
    }

    public void setCapacidadeDoElevador(Integer capacidadeDoElevador) {
        this.capacidadeDoElevador = capacidadeDoElevador;
    }

    public Integer getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(Integer pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }


    @Override
    public void inicializa(Integer capacidadeDoElevador, Integer andares, Integer pessoasPresentes, Integer andarAtual) {
        setCapacidadeDoElevador(capacidadeDoElevador);
        setTotalDeAndares(andares);
        setPessoasPresentes(pessoasPresentes);
        setAndarAtual(andarAtual);
    }

    @Override
    public void entra(Integer quantidadeDePessoas) {
        if (quantidadeDePessoas < this.capacidadeDoElevador) {
            if ((quantidadeDePessoas + this.pessoasPresentes) > this.capacidadeDoElevador) {
                System.out.println("Error:Capacidade máxima atingida, pois existem: " + this.pessoasPresentes + " pessoas presentes e " + quantidadeDePessoas + " querem entrar.");
            } else {
                this.pessoasPresentes += quantidadeDePessoas;
                System.out.println("Entrou: " + quantidadeDePessoas + ", total de pessoas no elevador: " + this.pessoasPresentes);
            }
        } else {
            System.out.println("Capacidade máxima atingida!");
        }
    }

    @Override
    public void sai(Integer quantidadeDePessoas) {
        if (this.pessoasPresentes >= quantidadeDePessoas) {
            this.pessoasPresentes -= quantidadeDePessoas;
            System.out.println("Saiu " + quantidadeDePessoas + " Pessoa(as)");
        } else {
            System.out.println("Error: Quantidade de pessoas a sair maior que a quantidade de pessoas dentro do elevador");
        }
    }

    @Override
    public void sobe(Integer andarDesejado) {
        if (andarDesejado > this.totalDeAndares) {
            System.out.println("Error: Não é possivel subir!");
        } else {
            System.out.println("Subindo para o andar :" + andarDesejado);
            this.andarAtual = andarDesejado;
        }
    }

    @Override
    public void desce(Integer andarDesejado) {
        if (andarDesejado < 0) {
            System.out.println("Error: Não é possivel descer");
        } else {
            System.out.println("Descendo para o andar :" + andarDesejado);
            this.andarAtual = andarDesejado;
        }
    }
}
