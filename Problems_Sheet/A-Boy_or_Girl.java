import java.util.Scanner;

public class Boy_or_Girl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lower = 0 , upper =0;
        String input = scanner.nextLine();
        char[] word = new  char[input.length()];
        for(int i =0;i<input.length();i++){ 
            word[i] = input.charAt(i);
            if('a'<=word[i] && word[i] <='z'){
                lower++;
            }else{
                upper++;
            }
        }
        if(upper>lower){
            System.out.println(input.toUpperCase());
        }
        else{
            System.out.println(input.toLowerCase());
        }


        scanner.close();
    }
}


