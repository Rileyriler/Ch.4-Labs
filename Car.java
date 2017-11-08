
public class Car
{
    // instance variables - replace the example below with your own
    private String model;
    private int year;

    public Car(int yr, String mod)
    {
        this.year = yr;
        this.model = mod;
        
    }
    
    public String toString() {
         return "The car model is: " + model + " from " + year;
    
    }
    
    public boolean equals(Car otherCar) {
        if(this.model.equals(otherCar.model) && this.year == otherCar.year){
            return true;
        }
        else {
            return false;
        }
        
    }
}
