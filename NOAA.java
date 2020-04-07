/*
 * Class: CSE 1321L
 * Section: 06
 * Term: Spring 2020
 * Instructor: Devi Samyuktha S
 * Name: Jabari Norris
 * Assignment 7
 */
package A7;

import java.util.Random;

public class NOAA {
	public static void main(String[] args) {
		Random r = new Random();
		double rainfall[] = new double[12];
		int exceeded = 0;
		for (int i = 0; i < 12; i++) {
			rainfall[i] = 10 * r.nextDouble();
			System.out.println(i + ": " + rainfall[i]);
			if (rainfall[i] > 5) {
				exceeded++;
			}
		}
		System.out.println("Number of Months rainfall exceeded 5.0: " + exceeded);
	}
}
