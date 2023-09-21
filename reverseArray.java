import java.util.*;
public class reverseArray{
    public static void reverseArray(int arr[]){
        int start = 0; int end = arr.length-1;
        while(start<end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp; 
            start++;
            end--;
        }
    }
    public static void main (String args[]){
        int arr[] = {3, 6, 7, 9, 14, 16, 19, 21, 23, 27};
        reverseArray(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}