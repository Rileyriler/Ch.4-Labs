public class Library
{
    // instance variables - replace the example below with your own
    private Book[] books;
    private String name;
    
    
    public Library(int size, String nm)
    {
        // initialise instance variables
        this.books = new Book[size];
        this.name = nm;
    }
    
    public String toString() {
        String output = "The library has: \n";
        for(Book b : books) {
            output += b + "\n";
        }
        return output + "\n";
    }
    
    public void addBook(Book b, int i) {
        books[i] = b;
    }

}
