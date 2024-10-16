import java.util.Scanner;

public class M {

    public static boolean isPalindrome(long n) {
        long reversed = 0, original = n;
        while (n != 0) {
            long digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return original == reversed;
    }

    public static int sumOfDigits(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int i = 0; i < t; i++) {
            long id = input.nextLong();
            int sumDigits = sumOfDigits(id);
            boolean isPalin = isPalindrome(id);
            boolean divBySum = id % sumDigits == 0;

            if (isPalin && divBySum) {
                System.out.println("Best mentor.");
            } else if (isPalin || divBySum) {
                System.out.println("He's good.");
            } else {
                System.out.println("He'll be fired.");
            }
        }

        input.close();  // Close the Scanner
    }
}
