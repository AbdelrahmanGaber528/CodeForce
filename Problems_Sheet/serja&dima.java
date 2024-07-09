import java.util.Scanner;

class MainTest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] cardsNumbers = new int[size];
        for(int i =0;i<size;i++){
            cardsNumbers[i]= input.nextInt();
        }
        int serjea = 0, dima =0 , r = 0, l = size -1 ;
        boolean turn = true;
        while(r<=l){
            if(cardsNumbers[r]>=cardsNumbers[l]){
                if(turn){
                    serjea+=cardsNumbers[r];
                    turn = false;
                }else{
                    dima+=cardsNumbers[r];
                    turn = true;
                }
                r++;
            }else {
                if(turn){
                    serjea+=cardsNumbers[l];
                    turn = false;
                }else {
                    dima+=cardsNumbers[l];
                    turn = true;
                }
                l--;
            }
        }
        System.out.println(serjea+" "+dima);
    }
}