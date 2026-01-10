import java.util.*;
public class Main {
    public static void main(String[] args) {
        double total = 0;
        String item = "";
        double price = 0; double surcharge = 0;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter menu code (B/P/S/C/T): ");
            String menuCode = scan.nextLine();

            
            System.out.print("Enter quantity: ");
            double quantity = scan.nextFloat();
            
            scan.nextLine();

            System.out.print("Enter time of day (M-morning / A-afternoon / E-evening): ");
            
            
            String time = scan.nextLine();
            
            
            if (menuCode.equals("B")) {
                price = 150; 
                item = "Burger";
            } else if (menuCode.equals("P")) {
                price = 300; 
                item = "Pizza";
            } else if (menuCode.equals("S")) {
                price = 100; 
                item = "Sandwich";
            } else if (menuCode.equals("C")) {
                price = 50; 
                item = "Coffee";
            } else if (menuCode.equals("T")) {
                price = 40; 
                item = "Tea";
            }
            
            total = price * quantity;
            
            if (time.equals("M")) {
                if(time.equals("C") || time.equals("T")) {
                    total *= 0.9;
                } else {
                    total *= 1;
                }
                System.out.printf("Item: %s\n",item);
                System.out.printf("Quantity: %.0f\n",quantity);
                System.out.printf("Total Price: P%.2f",total);
            } else if (time.equals("A")) {
                total *= 1;
                System.out.printf("Item: %s\n",item);
                System.out.printf("Quantity: %.0f\n",quantity);
                System.out.printf("Total Price: P%.2f",total);
            } else if (time.equals("E")) {
                surcharge = total * 0.050;
                total *= 1.05;
                System.out.printf("Item: %s\n",item);
                System.out.printf("Quantity: %.0f\n",quantity);
                
                System.out.printf("Surcharge applied: ₱%.2f\n",surcharge);
                System.out.printf("Total Price: P%.2f",total);
            } else {
                System.out.println("Invalid time of day.");
            }
        }
        
        
        
    }
}