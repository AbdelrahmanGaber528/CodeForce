import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        long age,max=0,min= Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            age = input.nextLong();
            if(age%2==0){
                if(age>max)
                    max = age;
            }else {
                if(age<min)
                    min = age;
            }
        }
        System.out.print(max+" "+min);

    }
}



