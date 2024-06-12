import java.util.Scanner;
public class Say_Hello{
    public static void main(String[] args) {
        Scanner getName = new Scanner(System.in);
        String name= getName.nextLine();

        System.out.println("Hello, " + name );
    }
}
