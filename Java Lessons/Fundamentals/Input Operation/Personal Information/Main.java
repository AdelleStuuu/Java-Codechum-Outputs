import java.util.Scanner;
public class Main {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // Hey there, start typing your Java code here...
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        var name = scan.nextLine();
        System.out.print("Enter your age: ");
        var age = scan.nextLine();
        System.out.print("Enter your city: ");
        var city = scan.nextLine();
        System.out.println("Name: "+name);
        System.out.printf("Age: %s\n",age);
        System.out.printf("City: %s\n",city);

        scan.close();
    }
}