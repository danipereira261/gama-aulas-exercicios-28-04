package exercicios;

public class MainElevador {

    public static void main(String[] args) {

        System.out.println("Exemplo 1");
        Elevador exemplo1 = new Elevador();
        exemplo1.inicializa(6,26, 0, 0);
        exemplo1.entra(3);
        exemplo1.sobe(4);
        exemplo1.sai(1);
        exemplo1.desce(3);

        System.out.println("------------------------------------");

        System.out.println("Exemplo 2");
        Elevador exemplo2 = new Elevador();
        exemplo2.inicializa(6,26, 0, 0);
        exemplo2.entra(7);
        exemplo2.sobe(27);
        exemplo2.sai(8);
        exemplo2.desce(-1);

        System.out.println("------------------------------------");

        System.out.println("Exemplo 3");
        Elevador exemplo3 = new Elevador();
        exemplo3.inicializa(6,26, 2, 0);
        exemplo3.entra(5);
        exemplo3.sobe(27);
        exemplo3.sai(8);
        exemplo3.desce(-1);
    }
}
