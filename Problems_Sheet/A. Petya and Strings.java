import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name1 = input.next().toUpperCase();
        String name2 =input.next().toUpperCase();

       if((name1.compareTo(name2))==0) {
           System.out.println(0);
       }
       else if((name1.compareTo(name2))>0){
            System.out.println(1);
       }
       else {
           System.out.println(-1);
       }

    }}
