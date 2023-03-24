import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // See Learn the Part for the instructions.
        System.out.print("Hi Tmyy!, Choose a number to count to:");
        int number = scan.nextInt();
        
        scan.close();
        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }
        

        
    }
}
