import java.util.Scanner;
public class Q{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String sequence = input.next();
        for(int i =0;i<n;i++){
            int sum=1;
            while(i<n-1){
                if(sequence.charAt(i)==sequence.charAt(i+1))
                    sum++;
                else{
                    break;
                }
                i++;
            }
            System.out.print(sum+""+sequence.charAt(i));
        }
//        GFG.encoding(sequence,n);
    }
}