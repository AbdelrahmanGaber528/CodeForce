import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name1 = input.next();
        String name2 =input.next();

        if((name1.compareToIgnoreCase(name2))==0) {
            System.out.println(0);
        }
        else if((name1.compareToIgnoreCase(name2))>0){
            System.out.println(1);
        }
        else {
            System.out.println(-1);
        }

    }}
