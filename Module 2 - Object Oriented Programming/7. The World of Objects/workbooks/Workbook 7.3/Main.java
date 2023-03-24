// import Person.java;

public class Main {
  
    public static void main(String[] args) {
        Person1 person = new Person1("Rayan Slim", "Canadian", "01/01/1111", 5);
        person.setName("Hello");
        System.out.println("Name: " + person.getName() + "\n" + "Nationality: " + person.getNationality() + "\n" + "Date of Birth: " + person.getDateOfBirth() + "\n" + "Seat Number: " + person.getSeatNumber() + "\n");

    }
  
  
}
