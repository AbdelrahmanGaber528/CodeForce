import java.util.Scanner;
public class DigitsSummation{
    public  static void main(String[] args) {
    Scanner getNumber = new Scanner(System.in);
    long num= getNumber.nextInt();
    long result = (num*(num+1))/2;
        System.out.println(result);
    }
}