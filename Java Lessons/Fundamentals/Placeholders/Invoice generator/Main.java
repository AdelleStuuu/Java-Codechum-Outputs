public class Main{
    public static void main(String[] args) {
        var name = "John Doe";
        var id = 12345;
        var cost = 99.99;
        System.out.printf("Invoice for Customer: %s\n",name);
        System.out.printf("Order ID: %d\n",id);
        System.out.printf("Total Amount: $%.2f\n",cost);
    }
}