import java.util.*;
public class Main{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first string: ");
            String str = sc.nextLine();
            System.out.print("Enter the second string: ");
            String str2 = sc.nextLine();
      
            System.out.println("Length of the first string: " + str.length());
            System.out.println("Length of the second string: " + str2.length());

            System.out.println("Sum: " + (str.length()+str2.length()) );
        }
    }
}