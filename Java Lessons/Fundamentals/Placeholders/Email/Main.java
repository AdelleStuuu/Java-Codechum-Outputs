public class Main{
    public static void main(String[] args) {
        var line1 = "Dear John, I hope this email finds you well.";
        var line2 = "I wanted to reach out and say hello.";
        var line3 = "I hope you are doing well and enjoying your day.";
        var line4 = "It's been a while since we last spoke, and I wanted to catch up with you.";
        var line5 = "Let's plan to meet up soon and have a great time together!";
        var dis = 10.5;
        var ver = 1.2;
        var subj = "Greetings";
        var send = "Jane";
        var stat = "A";
        var code = "ABCD123";
        var loc = "City XYZ";
        var com = "ABC Corporation";
        var age = 30;
        var web = "www.example.com";
        var pho = "+1 123-456-7890";
        var job = "Software Engineer";
        var dep = "Engineering";
        System.out.printf("%s\n%s\n%s\n%s\n%s\n",line1,line2,line3,line4,line5);
        System.out.printf("Subject: %s\n",subj);
        System.out.printf("Sender: %s\n",send);
        System.out.printf("Version: %.1f\n",ver);
        System.out.printf("Discount: %.2f%%\n",dis);
        System.out.printf("Status: %s\n",stat);
        System.out.printf("Code: %s\n",code);
        System.out.printf("Location: %s\n",loc);
        System.out.printf("Age: %d\n",age);
        System.out.printf("Company: %s\n",com);
        System.out.printf("Website: %s\n",web);
        System.out.printf("Phone: %s\n",pho);
        System.out.printf("Job Title: %s\n",job);
        System.out.printf("Department: %s\n",dep);
    }
}