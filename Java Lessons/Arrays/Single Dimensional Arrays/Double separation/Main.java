import java.text.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            DecimalFormat df = new DecimalFormat("0.000");
            double[] array = new double[6];
            String output = "";
            System.out.println("Enter 6 double values:");
            for (int i = 0; i < 6; i++) {
                array[i] = sc.nextDouble();
            }
            for (int j = 0; j < array.length; j++) {
                output += df.format(array[j]) + "\t";
            }
            System.out.printf("Array elements: \n%s",output);
        }
    }
}