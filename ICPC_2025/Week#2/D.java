import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        long fact = 1;
        for (int i = 1; i <= x; i++) {
            fact*=i;
        }

        int sum =0;
        while (fact!=0){
            sum+=fact%10;
            fact/=10;
        }
        if(sum%2==0)
            System.out.println("Kholy");
        else
            System.out.println("Adham");
    }
}



