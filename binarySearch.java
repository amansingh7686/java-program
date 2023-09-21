import java.util.*;
public class binarySearch{
    public static int binarySearch(int num[], int key){
        int start = 0,  end = num.length;
        while(start<=end){
            int mid=(start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            if(key>mid){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;

    }
    public static void main (String args[]){
        int num[] = {8, 3, 9, 4, 7, 2, 13, 17};
        int key = 7;
        System.out.print("index for key is " + binarySearch(num, key));

    }
}