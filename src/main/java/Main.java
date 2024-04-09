import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        SearchMaxArray searchMaxArray = new SearchMaxArray();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of task: (1 - calculator, 2 - string array)");
        int action = scanner.nextInt();

        if (action == 1) {
            System.out.println("Enter what operation you want to perform: \n 1 - addition, 2 - subtraction, 3 - multiplication, 4 - division:");
            calculator.arithmetic(scanner.nextInt());

        } else if (action == 2) {
            System.out.println("The search for the maximum word in the array is started");
            searchMaxArray.searchMaxArray();
        } else {
            System.out.println("Invalid number entered");
        }
        scanner.close();
    }
}