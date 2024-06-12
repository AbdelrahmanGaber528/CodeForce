import java.util.Scanner;
public class SimpleCalculator{
    public  static void main(String[] args) {
    Scanner getNumbers= new Scanner(System.in);
    long n1=getNumbers.nextLong(),n2=getNumbers.nextLong();
        System.out.printf("%d + %d = %d\n",n1,n2,n1+n2);
        System.out.printf("%d * %d = %d\n",n1,n2,n1*n2);
        System.out.printf("%d - %d = %d\n",n1,n2,n1-n2);
    }
}