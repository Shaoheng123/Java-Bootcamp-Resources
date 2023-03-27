import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExampleOne {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("greetings.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
         
            // TODO: handle exception
        } finally{
            System.out.println("Process Completed");
        }
        
    }
    
}