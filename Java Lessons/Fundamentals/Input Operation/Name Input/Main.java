import java.util.Scanner;
public class Main {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // Hey there, start typing your Java code here...
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        var name = scan.nextLine();
        System.out.printf("Welcome, %s!",name);

        scan.close();
    }
}