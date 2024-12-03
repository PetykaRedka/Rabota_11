//Задание 9
public class NoTwoZeros {
    public static int countSequences(int a, int b) {
        if (a == 0) return 1;
        if (b == 0) return 1;
        if (a > b) return 0;

        return countSequences(a - 1, b) + countSequences(a, b - 1);
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println(countSequences(a, b));
    }
}
