public class CreditPaymentService {
    public double calculate(int totalAmount, double monthlyPercentCoefficent, double monthlyCoefficent) {

        double result;
        {
            result = totalAmount * monthlyPercentCoefficent * monthlyCoefficent / (monthlyCoefficent - 1);
        }
        return result;
    }
}
