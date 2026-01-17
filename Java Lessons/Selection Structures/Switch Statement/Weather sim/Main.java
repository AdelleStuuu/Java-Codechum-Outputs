import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the weather condition: ");
            var weather = scan.next().charAt(0);
            
            switch(weather) {
                case 'S' -> System.out.print("Suggestion: Enjoy the sunshine");
                case 'C' -> System.out.print("Suggestion: Stay indoors");
                case 'R' -> System.out.print("Suggestion: Bring an umbrella");
                case 'W' -> System.out.print("Suggestion: Fly a kite");
                default -> System.out.print("Invalid weather condition.");
            }
        }
    }
}