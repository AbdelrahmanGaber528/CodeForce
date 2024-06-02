import java.util.Scanner;
public class Difference{
    public  static void main(String[] args) {
    Scanner getNumbers = new Scanner(System.in);
    long a=getNumbers.nextLong(),b=getNumbers.nextLong(),c=getNumbers.nextLong(),d=getNumbers.nextLong();
    long  result= (a*b)-(c*d);
        System.out.println("Difference = "+result);
    }
}