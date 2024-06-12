import java.util.Scanner;
public class DigitsSummation{
    public  static void main(String[] args) {
    Scanner getNumber = new Scanner(System.in);
    long N = getNumber.nextLong(),M = getNumber.nextLong();
    long result = (N%10)+(M%10);
        System.out.println(result);
    }
}