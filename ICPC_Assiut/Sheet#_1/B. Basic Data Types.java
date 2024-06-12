import java.util.Scanner;
public class BasicDataTypes{
    public  static void main(String[] args) {
        Scanner getVariable = new Scanner(System.in);
        int a = getVariable.nextInt();
        long l = getVariable.nextLong();
        String input= getVariable.next();
        char c= input.charAt(0);
        float f=getVariable.nextFloat();
        double d=getVariable.nextDouble();
        System.out.println(a);
        System.out.println(l);
        System.out.println(c);
        System.out.println(f);
        System.out.printf("%.1f",d);
    }
}