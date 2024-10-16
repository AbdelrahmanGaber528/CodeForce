import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String sequence = input.next();
        StringBuilder result = new StringBuilder(); // Use StringBuilder for efficient concatenation

        for (int i = 0; i < n * 2; i += 2) {
            int num = sequence.charAt(i) - '0'; // Get the number of repetitions
            char ch = sequence.charAt(i + 1); // Get the character to print
            for (int j = 0; j < num; j++) {
                result.append(ch); // Append to StringBuilder
            }
        }

        System.out.print(result.toString()); // Print all at once
    }
}
