import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double[] array = new double[10];
            double sum = 0; double average;
            
            System.out.println("Enter 10 floating-point numbers:");
            for (int i = 0; i < 10; i++) {
                array[i] = sc.nextFloat();
            }
            for (int j = 0; j < array.length; j++) {
                sum += array[j];
            }
            
            average = sum / array.length;
            System.out.printf("The average is: %.2f",average);
        }
    }
}