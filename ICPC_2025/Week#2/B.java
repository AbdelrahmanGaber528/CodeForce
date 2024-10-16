import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long x = input.nextLong();

        while (true) {
            long m = input.nextLong();

            if (x >= m) {
                System.out.println("Win");
            } else {
                System.out.println("Lose");
                return; // Using return to exit the program
            }
        }
    }
}

