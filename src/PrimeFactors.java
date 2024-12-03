//Задание 7
public class PrimeFactors {
    public static void factorize(int n, int divisor) {
        if (n < 2) return;
        if (n % divisor == 0) {
            System.out.print(divisor + " ");
            factorize(n / divisor, divisor);
        } else {
            factorize(n, divisor + 1);
        }
    }

    public static void main(String[] args) {
        int n = 60;
        factorize(n, 2);
    }
}
