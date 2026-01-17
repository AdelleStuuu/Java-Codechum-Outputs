import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter your age: ");
            var age = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter your genre preference (a for adventure, m for mystery, f for fantasy, s for science fiction): ");
            var genre = scan.next().charAt(0);
            
            if (age >= 8 && age <= 12) {
                switch(genre) {
                    case 'a' -> System.out.print("The Adventures of Tom Sawyer");
                    case 'm' -> System.out.print("Nancy Drew: The Secret of the Old Clock");
                    default -> System.out.print("No recommendation available");
                }
                
            } else if (age >= 13) {
                switch(genre) {
                    case 'f' -> System.out.print("Harry Potter and the Sorcerer's Stone");
                    case 's' -> System.out.print("Ender's Game");
                    default -> System.out.print("No recommendation available");
                }
                
            } else {
                System.out.print("No recommendation available");
            }
        }
        
    }
}