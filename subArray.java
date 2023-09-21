import java.util.*;
public class subArray{
    public static void printsubArray(int num[]){
        int totalSubArray = 0;
        for(int i = 0; i<num.length; i++){
            int start = i;
            for(int j = i; j<num.length; j++){
            int end = j;
            for(int k = start; k<=end; k++)
            {
                System.out.print(num[k]+ " ");
            }
            totalSubArray++;
            System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total sub array = "+ totalSubArray);
    }
    public static void main(String args[]){
        int num [] = {3,5,7,9,11,13,15,17,19,21,23};
        printsubArray(num);
    }
}