public class CreditPaymentService {
    public double calculate(double summ, double percent, double month) {
        double r = (percent / 12) / 100;
        double n = 1 + r;
        double payment = summ * ((r * Math.pow(n, month))/(Math.pow(n, month) - 1));
        return payment;
    }
}
