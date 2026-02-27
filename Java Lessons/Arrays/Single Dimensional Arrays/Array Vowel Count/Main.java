import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 8 characters:");
        char[] array = new char[8];
        
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < 8; i++) {
                array[i] = sc.next().charAt(0);
            }
        }
        char[] vowels = {'a','e','i','o','u'};
        int vowel = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (Character.toLowerCase(array[i]) == vowels[j]) {
                    vowel += 1;
                }
            }
        }
        System.out.printf("Number of vowel elements: %d",vowel);
        
    }
}