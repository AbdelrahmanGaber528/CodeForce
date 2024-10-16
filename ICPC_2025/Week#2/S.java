import java.util.Scanner;

public class S {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder sr = new StringBuilder();
        int i = n-1;
        while (i!=0){
            sr.append(0).append(" ");
            i--;
        }
        sr.append(n);
        System.out.println(sr.toString().trim());
    }
}
