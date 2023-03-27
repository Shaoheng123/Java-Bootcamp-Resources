import model.Car;
// this import allows the car.drive(Red) instead of car.drive(Car.TrafficLight.Red)
import static model.Car.TrafficLight.*;
public class Main {

    public static void main(String[] args) {
        Car car = new Car("Nissan", 2020);
        car.drive(GREEN);
    }

}
