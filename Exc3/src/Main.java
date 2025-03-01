import org.example.ContaInvestimento;
import org.example.ContaInvestimentoAltoNivel;
import org.example.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        ContaPoupanca contaPoupanca = new ContaPoupanca(123456789, "Ines Brasil", 1934);
        ContaInvestimento contaInvestimento = new ContaInvestimento(987654321, "Saori Kido", 3271);
        ContaInvestimentoAltoNivel contaAltoNivel = new ContaInvestimentoAltoNivel(124578369, "Lucas Emanuel", 9999999);


        System.out.println("Informações\n\n");
        contaPoupanca.exibirInformacoes();
        contaInvestimento.exibirInformacoes();
        contaAltoNivel.exibirInformacoes();


        System.out.println("\nInes Brasil depositou R$ 5000 na Poupança.\n");
        contaPoupanca.depositar(1000);
        contaPoupanca.exibirInformacoes();


        System.out.println("\nSaori Kido saca R$ 2000 da Conta Investimento.\n");
        contaInvestimento.sacar(2000);
        contaInvestimento.exibirInformacoes();


        System.out.println("\nLucas saca R$ 3000 da Conta Alto Nível.");
        contaAltoNivel.sacar(3000);
        System.out.println("\nLucas saca R$ 100.000 da Conta Alto Nível.");
        contaAltoNivel.sacar(100000);
        contaAltoNivel.exibirInformacoes();
    }
}