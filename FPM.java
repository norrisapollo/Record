/* Section: 06
* Term: Spring 2020
* Instructor: Devi Samyuktha S
* Name: Jabari Norris
* Assignment 7
*/
package A7;

import java.util.*;

public class FPM {
	public static void main(String[] args) {
		int[][] a = new int[10][10];
		Random ran = new Random();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++)
				a[i][j] = ran.nextInt(1901) + 99;
		}
		System.out.print("Please enter your desired flight price: ");

		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++)
				if (a[i][j] == price) {
					System.out.println("A flight was found for that price, have a safe trip!");
					return;
				}
		}
		System.out.println("No flight was found for that price, please try a new price.");
	}
}
