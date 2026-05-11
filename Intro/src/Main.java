import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String message = "Hello world" + "!!";
//        int[][] numbers = new int[2][3];
//        numbers[0][0] = 1;
//        numbers[1][2] = 2;
//
//        int x = 1;
//        int y = x++;
//      int z = ++x;
//
//        String k = "";
//      System.out.println("k" + k);
//
//        String a = "1.4";
//        float b = Float.parseFloat(a) + 2;
//
//        //NumberFormat
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String result = currency.format(12345678.891);
//        System.out.println(result);

//        NumberFormat percent = NumberFormat.getPercentInstance();
//        String result1 = percent.format(0.1);
//        System.out.println(result1);

        //Reading Input from users
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter your age : ");
//        byte age = scanner.nextByte();
//        if(age < 0)
//            System.out.println("Age cannot be less than 0");
//        else System.out.println("your age is " + age);

        //Reading String
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.print("Enter your name : ");
//        String name = scanner1.next();
//        String name1 = scanner1.nextLine().trim();
//        System.out.println("your name is: " + name);
//        System.out.println("your name is: " + name1);

//        int role = 1;
//        switch (role) {
//            case 1:
//                System.out.println("you are an admin");
//                break;
//            case 2:
//                System.out.println("you are an user");
//                break;
//        }

//        String input = "";
//        Scanner scanner3 = new Scanner(System.in);
//        while(!input.equals("quit")) {
//            System.out.println("Input: ");
//            input = scanner3.next().toLowerCase();
//            System.out.println(input);
//
//        }



//        System.out.println("b: "+ b);


//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//
//        System.out.println(Arrays.deepToString(numbers));
//
//        System.out.println(message.replace("!", "?"));
//        System.out.println(message);

//        var textBox1 = new TextBox();
//        textBox1.setText("Box 1");
//        System.out.println(textBox1.text);
//
//        var textBox2 = new TextBox();
//        textBox2.setText("Box 2");
//        System.out.println(textBox2.text);

        var employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(-1);
        int wage = employee.calculateWage(10);

        System.out.println(wage);

    }

}