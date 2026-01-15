import java.util.*;
public class Main {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter kilometers per hour: ");
            double kph = scan.nextFloat();
            System.out.print("Enter number of hours traveled: ");
            var ht = scan.nextInt();
            
            double d = 1;
             
             d *= kph; d *= ht; d *= .621371;
            
            System.out.printf("Distance in miles: %.3f",d);
        }
    }
}