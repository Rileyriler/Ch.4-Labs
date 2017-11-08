public class Book
{
    // instance variables - replace the example below with your own
    private Author bookAuthor;
    private String title;

    public Book(Author a, String tl)
    {
        // initialise instance variables
        this.bookAuthor = a;
        this.title = tl;
    }

    public String toString() {
        return "The author is " + bookAuthor + ". Their book is " + title;
    }
    
}
