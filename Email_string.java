import java.util.Scanner;
public class Email_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String user_name = "";
        System.out.println("Enter your email: ");
        String email = sc.next();

        for(int i = 0 ;i<email.length();i++)
        {
            if(email.charAt(i)=='@')
            {
                break;
            }
            else
            {
                user_name = user_name + email.charAt(i);
            }
        }
        System.out.println(user_name);

    }
}
