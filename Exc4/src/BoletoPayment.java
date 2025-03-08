class BoletoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String boletoCode = "23791.12345 67890.123456 54321.678901 2 12345678901234";
        System.out.println("Pagamento via Boleto gerado.");
        System.out.println("Código do Boleto: " + boletoCode);
    }
}