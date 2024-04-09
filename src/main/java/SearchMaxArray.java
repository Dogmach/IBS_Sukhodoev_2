import java.util.Scanner;

public class SearchMaxArray {
    Scanner scanner = new Scanner(System.in);
    int a = 0;
    int size;
    String strmax = "";

    public void searchMaxArray() {
        System.out.println("Enter array length: ");
        size = scanner.nextInt();
        scanner.nextLine();
        String[] myWords = new String[size];

        System.out.println("Enter words into the array: ");
        for (int i = 0; i < myWords.length; i++) {
            myWords[i] = scanner.nextLine();
        }
        for (int i = 0; i < myWords.length; i++) {
            if (myWords[i].length() > a) {
                a = myWords[i].length();
                strmax = myWords[i];
            }
        }
        System.out.println("Longest word in the array: " + strmax);
    }
}
