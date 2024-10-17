import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome){
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }

    public void removerConta(Conta conta) {
        Conta contaASerRemovida = null;
        if(!contas.isEmpty()){
            for(Conta c : contas){
                if (c.equals(conta)){
                    contaASerRemovida = c;
                    break;
                }
            }
            if (contaASerRemovida != null) {
                contas.remove(contaASerRemovida);
            } else {
                System.out.println("A conta inserida não foi encontrada.");
            }
        } else {
            System.out.println("Não existem contas nesse banco.");
        }
    }

    public void listarContasDoCpf(String cpf) {
        if(!contas.isEmpty()){
            List<Conta> listarContasCpf = contas.stream().filter(n -> n.getCliente().getCpf().equals(cpf)).toList();
            if(!listarContasCpf.isEmpty()){
                for(Conta conta : listarContasCpf){
                    System.out.println(conta);
                }
            } else {
                System.out.println("Não existem contas cadastradas com esse cpf.");
            }
        } else {
            System.out.println("Não existem contas nesse banco.");
        }
    }
}
