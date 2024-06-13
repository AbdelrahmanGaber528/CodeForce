

import java.util.Scanner;

public class Min_Max {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt(), b =input.nextInt() , c = input.nextInt();
    if(a == b && a == c){
      System.out.print(a+" "+c);
    }else if(a>=b && a >c){
      if(b>=c){
        System.out.print(c+" "+a);
      }else
      System.out.println(b+" "+a);
    }else if(b>=a && b>c){
      if(a>=c){
        System.out.print(c +" "+ b);
      }else
        System.out.println(a+" "+b);
    }else {
      if(a>=b){
        System.out.print(b+" "+c);
      }else
      System.out.println(a+" "+c);
    }



  }
}
