public class Airline {
    
    Person2[] people; //array that stores Person objects...

    public Airline() {
        this.people = new Person2[11];
    }

    public Person2 getPerson(int index) {
        Person2 person = this.people[index];
        return new Person2(person); //copy constructor creates copy of object
    }

    public void setPerson(Person2 person) {
        int index = person.getSeatNumber() - 1;
        this.people[index] = new Person2(person);
    }


    public void createReservation(Person2 person) {
        while (people[person.getSeatNumber() - 1] != null) {
            System.out.println("\n" + person.getName() + ", seat: " + person.getSeatNumber() + " is already taken. Please choose another seat.\n");
            person.chooseSeat(); 
        }
        people[person.getSeatNumber() - 1] = new Person2(person); 
        System.out.println("Thank you " + person.getName() + " for flying with Java airlines. Your seat number is " + person.getSeatNumber() + ".\n");
    }




}
