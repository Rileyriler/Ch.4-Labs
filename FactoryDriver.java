
public class FactoryDriver
{
    public static void main() {
        Factory tesla = new Factory(2000, 5);
        Car c = new Car(2017, "Model 3");
        tesla.setCar(c, 0);
        
        System.out.println(tesla);
        
    }
    
}
