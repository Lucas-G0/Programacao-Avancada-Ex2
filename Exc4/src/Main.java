import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o método de pagamento:");
        System.out.println("1: Pix");
        System.out.println("2: Cartão de Crédito");
        System.out.println("3: Boleto");
        System.out.print("Opção: ");

        int option = scanner.nextInt();
        System.out.print("Digite o valor da transação: ");
        double amount = scanner.nextDouble();

        PaymentStrategy strategy = null;
        switch (option) {
            case 1:
                strategy = new PixPayment();
                break;
            case 2:
                strategy = new CreditCardPayment();
                break;
            case 3:
                strategy = new BoletoPayment();
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        PaymentProcessor processor = new PaymentProcessor(strategy);
        processor.process(amount);
    }
}