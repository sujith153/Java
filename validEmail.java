package email;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class validEmail {
	public static boolean isValidMail(String email) {
		 String regex = "^(.+)@(.+)$";
		 Pattern pattern = Pattern.compile(regex);
		 Matcher matcher = pattern.matcher(email);
		 return matcher.matches();
	}

	public static void main(String[] args) {
		 List<String> emails = new ArrayList<String>();
		 emails.add("dhoni1239@example.in");
		 emails.add("kohli5450@example.com");
		 emails.add("rashi.example.com");
		 emails.add("kingofpml@example.com");
		 emails.add("abrakadabra@.example.com");
		 emails.add("abcd@example.com");
		 for (String value : emails) {
		 System.out.println("The Email address: " + value + " is " + (isValidMail(value) ? 
		"Valid" : "Invalid"));
		 } 
		 System.out.println("ENTER MAIL TO CHECK :");
		 try (Scanner sc = new Scanner(System.in)) {
		String input = sc.nextLine(); 
		System.out.println("The Email Address you have given: " + input + " is " + (isValidMail(input) ? 
		"Valid" : "Invalid"));
		}
	}
}
