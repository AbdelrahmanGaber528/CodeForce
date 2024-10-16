import java.util.Scanner;

public class A{
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int m = input.nextInt();

            // Start from the next even number if n is odd
            if (n % 2 != 0) {
                n++;
            }

            StringBuilder evenNumbers = new StringBuilder();
            for (int i = n; i <= m; i += 2) {
                evenNumbers.append(i).append(" ");
            }

            System.out.print(evenNumbers.toString().trim());
        }
    }
}
