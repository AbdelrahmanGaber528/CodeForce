import java.util.Scanner;

public class O {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int maxLamoro = 0,maxOuda=0;
        for (int i = 0; i < n; i++) {
                int in = input.nextInt();
                if(in>maxLamoro)
                    maxLamoro = in;
        }
        for (int i = 0; i < m; i++) {
            int in = input.nextInt();
            if(in>maxOuda)
                maxOuda = in;
        }
        if(maxOuda>maxLamoro)
            System.out.println("Ouda");
        else
            System.out.println("LAMORO");

    }
}
