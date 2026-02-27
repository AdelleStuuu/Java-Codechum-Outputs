public class Main {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50,60,70,80,90,100};
        String output = "";
        for (int i = 0; i < array.length; i++) {
            output += array[i] + " ";
        }
        System.out.println(output);
    }
}