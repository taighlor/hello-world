import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordStrengthIndicator {
	private static Scanner scanUserInput = new Scanner(System.in);
	private static String usersPassword;
	
	private static Pattern thePasswordLower = Pattern.compile("[a-z]+");
	private static Pattern thePasswordNumber = Pattern.compile("[0-9]+");
	private static Pattern thePasswordLowerAndNumber = Pattern.compile("[a-z0-9]+");
	private static Pattern thePasswordLowerAndSpecial = Pattern.compile("[a-z@!£$%^&*?#~'\"]+");
	private static Pattern thePasswordAll = Pattern.compile("[a-z0-9@!£$%^&*?#~'\"]+");
	
	public void askUserForPassword() {
		System.out.println("Please insert password: ");
		usersPassword = scanUserInput.nextLine();
	}
	
	public static void main(String[] args) {
		PasswordStrengthIndicator process = new PasswordStrengthIndicator();
		process.askUserForPassword();

		if (thePasswordLower.matcher(usersPassword).matches()){
			System.out.println("Your password is weak ");
		}	else if (thePasswordNumber.matcher(usersPassword).matches()){
			System.out.println("Your password is very weak ");
		}	else if (thePasswordLowerAndNumber.matcher(usersPassword).matches()){
			System.out.println("Your password is okay ");
		}	else if (thePasswordLowerAndSpecial.matcher(usersPassword).matches()){
			System.out.println("Your password is safe ");
		}	else if (thePasswordAll.matcher(usersPassword).matches()){
			System.out.println("Your password is very safe ");
		}
		scanUserInput.close();
	}
}
