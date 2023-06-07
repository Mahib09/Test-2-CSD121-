class Car implements InterfaceOne, InterfaceTwo, InterfaceThree{
    private int gear;
    private int accelerate;
    private int brake;
    public Car(int gear, int accelerate, int brake){
        this.gear=gear;
        this.accelerate=accelerate;
        this.brake=brake;
    }
public void updateGear(){
    System.out.printf("gear: %d \n", gear);
}
public void accelerate(){
}
public void pushBrake(){
    System.out.printf("brake: %d \n", brake);
}
void currentSpeed(){
    System.out.printf("speed: %d \t", accelerate-brake);
}
}
class Truck implements InterfaceOne, InterfaceTwo, InterfaceThree{
    private int gear;
    private int accelerate;
    private int brake;
    public Truck(int gear, int accelerate, int brake){
        this.gear=gear;
        this.accelerate=accelerate;
        this.brake=brake;
    }
public void updateGear(){
    System.out.printf("gear: %d \n", gear);
}
public void accelerate(){
}
public void pushBrake(){
    System.out.printf("brake: %d \n ", brake);
}
void currentSpeed(){
    System.out.printf("speed: %d \t", accelerate-brake);
}
}
public class Mahib{
    public static void main(String[] arg) {
        Car c1 = new Car(3,4,2);
        Truck t1= new Truck(3,4,2);
        System.out.println("Car Present state: ");
        c1.accelerate();
        c1.pushBrake();
        c1.currentSpeed();
        c1.updateGear();
        System.out.println("Truck Present state: ");
        t1.accelerate();
        t1.pushBrake();
        t1.currentSpeed();
        t1.updateGear();

        
    }
}