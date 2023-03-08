public class Doubles {
    public static void main(String[] args) {

   //      See Learn the Part for instructions.
       
        int dice1;
        int dice2;
        dice1 = (int) (Math.random() *6)+1;
        dice2 = (int) (Math.random() * 6) + 1;
        while (dice1 != dice2) {
            dice1 = (int) (Math.random() *6)+1;
            dice2 = (int) (Math.random() * 6) + 1;
            System.out.println("Dice1:"+dice1);
            System.out.println("Dice2:" + dice2);
            
        }
        System.out.println("Dice 1 is equal to Dice 2");
        


    }

}





