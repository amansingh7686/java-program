import java.util.Scanner;
public class inverted_no{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while(i<=n){
            int j = 1;
            int x = (n-i+1);
            while(j<=n-i+1){
                System.out.print(x);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}