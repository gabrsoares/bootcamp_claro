public class Main {
    public static void main(String[] args) {

        ContaPoupanca cp1 = new ContaPoupanca(new Cliente("Gabriel", "123456"));
        ContaCorrente cc1 = new ContaCorrente(new Cliente("Gabriel", "123456"));

        cc1.depositar(1500);
        cc1.transferir(1000, cp1);

        ContaPoupanca cp2 = new ContaPoupanca(new Cliente("Joao", "555555"));
        ContaCorrente cc2 = new ContaCorrente(new Cliente("Joao", "555555"));

        ContaPoupanca cp3 = new ContaPoupanca(new Cliente("Joao", "222222"));
        ContaCorrente cc3 = new ContaCorrente(new Cliente("Joao", "222222"));

        cp1.imprimirInfosComuns();
        cp1.imprimirExtrato();

        Banco b1 = new Banco("Banco123");

        b1.adicionarConta(cp1);
        b1.adicionarConta(cc1);

        b1.adicionarConta(cp2);
        b1.adicionarConta(cc2);

        b1.removerConta(cc3);

        b1.listarContasDoCpf("123456");
        b1.listarContasDoCpf("158535");

        Banco b2 = new Banco("Banco444");

        b2.removerConta(cc1);
    }
}
