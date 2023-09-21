import java.util.*;
public class printPairs{
    public static void printPairs(int num[]){
        int totalPairs = 0;
        for(int i = 0; i<num.length; i++){
            for(int j = (i+1); j<num.length; j++){
                System.out.print("("+num[i] +  ", " + num[j]+ ") ");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs = "+ totalPairs);
    }
    public static void main(String args[]){
        int num [] = {3,5,7,9,11,13,15,17,19,21,23};
        printPairs(num);
    }
}