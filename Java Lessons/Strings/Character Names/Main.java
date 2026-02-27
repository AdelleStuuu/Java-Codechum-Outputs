import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the name of your first character: ");
            var string1 = scan.nextLine();
            System.out.print("Enter the name of your second character: ");
            var string2 = scan.nextLine();
            System.out.print("Enter the name of your third character: ");
            var string3 = scan.nextLine();
            System.out.print("Enter the name of your fourth character: ");
            var string4 = scan.nextLine();
            
            System.out.printf("My most played characters in the game are %s, %s, %s, and %s.",string1,string2,string3,string4);
        }
    }
}