 public class Main {
  
    public static void main(String[] args) {
        Person person = new Person("Rayan Slim", "Canadian", "01/01/1111", 5); 
        person.setSeatNumber(10);
        Person person1 = new Person(person);
        person1.setName("Hello");
        person1.setSeatNumber(6);
        

        // person.new (person)
        System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n"
                + "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n");
        System.out.println(person1.getName()+person1.getNationality()+person1.getSeatNumber()+person1.getDateOfBirth());

    }
  
  
}
