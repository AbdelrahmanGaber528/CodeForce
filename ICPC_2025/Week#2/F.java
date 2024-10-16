import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int raw = input.nextInt();
        int cnt = 1;
        int spaces = raw -1;
        for (int i = 0; i < raw; i++) {
            for (int j = 0; j < spaces; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j <cnt ; j++) {
                System.out.print('*');
            }
            System.out.println();
            cnt+=2;
            spaces-=1;
        }

    }
}



