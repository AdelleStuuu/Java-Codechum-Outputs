import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the difficulty level (Easy, Medium, Hard): ");
            var difficulty = scan.nextLine();
            
            switch(difficulty) {
                case "Easy" -> System.out.print("Message: You selected Easy difficulty. Enjoy the game!");
                case "Medium" -> System.out.print("Message: You selected Medium difficulty. Get ready for a challenge!");
                case "Hard" -> System.out.print("Message: You selected Hard difficulty. Brace yourself for a tough gameplay!");
                default -> System.out.print("Invalid difficulty level.");
            }
        }
    }
}