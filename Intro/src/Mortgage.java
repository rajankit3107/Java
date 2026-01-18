import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal Amount: ");
        int principal = scanner.nextInt();

        System.out.print("Enter the Annual Rate of Interest: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest/PERCENT/MONTHS_IN_YEAR;

        System.out.print("Enter the period of Mortgage: ");
        byte period = scanner.nextByte();
        int numberOfPayments = period * MONTHS_IN_YEAR;


        double mortgage = principal *
                (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) /
                (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Your Monthly Mortgage will be: " + mortgageFormatted);
    }
}
