import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        try (Scanner scan = new Scanner(System.in)) {
            int steps = 0;
            System.out.print("Enter a starting number: ");
            var start = scan.nextInt();
            int peak = start;
            var sequence = "";
            while(start != 1) {
                sequence += start + " -> ";
                if (start % 2 == 0) {
                    start /= 2;
                } else {
                    start *= 3;
                    start += 1;
                }
                steps++;
                
                if (peak < start) {
                    peak = start;
                }
                
                
            }
            sequence += "1";
            System.out.printf("Sequence: %s\n",sequence);
            System.out.printf("Total steps: %d\n",steps);
            System.out.printf("Highest peak reached: %d\n",peak);
        }
    }
}