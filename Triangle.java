import java.util.Scanner;
class Triangle {

    public static void main(String[] args) {

        Scanner scanUserInput = new Scanner(System.in);
        System.out.println("Please insert 3 numbers. new line per number (return): ");
        int angleA = scanUserInput.nextInt();
        int angleB = scanUserInput.nextInt();
        int angleC = scanUserInput.nextInt();


        if(angleA==angleB && angleB==angleC)
            System.out.println("This is an equilateral triangle");

        else if (angleB==angleC || angleA==angleB || angleC==angleA)
        	System.out.println("This is an isosceles triangle");

        else if(angleA!=angleB && angleB!=angleC && angleC!=angleA)
            System.out.println("this is a scalene triangle");
        
        else {
           System.out.println("This does not equal a triangle");
        }
        scanUserInput.close();
        }
}
