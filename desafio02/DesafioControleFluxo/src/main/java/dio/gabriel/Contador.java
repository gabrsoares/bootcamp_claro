package dio.gabriel;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametro01 = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametro02 = terminal.nextInt();

        try {
            contar(parametro01, parametro02);
        } catch (ParametrosInvalidosException exception){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    static void contar (int primParametro, int segParametro) throws ParametrosInvalidosException {
        if(primParametro > segParametro){
            throw new ParametrosInvalidosException();
        }
        int contagem = segParametro - primParametro;
        for (int i = 1; i <= contagem; i++){
            System.out.println("Imprimnindo o número " + i);
        }
    }
}