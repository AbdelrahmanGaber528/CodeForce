import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read inputs
        int r = input.nextInt();
        int d = input.nextInt();
        int x1 = input.nextInt();
        int n = input.nextInt();

        // Calculate result
        long result = x1;
        for (int i = 0; i < n - 1; i++) {
            result = r * result - d;
        }

        // Print the final result
        System.out.println(result);
    }
}
