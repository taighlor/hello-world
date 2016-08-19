import java.util.Scanner;
public class extendedRectnagles {
	private static Scanner scanUserInput = new Scanner(System.in);
	private static String measurementType;
	private static double length, width, areaFeet,areaMeters, roundedFeet, roundedMeters;
	private static final double conversionRate = 0.09290304;
	public void feetOrMeters(){
		System.out.println("Are you measuring in feet or meters?");
		measurementType = scanUserInput.next();
	}
	public boolean askingUserMeasurement(){
		try {
			System.out.println("Please insert the rooms length: ");
			length = scanUserInput.nextDouble();	
			System.out.println("Please insert the rooms width: ");
			width = scanUserInput.nextDouble();
			return true;
		} catch (Exception error) {
			System.out.println("*** ERROR: VALUE ENTERED NOT DOUBLE ***");
			return false;
		}
	}
	public void calculatingAreaFeet(){
		areaFeet = length*width;
		areaMeters = areaFeet*conversionRate;
		roundedMeters = Math.round(areaMeters*100.00)/100.00;
		roundedFeet = Math.round(areaFeet*100.00)/100.00;
		System.out.println("The area of the room is " + roundedFeet + " square feet");
		System.out.println("The area of the room is " + roundedMeters + " square meters");
	}
	public void calculatingAreaMeters(){
		areaMeters = length*width;
		areaFeet = areaMeters/conversionRate;
		roundedMeters = Math.round(areaMeters*100.00)/100.00;
		roundedFeet = Math.round(areaFeet*100.00)/100.00;
		System.out.println("The area of the room is " + roundedMeters + " square meters");
		System.out.println("The area of the room is " + roundedFeet + " square feet");
	}
	public static void main(String[] args) {
		extendedRectnagles process = new extendedRectnagles();
		process.feetOrMeters();
		if (extendedRectnagles.measurementType.equals("feet")){
			if (process.askingUserMeasurement()){
				process.calculatingAreaFeet();
			}	
		}
		if (extendedRectnagles.measurementType.equals("meters")){
			if (process.askingUserMeasurement()){		
				process.calculatingAreaMeters();
			}
		} 
		if (!extendedRectnagles.measurementType.equals("feet")
		&& !extendedRectnagles.measurementType.equals("meters")){
			System.out.println("Please enter either feet or meters only");
			process.feetOrMeters();
		}
		scanUserInput.close();
	}
}
