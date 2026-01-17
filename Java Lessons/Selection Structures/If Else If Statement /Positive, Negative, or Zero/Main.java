import java.util.*;

public class Main{
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int positive = 0; int negative = 0; int zero = 0;
            
            System.out.print("Enter first integer: ");
            var n1 = scan.nextInt();
 
            if (n1 > 0) {
                positive++;
            } else if (n1 < 0) {
                negative++;
            } else {
                zero++;
            } 
            
            System.out.print("Enter second integer: ");
            var n2 = scan.nextInt();
 
            if (n2 > 0) {
                positive++;
            } else if (n2 < 0) {
                negative++;
            } else {
                zero++;
            } 
            
            System.out.print("Enter third integer: ");
            var n3 = scan.nextInt();
 
            if (n3 > 0) {
                positive++;
            } else if (n3 < 0) {
                negative++;
            } else {
                zero++;
            } 
            
            System.out.print("Enter fourth integer: ");
            var n4 = scan.nextInt();
 
            if (n4 > 0) {
                positive++;
            } else if (n4 < 0) {
                negative++;
            } else {
                zero++;
            } 
            
            System.out.print("Enter fifth integer: ");
            var n5 = scan.nextInt();
 
            if (n5 > 0) {
                positive++;
            } else if (n5 < 0) {
                negative++;
            } else {
                zero++;
            } 
            System.out.printf("Positive count: %d\n",positive);
            System.out.printf("Negative count: %d\n",negative);
            System.out.printf("Zero count: %d\n",zero);
        }
    }
}