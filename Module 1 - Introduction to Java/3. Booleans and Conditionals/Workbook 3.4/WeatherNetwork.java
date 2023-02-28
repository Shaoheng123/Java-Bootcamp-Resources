public class WeatherNetwork {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        
        int temp = 25;  
         temp = 8;  
         temp = -5;  
        String forecast = "";

        //IF - ELSE IF - ELSE STATEMENTS HERE!
        if (temp <= -1) {
            forecast="The forecast is Freezing! Stay home!";
        } else if (temp <= 10) {
            forecast="The forecast is Chilly. Wear a Coat!";
        } else {
            forecast="It's warm. Go Outside";
        }
        
        
        System.out.println(forecast);
    }
}
