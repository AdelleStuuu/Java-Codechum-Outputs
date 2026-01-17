import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter your birth month: ");
            var x = scan.nextInt();
            System.out.print("Enter your birth day: ");
            var y = scan.nextInt();
            
            if (x == 12) {
                if (y < 23) {
                    System.out.print("Your zodiac sign is Capricorn.");
                } else {
                    System.out.println("Your zodiac sign is not Capricorn.");
                }
                
            } else if (x == 1) {
                if (y < 20) {
                    System.out.print("Your zodiac sign is Capricorn.");
                } else {
                    System.out.println("Your zodiac sign is not Capricorn.");
                }
                
            } else {
                System.out.println("Your zodiac sign is not Capricorn.");
            }
        }
    }
}