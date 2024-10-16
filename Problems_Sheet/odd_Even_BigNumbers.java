
import java.util.Scanner;
public class Program {
    public static void main(String[] args)  {
    Scanner input = new Scanner(System.in);
    String num = input.next();
    if(num.charAt(num.length()-1)%2==0)
        System.out.println("Even");
    else
        System.out.println("Odd");
    }}
	
	/******************************************************************************/
	
	                        /*****another way by small space****/
							a
	import java.math.BigInteger;
import java.util.Scanner;
public class Program {
    public static void main(String[] args)  {
    Scanner input = new Scanner(System.in);
    BigInteger num = new BigInteger(input.next());
        if (num.intValue()%2==0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }}
	
/**********************************************************************/
