import java.util.*;
public class Main{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter side: ");
            double num = sc.nextInt();
            double sqrt5 = Math.sqrt(5);
            double res = (.25*Math.sqrt(5*(5+2*sqrt5)))*Math.pow(num,2);
            System.out.printf("Area of Pentagon: %.2f",res);
        }
        
    }
}