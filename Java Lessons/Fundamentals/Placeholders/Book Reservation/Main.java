public class Main{
    public static void main(String[] args) {
        var book = "The Great Gatsby";
        var author = "F. Scott Fitzgerald";
        var gen = "Fiction";
        var lib = "Central Library";
        var date = "June 30, 2023";
        var id = 12345;
        var year = 1925;
        System.out.printf("You have successfully reserved the book '%s' by %s.\n",book,author);
        System.out.printf("Year of Publication: %d\n",year);
        System.out.printf("Genre: %s\n",gen);
        System.out.printf("Library: %s\n",lib);
        System.out.printf("Member ID: %d\n",id);
        System.out.printf("Return Date: %s\n",date);
    }
}