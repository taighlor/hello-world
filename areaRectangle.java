import java.util.Scanner;
public class areaRectangle {
	private static double length, width, areaFeet, areaMeters;
	private static final double conversion = 0.09290304;
	public static void main(String[] args) {
		Scanner scanUserInput = new Scanner(System.in);		
			System.out.println("Please insert the rooms length(ft): ");
			length = scanUserInput.nextDouble();	
			System.out.println("Please insert the rooms width(ft): ");
			width = scanUserInput.nextDouble();	
   
			areaFeet = length*width;
			areaMeters = areaFeet*conversion;

			System.out.println("The area of the room is " + areaFeet + " square feet");
			System.out.println("The area of the room is " + areaMeters + " square meters");
		scanUserInput.close();
	}
}

