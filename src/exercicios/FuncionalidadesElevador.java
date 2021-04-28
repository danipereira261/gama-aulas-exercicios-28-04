package exercicios;

public interface FuncionalidadesElevador {

    void inicializa(Integer capacidadeDoElevador, Integer andares, Integer pessoasPresentes, Integer andarAtual);

    void entra(Integer pessoas);

    void sai(Integer pessoa);

    void sobe(Integer andarDesejado);

    void desce(Integer andarDesejado);

}
