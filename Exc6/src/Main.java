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
        scanner.nextLine(); // Consumir quebra de linha

        System.out.print("Digite o valor da transação: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        String type;
        switch (option) {
            case 1:
                type = "pix";
                break;
            case 2:
                type = "cartao";
                break;
            case 3:
                type = "boleto";
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        PaymentStrategy strategy = PaymentFactory.createPayment(type);
        PaymentProcessor processor = new PaymentProcessor(strategy);
        processor.process(amount);
    }
}