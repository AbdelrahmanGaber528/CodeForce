import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Read inputs
        int t = input.nextInt();
        long n = input.nextInt();
        for (int i = 0; i < t; i++) {
            char op = input.next().charAt(0);
            int num = input.nextInt();
            switch (op){
                case'+':
                    n+=num;
                    break;
                case'-':
                    n-=num;
                    break;
                case'*':
                    n*=num;
                    break;
                case'/':
                    n/=num;
                    break;
            }
        }
        System.out.print(n);
        input.close();
    }
}
