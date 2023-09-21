import java.util.*;
public class max_subArraySumKadane{
    public static void kadanes(int num[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<num.length; i++){
            currSum = currSum + num[i];
            if(currSum<0){
                currSum = 0;
            }
            maxSum = Math.max(currSum,maxSum);
        }
        System.out.println("Maximum sum of sub array = "+ maxSum);
    }
    public static void main(String args[]){
        int num [] = {3,5,7,9,11,13,15,17,19,21,23};
        kadanes(num);
    }
}