public class Main {

    public static void main(String[] args) {
        // Hey there, start typing your Java code here...
        for (var i = 0; i < 5; i++) {
            for (var j = 0; j < (i + 1); j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}