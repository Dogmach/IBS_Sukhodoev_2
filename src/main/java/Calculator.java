import java.util.Scanner;

public class Calculator {

    public void arithmetic(int operation) {

        Scanner scanner = new Scanner(System.in);
        double a;
        double b;

        double result;
        switch (operation) {
            case 1:
                System.out.println("Enter two fractional numbers in turn: ");
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                result = a + b;
                System.out.printf("The sum of two numbers is: %.4f", result);
                break;
            case 2:
                System.out.println("Enter two fractional numbers in turn: ");
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                result = a - b;
                System.out.printf("The difference of the two numbers is: %.4f", result);
                break;
            case 3:
                System.out.println("Enter two fractional numbers in turn: ");
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                result = a * b;
                System.out.printf("The product of two numbers is: %.4f", result);
                break;
            case 4:
                System.out.println("Enter two fractional numbers in turn: ");
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                result = a / b;
                System.out.printf("The quotient of two numbers is equal to: %.4f", result);
                break;
        }
    }
}
