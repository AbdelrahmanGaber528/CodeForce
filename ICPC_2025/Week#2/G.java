import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;

public class G {
    public static boolean isLucky(int number) {
        while (number > 0) {
            int digit = number % 10;
            if (digit != 4 && digit != 7) {
                return false;
            }
            number /= 10;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        StringBuilder luckyNumbers = new StringBuilder();
        boolean foundLucky = false;

        for (int i = n; i <= m; i++) {
            if (isLucky(i)) {
                luckyNumbers.append(i).append(" ");
                foundLucky = true;
            }
        }

        if (foundLucky) {
            pw.println(luckyNumbers.toString().trim());
        } else {
            pw.println(-1);
        }

        pw.flush();
    }
}
