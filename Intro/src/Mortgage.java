import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {

        int principal = (int) readNumber("Principal: ", 1000, 1000000);
        float annualInterest = (float) readNumber("Annual Interest: ", 1, 30);
        byte period = (byte) readNumber("Period(Years): ", 1, 30);

        printMortgage(principal, annualInterest, period);
        printPaymentSchedule(period, principal, annualInterest);
    }

    private static void printMortgage(int principal, float annualInterest, byte period) {
        double mortgage = calculateMortgage(principal, annualInterest, period);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("Monthly Payments: " + mortgageFormatted);
        System.out.println("-----------------");
    }

    private static void printPaymentSchedule(byte period, int principal, float annualInterest) {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("-----------------");
        for(short month = 1; month <= period * MONTHS_IN_YEAR ; month++) {
            double balance = calculateBalance(principal, annualInterest, period, month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
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

    public static double calculateBalance(int principal, double annualInterest, byte years, short numberOfPaymentsMade) {
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);
        double monthlyInterest = annualInterest/PERCENT/MONTHS_IN_YEAR;
        return principal*
                (Math.pow(1+monthlyInterest, numberOfPayments) - Math.pow(1+monthlyInterest, numberOfPaymentsMade))/
                (Math.pow(1+monthlyInterest, numberOfPayments) - 1);
    }

    public static double calculateMortgage(int principal, double annualInterest, byte years) {

        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);
        double monthlyInterest = annualInterest/PERCENT/MONTHS_IN_YEAR;
        return principal *
                (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) /
                (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }
}
