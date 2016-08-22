import java.util.Scanner;
public class uglyCarIssues {

	public static void main(String[] args) {
		Scanner scanUserInput = new Scanner(System.in);
		String answer;

		System.out.println("Please answer the following questions with y/n only");
		System.out.println("Is the car silent when you turn the key?");
		answer = scanUserInput.next();
		if (answer.equals("y")){
			System.out.println("Are the battery terminals corroded?");
			answer = scanUserInput.next();
			if (answer.equals("y")){
				System.out.println("Clean terminals and try starting again");
				System.out.println("End.");
			}if (answer.equals("n")){
				System.out.println("Replace cables and try again");
				System.out.println("End.");
			}
		} if (answer.equals("n")){
			System.out.println("Does the car make a clicking noise?");
			answer = scanUserInput.next();	
			if (answer.equals("y")){
				System.out.println("Replace the battery");
				System.out.println("End.");
			} if (answer.equals("n")){
				System.out.println("Does the car cranck up but fail to start?");
				answer = scanUserInput.next();
				if (answer.equals("y")){
					System.out.println("Check spark plug connections");
					System.out.println("End.");
				} if (answer.equals("n")){
					System.out.println("Does the engine start and then die?");
					answer = scanUserInput.next();
					if (answer.equals("y")){
						System.out.println("Does your car have fuel injection?");
						answer = scanUserInput.next();
						if (answer.equals("y")){
							System.out.println("Check to ensure the choke is opening and closing");
							System.out.println("End.");	
						} if (answer.equals("n")){
							System.out.println("Get it in for a service");
							System.out.println("End.");
						}
					}
				}
			}
		}
		scanUserInput.close();
	}
}
