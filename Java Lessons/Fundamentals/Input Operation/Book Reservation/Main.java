import java.util.Scanner;
public class Main {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // Hey there, start typing your Java code here...
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the book title: ");
        var book = scan.nextLine();
        System.out.print("Enter the author: ");
        var author = scan.nextLine();
        System.out.print("Enter the year of publication: ");
        var pub = scan.nextLine();
        System.out.print("Enter the genre: ");
        var genre = scan.nextLine();
        System.out.print("Enter the library: ");
        var library = scan.nextLine();
        System.out.print("Enter your member ID: ");
        var id = scan.nextLine();
        System.out.print("Enter the return date: ");
        var date = scan.nextLine();
        System.out.printf("You have successfully reserved the book '%s' by %s.\n",book,author);
        System.out.printf("Year of Publication: %s\n",pub);
        System.out.printf("Genre: %s\n",genre);
        System.out.printf("Library: %s\n",library);
        System.out.printf("Member ID: %s\n",id);
        System.out.printf("Return Date: %s\n",date);

        scan.close();
    }
}