//Задание 12
import java.util.Scanner;

public class OddNumbersSequence {
    public static void printOddNumbers() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number == 0) {
            return;
        }

        if (number % 2 != 0) {
            System.out.println(number);
        }

        printOddNumbers();
    }

    public static void main(String[] args) {
        printOddNumbers();
    }
}
