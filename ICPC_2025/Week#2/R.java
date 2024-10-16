import java.util.Scanner;

public class R {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int count = 0;

            for (int z = 0; Math.pow(z,4) * 4 <= N; z++) {
                for (int y = 0; Math.pow(y,3) * 3 + Math.pow(z,4) * 4 <= N; y++) {
                    for (int x = 0; Math.pow(x,2) * 2 + Math.pow(y,3) * 3 + Math.pow(z,4) * 4 <= N; x++) {
                        double w = N - (Math.pow(x,2) * 2 + Math.pow(y,3) * 3 + Math.pow(z,4) * 4);
                        if (w >= 0) {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
