import java.util.Scanner;

public class Hangman {

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
                    " =========\n" };
    
    

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * words.length);
        int count =0;
        String answer = words[randomNumber];
        char[] placeholders = new char[(words[randomNumber]).length()];
        for (int i = 0; i < words[randomNumber].length(); i++) {
            placeholders[i] = '_';
        }
        System.out.println(gallows[0]);
        System.out.println(placeholders);
        System.out.println(answer);
        System.out.println(words[randomNumber].length());
        Scanner scan = new Scanner(System.in);
        System.out.print("Please take a guess :");
        
       
        
        
        String misses = new String();
        String word = String.valueOf(placeholders);
        // for (int i = 0; i < placeholders.length; i++) {
        //     String word= new String();
        //     word.append(placeholders[i]);
        // }

        while (!answer.equals(word)) {
            if (count == 6) {
                    
                System.out.println("You Failed");
                break;
            }
            String word1 = String.valueOf(placeholders);
            if (answer.equals(word1)) {
                System.out.println("The word was "+answer+" You Won!");
                break;
            }
            char guess = scan.next().charAt(0);
            if (checkGuess(answer, guess)==true) {
                updatePlaceholder(answer, placeholders, guess);
                
                
                
            }
            else {
                // System.out.println("preo");
                
                if (misses.indexOf(guess)!=-1) {
                    System.out.println("You Have already tried this,please try again");     
                } else {
                    misses = misses + guess;
                    count = count + 1;
                }
                
                

            }
            System.out.println(answer);
            System.out.println(word1);
            System.out.println(gallows[count]);
            System.out.println(placeholders);
            System.out.println("Misses:" + misses);
            if (count == 6 || answer.equals(String.valueOf(placeholders))) {
                
            
                
            } else {
                
                System.out.print("Please Take a guess :");
            }
            
            
        }
        scan.close();
    }

    public static boolean checkGuess(String answer, char guess) {
        // for i
        char[] answer1 = answer.toCharArray();

        for (int i = 0; i < answer.length(); i++) {
            if (guess == (answer1[i])) {
                return true;
            }
        }
        return false;
    }
    

    public static void updatePlaceholder(String word, char[] placeholders, char guess) {
        for (int i = 0; i < placeholders.length; i++) {
            if (guess == (word.charAt(i))) {
                placeholders[i] = guess;
            }

        }
        // System.out.println();
    }
    

        
    }







