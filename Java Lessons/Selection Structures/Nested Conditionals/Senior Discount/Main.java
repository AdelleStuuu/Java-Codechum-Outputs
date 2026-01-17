import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter your age: ");
            var age = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter your income: $");
            var income = scan.nextInt();
            
            if (age >= 60) {
                if (income < 10000) {
                    System.out.print("Eligible for senior citizen discount");
                } else {
                    System.out.print("Not eligible for senior citizen discount");
                }
                
            } else {
                System.out.print("Not eligible for senior citizen discount");
            }
        }
        
    }
}