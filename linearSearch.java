import java.util.*;

public class linearSearch{
    public static int search(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        System.out.print("Enter key : ");
        Scanner s = new Scanner(System.in);
        int key = s.nextInt();
        int arr[]={8, 3, 9, 4, 7, 2, 13, 17};
        int index = search(arr, key);
        if(index==-1){
             System.out.print("Not Found");
        }else{
            System.out.println("key is at "+ index +" index");
        }
    }
}