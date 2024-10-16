import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int in ,negative=0,positive=0,odd=0,even=0;
        for (int i = 0; i < x; i++) {
            in = input.nextInt();
            if(in<0)
                negative++;
            if(in>0)
                positive++;
            if(in%2==0)
                even++;
            if(in%2!=0)
                odd++;
        }
        System.out.printf("Even: %d\nOdd: %d\nPositive: %d\nNegative: %d",even,odd,positive,negative);
    }
}



