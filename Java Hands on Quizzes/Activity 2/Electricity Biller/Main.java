import java.util.*;
public class Main {
    public static void main(String[] args) {
        double total = 0;
        
         var R = "R"; var C = "C"; var I = "I";
        
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter electricity consumption (kWh): ");
            double kilowattPerHour = scan.nextFloat();
            
            scan.nextLine();

            System.out.print("Enter customer type (R/C/I): ");
            String customerType = scan.nextLine();


            
            if (customerType.equals(R)){
                
                if (kilowattPerHour < -1 || kilowattPerHour < 101) {
                    total = kilowattPerHour * 8;
                } else if (100 > kilowattPerHour || kilowattPerHour < 200) {
                    total = kilowattPerHour * 10;
                } else {
                    total = kilowattPerHour * 12;
                }
                
            } else if (customerType.equals(C)){
                
                if (-1 > kilowattPerHour || kilowattPerHour < 201) {
                    total = kilowattPerHour * 12;
                } else if (200 > kilowattPerHour || kilowattPerHour < 501) {
                    total = kilowattPerHour * 15;
                } else {
                    total = kilowattPerHour * 18;
                } 
                
            } else if (customerType.equals(I)){
                total = kilowattPerHour * 20;
                
            } else {
                System.out.println("Invalid electricity consumption.");
            }
            
            if (kilowattPerHour > 500) {
                total *= 1.1;
            } else if (kilowattPerHour < 50) {
                total *= 0.95;
            }
        }
        System.out.printf("Total Electricity Bill: P%.2f",total);
        
        
        
    }
}