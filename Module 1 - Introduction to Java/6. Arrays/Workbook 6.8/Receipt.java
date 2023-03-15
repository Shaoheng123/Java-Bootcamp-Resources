public class Receipt {
    public static void main(String[] args) {

        String[] apple = { "Gala", "Granny Smith", "Macintosh" };
        double[] price = { 1.99, 1.49, 1.29 };
        System.out.println("Here's your receipt:\n");
        for (int i = 0; i < apple.length; i++) {
            // for (int j = 0; j < price.length; i++) {
                System.out.println("\t "+apple[i]+":"+price[i]);
                
            }
        }
        
        // See instructions on Learn the Part (Workbook 6.8)
        
         // to be used in for loop.
    }

