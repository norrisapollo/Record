/* Section: 06
* Term: Spring 2020
* Instructor: Devi Samyuktha S
* Name: Jabari Norris
* Assignment 7
*/
package A7;

import java.util.*;

public class Gift {
	public static void main(String[] args) {
		int arr[] = new int[10];
		int flag[] = new int[10];
		int a = 5;
		System.out.print("|");
		for (int i = 0; i < 10; i++) {
			arr[i] = a;
			flag[i] = 0;
			a += 5;
			System.out.print("$" + arr[i] + "|");
		}
		Random rand = new Random();
		int n = rand.nextInt(50 + 1) + 25;
		System.out.println();
		System.out.println("Gift Card Amount: " + n);
		for (int i = 9; i >= 0; i--) {
			if ((n - arr[i]) >= 0) {
				flag[i] = 1;
				n -= arr[i];
			}
		}
		for (int i = 9; i >= 0; i--) {
			if (flag[i] == 1) {
				System.out.println("You bought item #" + i + " for $" + arr[i]);
			}
		}
		System.out.println("Amount Donated to Charity: " + n);
	}
}
