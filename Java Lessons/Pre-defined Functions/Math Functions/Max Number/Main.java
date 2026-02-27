import java.util.*;
public class Main{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            int num = sc.nextInt();
            System.out.print("Enter the second number: ");
            int num2 = sc.nextInt();
            int res = Math.max(num,num2);
            System.out.printf("The largest number is: %d",res);
        }
        
    }
}