import java.util.*;
public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] array = new int[5];
            int sum = 0;
            
            System.out.println("Enter 5 integer numbers:");
            for (int i = 0; i < 5; i++) {
                array[i] = sc.nextInt();
            }
            for (int j = 0; j < array.length; j++) {
                sum += array[j];
            }
            System.out.printf("Sum: %d",sum);
        }
    }
}