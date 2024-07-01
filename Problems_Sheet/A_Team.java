import java.util.Scanner;
public class A_Team {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[] arr = new int[3];
    int sum =0,values =0;
    for(int i =0;i<n;i++){
      sum=0;
      for (int j = 0; j < 3; j++) {
        arr[j] = input.nextInt();
        sum+=arr[j];
      }
      if(sum>=2){
        values++;
      }
    }
    System.out.println(values);
    input.close();
  }
}
