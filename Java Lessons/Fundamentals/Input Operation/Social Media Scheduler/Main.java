import java.util.Scanner;
public class Main {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // Hey there, start typing your Java code here...
        Scanner scan = new Scanner(System.in);
        Scanner floScan = new Scanner(System.in);
        
        System.out.print("Enter Post Date: ");
        var Date = scan.nextLine();
        System.out.print("Enter Post Time: ");
        var Time = scan.nextLine();
        System.out.print("Enter Post Reach: ");
        var Reach = floScan.nextFloat();
        System.out.print("Enter Post Engagement: ");
        var Engagement = floScan.nextFloat();
        System.out.print("Enter Post Duration: ");
        var Duration = floScan.nextFloat();
        System.out.print("Enter Post Category: ");
        var Category = scan.nextLine();
        
        System.out.printf("\nPost Scheduled:");
        System.out.printf("\nDate: %s",Date);
        System.out.printf("\nTime: %s",Time);
        System.out.printf("\nReach: %.2f",Reach);
        System.out.printf("\nEngagement: %.2f",Engagement);
        System.out.printf("\nDuration: %.2f",Duration);
        System.out.printf("\nCategory: %s",Category);

        scan.close();
        floScan.close();
    }
}