import java.util.Scanner;

public class L {

    public static String toBinary(long n) {
        return Long.toBinaryString(n);  // Utilize built-in method for efficiency
    }

    public static int countOnes(String binaryString) {
        int count = 0;
        for (char c : binaryString.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int i = 0; i < t; i++) {
            long x = input.nextLong();
            int a = input.nextInt();
            if (countOnes(toBinary(x)) == a) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        input.close();  // Close the Scanner
    }
}
