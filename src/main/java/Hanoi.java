import java.util.Scanner;

import java.util.*;
public class Hanoi {

    public static void moveDisc(int discs, int startPeg,  int finalPeg,int buforPeg ){
        if(discs>0){
            moveDisc(discs-1, startPeg,buforPeg,finalPeg);
            System.out.println(startPeg +" > " + finalPeg);
            moveDisc(discs-1, buforPeg, finalPeg,startPeg);
        }

    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many discs do you want to move: ");
        int discsNumber = sc.nextInt();
        moveDisc(discsNumber,1,2,3);
    }
}
