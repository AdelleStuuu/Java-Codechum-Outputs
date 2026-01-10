import java.util.Scanner;
public class Main {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        // Hey there, start typing your Java code here...
        Scanner scan = new Scanner(System.in);
        Scanner floScan = new Scanner(System.in);
        
        System.out.print("Enter the recipient: ");
        var recipient = scan.nextLine();
        System.out.print("Enter the message: ");
        var message = scan.nextLine();
        System.out.print("Enter the name: ");
        var name = scan.nextLine();
        System.out.print("Enter the subject: ");
        var subject = scan.nextLine();
        System.out.print("Enter the version: ");
        var version = scan.nextLine();
        System.out.print("Enter the discount: ");
        var discount = floScan.nextFloat();
        
        System.out.print("Enter the status: ");
        var status = scan.nextLine();
        System.out.print("Enter the code: ");
        var code = scan.nextLine();
        System.out.print("Enter the location: ");
        var location = scan.nextLine();
        System.out.print("Enter the age: ");
        var age = scan.nextLine();
        System.out.print("Enter the company name: ");
        var company = scan.nextLine();
        System.out.print("Enter the website: ");
        var website = scan.nextLine();
        System.out.print("Enter the phone: ");
        var phone = scan.nextLine();
        System.out.print("Enter the job title: ");
        var job = scan.nextLine();
        System.out.print("Enter the department: ");
        var department = scan.nextLine();
        
        System.out.printf("Dear %s, I hope this email finds you well.\n%s\n",recipient,message);
        System.out.printf("Subject: %s\n",subject);
        System.out.printf("Sender: %s\n",name);
        System.out.printf("Version: %s\n",version);
        System.out.printf("Discount: %.2f%%\n",discount);
        System.out.printf("Status: %s\n",status);
        System.out.printf("Code: %s\n",code);
        System.out.printf("Location: %s\n",location);
        System.out.printf("Age: %s\n",age);
        System.out.printf("Company: %s\n",company);
        System.out.printf("Website: %s\n",website);
        System.out.printf("Phone: %s\n",phone);
        System.out.printf("Job Title: %s\n",job);
        System.out.printf("Department: %s\n",department);


        floScan.close();
        scan.close();
        
    }
}