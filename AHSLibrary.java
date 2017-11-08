public class AHSLibrary
{
    public static void main(String[] args) {
        Library ahs = new Library(10, "acalanes");
        
        Author appel = new Author("Appel", 38);
        Book javaText = new Book(appel, "Java");
        ahs.addBook(javaText, 0);
        
        Author jesus = new Author("Jesus", 33);
        Book bible = new Book(jesus, "Bible");
        ahs.addBook(bible, 1);
        
        System.out.println(ahs);
        
        //Use the toString() method to print the library’s books
    }
}