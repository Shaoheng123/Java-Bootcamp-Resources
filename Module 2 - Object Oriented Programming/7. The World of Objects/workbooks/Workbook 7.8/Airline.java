
public class Airline {
        Person[] people; //array that stores Person objects...
   

    public Airline(){

        this.people=new Person[11];
    }
        public Person getPerson(int index) {
            Person person = this.people[index];
            return new Person(person);
            // return 
        }
        public void setPerson(Person person) {
            // this.person = person;
            int seatNumber=person.getSeatNumber() -1;
            this.people[seatNumber] = new Person(person);
            // this.seatNumber=person.seatNumber;
        }

    }
       
