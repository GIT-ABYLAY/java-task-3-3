public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int totalAmount = 1_000_000; // totalAmount
        int monthAmount = 36;// monthAmount
        double monthlyPercentCoefficent = 0.008325; // monthly Percent Coefficent Calculeted by 9.99/(100*12)
        double base = 1 + monthlyPercentCoefficent;
        double exponent = monthAmount;
        double monthlyCoefficent = Math.pow(base, exponent);
        double mounthlyPayment = service.calculate(totalAmount, monthlyPercentCoefficent, monthlyCoefficent);
        System.out.println(mounthlyPayment);
    }

}