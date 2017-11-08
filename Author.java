public class Author
{
    // instance variables - replace the example below with your own
    private int age;
    private String name;

    public Author(String nm, int yr)
    {
        // initialise instance variables
        this.name = nm;
        this.age = yr;
    }
    //overwritting the toString method
    public String toString() {
        return " " + name + " Age: " + age;
    }
}
