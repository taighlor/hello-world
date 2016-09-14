import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordStrengthIndicator {
	private static Scanner scanUserInput = new Scanner(System.in);
	private static String usersPassword;

	private static String thePasswordLower = "[a-z]+";
	private static String thePasswordNumber = "[0-9]+";
	private static String thePasswordLowerAndNumber = "[a-z0-9]+";
	private static String thePasswordLowerAndSpecial = "[a-z@!£$%^&*?#~'\"]+";
	private static String thePasswordAll = "[a-z0-9@!£$%^&*?#~'\"]+";

	public void askUserForPassword() {
		System.out.println("Please insert password: ");
		usersPassword = scanUserInput.nextLine();
	}

	private static Pattern getMatcher(String regex) {
		return Pattern.compile(regex);
	}

	public static void main(String[] args) {
		PasswordStrengthIndicator process = new PasswordStrengthIndicator();
		process.askUserForPassword();

		if (getMatcher(thePasswordLower).matcher(usersPassword).matches()) {
			System.out.println("Your password is weak ");
		} else if (getMatcher(thePasswordNumber).matcher(usersPassword).matches()) {
			System.out.println("Your password is very weak ");
		} else if (getMatcher(thePasswordLowerAndNumber).matcher(usersPassword).matches()) {
			System.out.println("Your password is okay ");
		} else if (getMatcher(thePasswordLowerAndSpecial).matcher(usersPassword).matches()) {
			System.out.println("Your password is safe ");
		} else if (getMatcher(thePasswordAll).matcher(usersPassword).matches()) {
			System.out.println("Your password is very safe ");
		}
		scanUserInput.close();
	}
}
