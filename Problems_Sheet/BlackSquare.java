import java.util.Scanner;

public class BlackSquare {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a1=input.nextInt(), a2=input.nextInt(), a3=input.nextInt(), a4=input.nextInt();
    String s = input.next();
    int one=0,two=0,three=0,four=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='1')
                one++;
            else if(s.charAt(i)=='2')
                two++;
            else if(s.charAt(i)=='3')
                three++;
            else
                four++;
        }
        int totalLose = one*a1+two*a2+three*a3+four*a4;
        System.out.println(totalLose);

    }
}
