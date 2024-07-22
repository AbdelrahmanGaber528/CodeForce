import java.util.Scanner;

public class Police {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int untreated=0,hired=0,element;
        for (int i = 0; i < n; i++) {
            element=input.nextInt();
            if(element>0)
                hired+=element;
            if(element<0&&hired<1)
                untreated++;
            if(element<0&&hired>0)
                hired--;
        }
        System.out.println(untreated);
}}
