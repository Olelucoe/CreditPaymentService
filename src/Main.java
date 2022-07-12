public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        double payment = service.calculate(1000000, 9.99, 12);
        System.out.println("Ежемесячный платёж составит: " + payment);

    }
}
