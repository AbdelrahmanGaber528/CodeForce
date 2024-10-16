import java.util.Scanner;

public class K {
    public static boolean isPrime(int n) {
        if (n <= 1 || (n % 2 == 0 && n != 2)) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) if (n % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(isPrime(input.nextInt()) ? "YES" : "NO");
        input.close();
    }
}
