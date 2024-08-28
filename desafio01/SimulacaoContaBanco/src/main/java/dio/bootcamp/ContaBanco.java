package dio.bootcamp;

import java.util.Scanner;

public class ContaBanco {
    private int numero;
    private String agencia;
    private String nome;
    private float saldo;

    Scanner teclado = new Scanner(System.in);

    public ContaBanco() {
        criarConta();
    }

    public void criarConta(){
        System.out.println("Cadastro do cliente");
        System.out.println("Por favor, insira o número da agência: ");
        this.numero = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Insira a agência: ");
        this.agencia = teclado.nextLine();
        System.out.println("Insira o nome do cliente: ");
        this.nome = teclado.nextLine();
        System.out.println("Deposite um valor inicial: ");
        this.saldo = teclado.nextFloat();

        mensagemBoasVindas();
    }

    private void mensagemBoasVindas(){
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência" +
                        " é %s , conta %d e seu saldo R$%.2f já está disponível para saque."
                , this.nome, this.agencia, this.numero, this.saldo);
    }

}
