public class AskJava {
    public static void main(String[] args) {
  
        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

  
        double change = 3.50;
        double price = 2.50;

        System.out.println("Me: Hi Java, do I have enough change to buy chips?");
        boolean amount = change == price;
        System.out.println("Java: " +amount+ "\n");
                                        //comparison here
        int capacity = 12;
        int people = 15;
        System.out.println("Me: Hi Java, can the elevator hold everyone?");
        boolean number = capacity == people;  
        System.out.println("Java: " + number + "\n");
                                      //comparison here

        String request = "PS5";
        String purchase = "Toy car";
        System.out.println("Me: Hi Java, will my friend be happy?");
        System.out.println("Java: " + request.equals(purchase) + "\n");
                                        //comparison here

        int space = 9;
        int guests = 8;
        System.out.println("Me: Hi Java, can everyone attend my dinner party?");
        boolean able = space >= guests;
        System.out.println("Java: " + able + "\n");
                                        //comparison here

        int yourVotes = 24;
        int competitorVotes = 43;
        System.out.println("Me: Hi Java, will I win the election?");
        boolean win = yourVotes <= competitorVotes;
        System.out.println("Java: " + win+ "\n");
                                        //comparison here


    }
}
