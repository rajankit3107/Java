import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {

        int principal = (int) readNumber("Principal: ", 1000, 1000000);
        float annualInterest = (float) readNumber("Annual Interest: ", 1, 30);
        byte period = (byte) readNumber("Period(Years): ", 1, 30);

        double mortgage = calculateMortgage(principal, annualInterest, period);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Your Monthly Mortgage will be: " + mortgageFormatted);
    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextDouble();
            if(value >= min && value <= max)
                break;
            System.out.println("Enter a value between" + min + " and " + max);
        }
        return value;
    }

    public static double calculateMortgage(int principal, double annualInterest, byte years) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);
        double monthlyInterest = annualInterest/PERCENT/MONTHS_IN_YEAR;
        double mortgage = principal *
                (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) /
                (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }
}
