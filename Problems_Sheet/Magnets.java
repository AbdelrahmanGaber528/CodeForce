import java.util.Scanner;

public class Magnets {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int a,b=0,counter=0;
        for (int i = 0; i < n; i++) {
            a = input.nextInt();
            if(a!=b)
                counter++;
            b=a;
        }
        System.out.println(counter);
    }
}
