import java.util.Scanner;
public class NestedLoop {
    public static void main (String [] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum;
        int i;
        int j;

        userNum = scnr.nextInt();

        for(i = 0; i <= userNum; ++i){
            for (j = i-1; j >= 0; --j ){
                System.out.print(" ");
            }
            System.out.print(i);
            System.out.println("");

        }

    }
}