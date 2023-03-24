 public class Main {
  
     public static void main(String[] args) {
         Person2 person = new Person2("Rayan Slim", "Canadian", "01/01/1111", 5);

         System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n"
                 + "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber()
                 + "\n");
                 if (person.applyPassport() == true) {
                     System.out.println("Congratulations " + person.getName() + ". Your passport was approved!");
                     person.setSeatNumber(person.chooseSeat());
                     

                    
                } else {
                    System.out.println("We are sorry " + person.getName() + ". We cannot process your application.");
                }

     }
    
  
  
}
