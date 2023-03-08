import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {

       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        int choice=3;
       Scanner scan = new Scanner(System.in);
       int guess=scan.nextInt();
       if (guess<1|| guess>5){
        System.out.println("number must not be less than 1 or larger than 5");
        System.exit(0);
       }
       //See Learn the Part for detailed instructions.
       
       while (choice != guess) {
           System.out.print("Guess again: ");
           guess = scan.nextInt();
       }
       System.out.println("You got it!");
        
        scan.close();
    }

}
