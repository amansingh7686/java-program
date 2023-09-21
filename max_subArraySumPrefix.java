import java.util.*;
public class max_subArraySumPrefix{
    public static void max_subArraySumPrefix(int num[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[]= new int[num.length];
        prefix[0]=num[0];
        for(int i = 1; i<prefix.length; i++){
            prefix[i]= prefix[i-1]+num[i];
        }
        for(int i = 0; i<num.length; i++){
            int start = i;
            for(int j = i; j<num.length; j++){
            int end = j;
            currSum = start == 0 ? prefix[end]: prefix[end] - prefix[start-1];
            if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("Maximum sum of sub array = "+ maxSum);
    }
    public static void main(String args[]){
        int num [] = {3,5,7,9,11,13,15,17,19,21,23};
        max_subArraySumPrefix(num);
    }
}