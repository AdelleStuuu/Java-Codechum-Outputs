import java.util.*;
public class Main{
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            var r = scan.nextInt();
            System.out.print("Enter number of columns: ");
            var c = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter the symbol to display: ");
            var s = scan.nextLine();
            System.out.printf("\nGenerating Table...\n-------------------\n");
            for(int i = 0; i < r; i++) {
                for(int j = 0; j < c; j++) {
                    System.out.printf("%s ",s);
                }
                System.out.printf("\n");
            }
        }
        
    }
}