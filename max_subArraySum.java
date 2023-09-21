import java.util.*;
public class max_subArraySum{
    public static void max_subArraySum(int num[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<num.length; i++){
            int start = i;
            for(int j = i; j<num.length; j++){
            int end = j;
            currSum = 0;
            for(int k = start; k<=end; k++)
            {
                currSum = currSum + num[k];
            }
            System.out.println(currSum);
            if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Maximum sum of sub array = "+ maxSum);
    }
    public static void main(String args[]){
        int num [] = {3,5,7,9,11,13,15,17,19,21,23};
        max_subArraySum(num);
    }
}