import java.util.Random;
import java.util.Scanner;

public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        //Task 3 – Wait for the user to press enter.
        scan.nextLine();
        //Task 4 – Get two random cards.
        //       – Print them: \n You get a \n" + <randomCard> + "\n and a \n" + <randomCard>

        int card1 = drawRandomCard();
        int card2 = drawRandomCard();

        // System.out.println(card1);
        String drawcard1 = cardString(card1);
        String drawcard2 = cardString(card2);

        // System.out.println("The dealer shows ");
        System.out.println(card1);
        
        //Task 5 – Print the sum of your hand value.
        //       – print: your total is: <hand value>
        System.out.println("You get a" + drawcard1 + "and a" + drawcard2);
        int total = Math.min(card1, 10) + Math.min(card2,10);
        System.out.println("Your total is " + (total));

        //Task 6 – Get two random cards for the dealer.
        //       – Print: The dealer shows \n" + <first card> + "\nand has a card facing down \n" + <facedown card>
        //       – Print: \nThe dealer's total is hidden
        // int dealercard1 = drawRandomCard();
        int dealercard1 = drawRandomCard();
        int dealercard2 = drawRandomCard();

        String computerdrawcard1 = cardString(dealercard1);
        String computerdrawcard2 = cardString(dealercard2);
        int dealertotal = Math.min(dealercard1,10) + Math.min(dealercard2,10);
        // System.out.println(dealercard1);
        // System.out.println(dealercard2);
        System.out.println("The Dealer gets a" + computerdrawcard1 + faceDown());
        System.out.println("The Dealer's total is hidden");

        //Task 8 – Keep asking the player to hit or stay (while loop).
        //       1. Every time the player hits
        //             – draw a new card.
        //             – calculate their new total.
        //             – print: (new line) You get a (new line) <show new card>.
        //             - print: your new total is <total>

        //       2. Once the player stays, break the loop. 
        System.out.println("Hit or stay?");

        String hitorstay = scan.nextLine();
        String capsHitOrStay = hitorstay.toLowerCase();
        int newtotal=total;
        while (!capsHitOrStay.equals("stay")) {
            if (capsHitOrStay.equals("hit")) {
                int drawCard = drawRandomCard();
                String card = cardString(drawCard);
                newtotal += Math.min(drawCard, 10);

                System.out.println("You got a " + card);
                System.out.println("Your total is " + (newtotal));
                if (newtotal > 21) {
                    System.out.println("Bust! Player Loses");
                    System.exit(0);
                }
                System.out.println("Hit or Stay?");
                hitorstay = scan.nextLine();
                capsHitOrStay = hitorstay.toLowerCase();

            } else {
                System.out.println("Invalid input");
                System.out.println("Hit or Stay?");
                hitorstay = scan.nextLine();
                capsHitOrStay = hitorstay.toLowerCase();
            }

            // System.out.println("Dealer got a " + dealerDrawCard);
            // System.out.println("Dealer total is " + (newdealertotal));
        }
        System.out.println("The dealer cards are" + computerdrawcard1 + computerdrawcard2);
        System.out.println("Dealer total is" + dealertotal);
            
            int newdealertotal = dealertotal;
            while (newdealertotal <= 17) {
                int dealerDrawCard = drawRandomCard();
                newdealertotal += Math.min(dealerDrawCard,10);
                String dealerCard = cardString(dealerDrawCard);

                System.out.println("Dealer got a " + dealerCard);
                System.out.println("Dealer total is " + (newdealertotal));
                if (newdealertotal > 21) {
                    System.out.println("Bust! Dealer Loses");
                    System.exit(0);
                }
            }
            if (newdealertotal > newtotal) {
                System.out.println("Dealer Total:"+newdealertotal+"Total:"+newtotal);
                System.out.println("You Lose");
            
            } else if(newdealertotal<newtotal){
                System.out.println("You Win");
        }
        else {
                System.out.println("Tie");
            }
        //For tasks 9 to 13, see the article: Blackjack Part II. 
        scan.close();

    }

    /** Task 1 – make a function that returns a random number between 1 and 13
     * Function name – drawRandomCard
     * @return (int)
     *
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card.
     */
    public static int drawRandomCard() {
        int randomCard = (int) (Math.random() * 13) + 1;
        return randomCard;

    }

    /** Task 2 – make a function that returns a String drawing of the card.
     * Function name – cardString
     * @param cardNumber (int)
     * @return (String)
     * 
     *
     * Inside the function:
     *   1. Returns a String drawing of the card.
     */
    public static String cardString(int randomCard) {
        switch (randomCard) {
            case 1:
                return ("   _____\n" +
                        "  |A _  |\n" +
                        "  | ( ) |\n" +
                        "  |(_'_)|\n" +
                        "  |  |  |\n" +
                        "  |____V|\n");
            case 2:
                return ("   _____\n" +
                        "  |2    |\n" +
                        "  |  o  |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____Z|\n");
            case 3:
                return "   _____\n" +
                        "  |3    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____E|\n";

            case 4:
                return "   _____\n" +
                        "  |4    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  | o o |\n" +
                        "  |____h|\n";

            case 5:
                return "   _____ \n" +
                        "  |5    |\n" +
                        "  | o o |\n" +
                        "  |  o  |\n" +
                        "  | o o |\n" +
                        "  |____S|\n";

            case 6:
                return "   _____ \n" +
                        "  |6    |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  |____6|\n";

            case 7:
                return "   _____ \n" +
                        "  |7    |\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |____7|\n";

            case 8:
                return "   _____ \n" +
                        "  |8    |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  |____8|\n";
            case 9:
                return "   _____ \n" +
                        "  |9    |\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |____9|\n";

            case 10:
                return "   _____ \n" +
                        "  |10  o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |___10|\n";
            case 11:
                return "   _____\n" +
                        "  |J  ww|\n" +
                        "  | o {)|\n" +
                        "  |o o% |\n" +
                        "  | | % |\n" +
                        "  |__%%[|\n";
            case 12:
                return "   _____\n" +
                        "  |Q  ww|\n" +
                        "  | o {(|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%O|\n";
            case 13:
                return "   _____\n" +
                        "  |K  WW|\n" +
                        "  | o {)|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%>|\n";
        }
        return "";
    }

    public static String faceDown() {
        return "   _____\n" +
                "  |     |\n" +
                "  |  J  |\n" +
                "  | JJJ |\n" +
                "  |  J  |\n" +
                "  |_____|\n";
    }

    /** Task 7 – make a function that asks the user to hit or stay.
     * Function name – hitOrStay
     * @return (String)
     *
     * Inside the function:
     *   1. Asks the user to hit or stay.
     *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
     *      Please write 'hit' or 'stay'
     *   3. Returns the user's option 
     */
}

    

