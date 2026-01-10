public class Main{
    public static void main(String[] args) {
        String content = "Exciting news! Our new product is launching soon.";
        String date = "2023-06-30";
        String time = "10:00 AM";
        var reach = 2500.50;
        var engage = 0.75;
        var dur = 1.50;
        var cost = 50.25;
        var cat = "N";
        var stat = "S";
        var name = "John Doe";
        var email = "johndoe@example.com";
        var plat = "Facebook";
        var audi = "Targeted";
        var budg = 1000.00;
        System.out.println("Post Scheduled:");
        System.out.printf("Content: %s\n",content);
        System.out.printf("Date: %s\n",date);
        System.out.printf("Time: %s\n",time);
        System.out.printf("Reach: %.2f\n",reach);
        System.out.printf("Engagement: %.2f\n",engage);
        System.out.printf("Duration: %.2f\n",dur);
        System.out.printf("Cost: %.2f\n",cost);
        System.out.printf("Category: %s\n",cat);
        System.out.printf("Status: %s\n",stat);
        System.out.printf("Author Name: %s\n",name);
        System.out.printf("Author Email: %s\n",email);
        System.out.printf("Platform: %s\n",plat);
        System.out.printf("Audience: %s\n",audi);
        System.out.printf("Budget: %.2f\n",budg);
    }
}