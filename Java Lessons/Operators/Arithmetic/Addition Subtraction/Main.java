import java.util.*;
public class Main {

    public static void main(String[] args) {
        
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter x: ");
            var x = scan.nextInt();
            System.out.print("Enter y: ");
            var y = scan.nextInt();
            var sum = x + y;
            var dif = x - y; 
            System.out.printf("%d + %d = %d\n",x,y,sum);
            System.out.printf("%d - %d = %d",x,y,dif);
        }
    }
}