import java.util.*;
public class Main {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter an integer number: ");
            var x = scan.nextInt();
            
            x += 1;
            
            System.out.printf("The updated number is: %d",x);
        }
    }
}