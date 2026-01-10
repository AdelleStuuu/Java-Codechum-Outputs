import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner calculate = new Scanner(System.in)) {
            System.out.println("=== JAVA BANK ATM SYSTEM ===");
            System.out.print("Enter amount to withdraw: ");
            int cash = calculate.nextInt();
            System.out.println("");
            System.out.println("--- DISPENSING CASH ---");
            System.out.print("Requested Amount: "+cash); 
            System.out.println("\n-----------------------");
            int thousands = cash / 1000, remainThou = cash % 1000;
            int FiveHun = remainThou / 500, remainFiveHun = remainThou % 500;
            int Hun = remainFiveHun / 100, remainHun = remainFiveHun % 100;
            int Fifty = remainHun / 50, remainFifty = remainHun % 50;
            int Twenties = remainFifty / 20, remainTwenties = remainFifty % 20;
            int Ones = remainTwenties / 1;
            System.out.println("1000 bills : "+thousands);
            System.out.println(" 500 bills : "+FiveHun);
            System.out.println(" 100 bills : "+Hun);
            System.out.println("  50 bills : "+Fifty);
            System.out.println("  20 bills : "+Twenties);
            System.out.println("   1 coins : "+Ones);
            System.out.println("-----------------------");
            System.out.println("Transaction Complete.");
        }
    }
}