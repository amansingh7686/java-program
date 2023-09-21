import java.util.*;

public class findLargestNo{
    public static int findLargestNo(int arr[], int larg){
        for(int i=0; i<arr.length; i++){
            if(arr[i]>larg){
                larg = arr[i];
            }
        }
        return larg;
    }
    public static void main(String args[]){
        int larg = Integer.MIN_VALUE;
        int arr[]={8, 3, 9, 4, 97, 2, 13, 17, 76};
        int largestNo = findLargestNo(arr, larg);
        System.out.print("Largest number of this array is "+ largestNo);
    }
}