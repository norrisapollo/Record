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
public class ProcessGrades {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your four grades (o-100):");
		int grade1 = scan.nextInt(); int grade2 = scan.nextInt(); int grade3 = scan.nextInt(); int grade4 = scan.nextInt();
		int max = grade1; int min = grade1; if (min > grade2) min = grade2; if (max < grade2) max = grade2; if (min > grade3) min = grade3; if (max < grade3) max = grade3; if (min > grade4) min = grade4; if (max < grade4) max = grade4;
		double average = grade1 + grade2 + grade3 + grade4;
		System.out.println("Your grades are as follows: " + grade1 + grade2  + grade3  + grade4 );
		System.out.println("Highest grade: " + max );
		System.out.println("Lowest grade: " + min );
		System.out.println("Average grade: " + (average/4));
		scan.close();	
		}
}
