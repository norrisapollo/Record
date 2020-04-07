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
public class NextMeeting {
	public static void main (String[] args) {
		int x,y;
		String arr[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer that will represent today: ");
		x = scan.nextInt();
		System.out.println("Please enter an integer that will represent your meeting day");
		y = scan.nextInt();
		System.out.println("Today is " + arr[x]);
		System.out.println("Days left until the meeting: " +y+ " days.");
		System.out.println("The meeting day is " + arr[(x+y)%7]);
		scan.close();
	}

}
