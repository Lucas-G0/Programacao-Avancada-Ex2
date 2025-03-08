import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o tipo de notificação:");
        System.out.println("1: Email");
        System.out.println("2: SMS");
        System.out.println("3: Push Notification");
        System.out.print("Opção: ");

        int option = scanner.nextInt();
        scanner.nextLine(); // Consumir quebra de linha

        System.out.print("Digite a mensagem: ");
        String message = scanner.nextLine();

        String type;
        switch (option) {
            case 1:
                type = "email";
                break;
            case 2:
                type = "sms";
                break;
            case 3:
                type = "push";
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        Notification notification = NotificationFactory.createNotification(type);
        notification.send(message);
    }
}