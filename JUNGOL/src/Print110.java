import java.util.Scanner;
 
public class Print110{
    public static void main(String[] args) {
        double yard;
         
        Scanner sc = new Scanner(System.in);
        System.out.print("yard? ");
        yard = sc.nextDouble();
        System.out.printf("%3.1fyard = %4.1fcm",yard,(yard*91.44));
 
    }
}