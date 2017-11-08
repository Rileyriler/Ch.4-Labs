
public class CarDriver
{
    public static void main(String[] args)
    {
        // initialise instance variables
        Car myCar = new Car(2011, "C Class");
        System.out.println(myCar);
        
        Car yourCar = new Car(2011, "C Class");
        
        System.out.println(myCar.equals(yourCar));
    }

}
