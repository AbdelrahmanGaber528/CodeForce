import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read input
        int n = input.nextInt();
        StringBuilder numbers = new StringBuilder();

        while (n != 1) {
            numbers.append(n).append(" ");
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
            }
        }
        numbers.append(1);  // Append the final 1 outside the loop

        System.out.print(numbers.toString().trim());
        input.close();
    }
}
