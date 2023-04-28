import java.util.Scanner;
public class diamondof_star{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int firsthalf = (n+1)/2;
        int secondhalf = firsthalf - 1;
        int i = 1;
        while(i<=firsthalf){
            int space = 1;
            while(space<=(firsthalf-i)){
                System.out.print(" ");
                space++;
            }
            int j = 1;
            while(j<=((i*2)-1)){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
        i = secondhalf;
        while(i>=1){
        int space = 1;
        while(space<=(secondhalf-i+1)){
            System.out.print(" ");
            space++;
        }
        int j = 1;
        while(j<=(2*i-1)){
            System.out.print("*");
            j++;
        }
        System.out.println();
        i--;
        }

    }
}