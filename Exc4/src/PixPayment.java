import java.util.UUID;
class PixPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String pixCode = UUID.randomUUID().toString();
        System.out.println("Pagamento via Pix realizado.");
        System.out.println("Código Pix: " + pixCode);
    }
}