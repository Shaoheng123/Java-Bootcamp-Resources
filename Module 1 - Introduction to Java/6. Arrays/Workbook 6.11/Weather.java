import java.util.Arrays;

public class Weather {
    public static void main(String[] args) {

        // The instructions for this workbook are on Learn the Part (Workbook 6.11)
        double[] celsius = { 12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0 };
        double[] fahrenheit = {};
        // System.out.println("HI");
        // System.out.println(celsiusToFahrenheit(celsius, fahrenheit));
        // System.out.println();
        printsTemperatures(celsius, "celsius");
        printsTemperatures(celsius, "fahrenheit");
    }

    public static double[] celsiusToFahrenheit(double[] celsius) {
        // System.out.println("HI");
        double[] fahren = Arrays.copyOf(celsius, celsius.length);
        double[] fahrenheit = new double[celsius.length];
        for (int i = 0; i < fahren.length; i++) {
            // System.out.println(fahrenheit);

            fahrenheit[i] = fahren[i] * 9 / 5 + 32;
            // System.out.println(fahrenheit[i]);
        }
        return fahrenheit;
        // return Arrays.toString(fahrenheit);

    }

    public static void printsTemperatures(double[] temp , String tempType) {
        
        if (tempType.equals("celsius")) {
            System.out.print("Type:"+": "+tempType);
            for (int i = 0; i < temp.length; i++) {
                System.out.print("\s"+temp[i]);
                
            }
        }
        else {
            System.out.println("Type:"+": "+tempType);
            for (int i = 0; i < temp.length; i++) {
                // System.out.println(temp[i]);
                System.out.println(celsiusToFahrenheit(temp));
                
                
            }
            
        }
      
    }

}
