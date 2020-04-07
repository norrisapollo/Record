/*
 * Class: CSE 1321L
 * Section: 06
 * Term: Spring 2020
 * Instructor: Devi Samyuktha
 * Name:Jabari Norris
 * Lab#: 5
 */
package Initial;
import java.util.Scanner;
public class CheckPoint {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in); System.out.print("Please enter an X-coordinate and Y-coordinate: ");  
		int x = scan.nextInt();
		int y = scan.nextInt();
		System.out.println("X-coordinate is " + x);
		System.out.println("Y-coordinate is " + y);
		if (x == 0 && y == 0) {
			System.out.println("(0,0)is the origin point."); }
        else if(x == 0) {
            System.out.printf("(%d,%d) is on the y-axis.\n", x, y); }
        else if(y == 0) {
            System.out.printf("(%d,%d) is on the x-axis.\n", x, y); }
        else if(x > 0 && y > 0) {
            System.out.printf("(%d,%d) is in the first quadrant.\n", x, y); }
        else if(x > 0) {
            System.out.printf("(%d,%d) is in the fourth quadrant.\n", x, y); }
        else if(y > 0) {
            System.out.printf("(%d,%d) is in the second quadrant.\n", x, y); }
        else {
            System.out.printf("(%d,%d) is in the third quadrant.\n", x, y); 
		}
scan.close();
		
	}
}
