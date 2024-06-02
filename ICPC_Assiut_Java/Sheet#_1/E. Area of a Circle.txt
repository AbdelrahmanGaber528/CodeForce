import java.util.Scanner;
public class Difference{
    public  static void main(String[] args) {
    Scanner getRadius = new Scanner(System.in);
    double pi = 3.141592653;
    double radius = getRadius.nextDouble();
    double area = (radius*radius)* pi;
        System.out.printf("%.9f",area);
    }
}