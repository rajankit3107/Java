import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String message = "Hello world" + "!!";
        int[][] numbers = new int[2][3];
        numbers[0][0] = 1;
        numbers[1][2] = 2;

        int x = 1;
        int y = x++;
        int z = ++x;

        String k = "";
//        System.out.println("k" + k);

        String a = "1.4";
        float b = Float.parseFloat(a) + 2;

        //NumberFormat
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(12345678.891);
//        System.out.println(result);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result1 = percent.format(0.1);
//        System.out.println(result1);

        //Reading Input from users
        Scanner scanner = new Scanner(System.in);
        byte age = scanner.nextByte();
        System.out.println("your age is " + age);



//        System.out.println("b: "+ b);


//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//
//        System.out.println(Arrays.deepToString(numbers));
//
//        System.out.println(message.replace("!", "?"));
//        System.out.println(message);
    }
}