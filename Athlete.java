public class Athlete
{
    // instance variables - replace the example below with your own
    private int age;
    private String name;

    public Athlete(int a, String nm)
    {
        // initialise instance variables
        this.age = a;
        this.name = nm;
    }
    
    public String toString()
    {
        return "Athlete name: " + this.name + " Age: " + this.age;
    }

}
