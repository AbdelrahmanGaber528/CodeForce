import java.util.Scanner;
public class LearnNow{
    public  static void main(String[] args) {
    Scanner getNumber = new Scanner(System.in);
    double n1= getNumber.nextDouble(),n2= getNumber.nextDouble();
    double div= n1/n2;
    int floor = (int)(Math.floor(div)),ceil=(int)(Math.ceil(div)),round=(int)(Math.round(div));
        System.out.printf("floor %.0f / %.0f = %d\n",n1,n2,floor);
        System.out.printf("ceil %.0f / %.0f = %d\n",n1,n2,ceil);
        System.out.printf("round %.0f / %.0f = %d\n",n1,n2,round);
    }
}