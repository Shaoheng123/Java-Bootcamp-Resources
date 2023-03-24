import java.util.Arrays;

public class Main {
  
    public static void main(String[] args) {

        Person2[] people = new Person2[] { 
            new Person2("Cleopatra", "Egypt", "69 BC", 1),
            new Person2("Alexander the Great", "Macedon", "356 BC", 2),
            new Person2("Julius Caesar", "Rome", "100 BC", 3),
            new Person2("Hannibal", "Carthage", "247 BC", 4),
            new Person2("Confucius", "China", "551 BC", 5),
            new Person2("Pericles", "Greece", "429 BC", 6),
            new Person2("Spartacus", "Thrace", "111 BC", 7),
            new Person2("Marcus Aurelius", "Rome", "121 AD", 8),
            new Person2("Leonidas", "Greece", "540 BC", 9),
            new Person2("Sun Tzu", "China", "544 BC", 10),
            new Person2("Hammurabi", "Babylon", "1750 BC", 10),
        };

        Airline airline = new Airline();

        for (int i = 0; i < people.length; i++) {
            boolean passportApproved = people[i].applyPassport();
            if (passportApproved) {
                people[i].setPassport();
                airline.createReservation(people[i]);
            } else {
                System.out.println("Sorry " + people[i].getName() + ". Your passport: " + Arrays.toString(people[i].getPassport()) + " is not valid.\n");  
            }
        }

     }
    
  
}
