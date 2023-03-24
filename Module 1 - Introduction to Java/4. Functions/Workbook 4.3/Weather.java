public class Weather {
    public static void main(String[] args) {
        double noon = 77;          //temperature at noon in fahrenheit.
        double evening = 61;       //temperature during the evening in fahrenheit
        double midnight = 55;      //temperature at midnight in fahrenheit

        //Task 3 - Call the printTemperatures function. 

        printTemperatures(evening, fahrenheitToCelsius(evening));
        // double noon1 = fahrenheitToCelsius(noon);
        // System.out.println(noon1);
        // double evening1 = fahrenheitToCelsius(evening);
        // System.out.println(evening1);
        // double midnight1 = fahrenheitToCelsius(midnight);
        // System.out.println(midnight1);

        
        
        
    }


    //Task 1: Make a function here. See the doc comments below. 

    /**
     * Function name: fahrenheitToCelsius - converts fahrenheit to celcius
     * @param fahrenheit (double)
     * @return celsius (double)
     * 
     * Inside the function:
     * 1. returns the temperature in celcius. C = (F - 32) * 5/9. 
     *
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celcius= (fahrenheit-32)*5/9;
        return celcius;
    }

     
    //Task 2: Make a function here. See the doc comments below. 
    public static void printTemperatures(double fahrenheit, double celcius) {
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Celcius: "+celcius);
    }

    /**
     * Function name: printTemperatures – prints both temperature values. 
     * @param fahrenheit (double)
     * 
     * Inside the function: 
     *  1. prints: F: <temperature in fahrenheit>.
     *  2. prints: C: <temperature in celsius> . 
     * 
     */
}