/*
 * Class: CSE 1321L
 * Section: 06
 * Term: Spring 2020
 * Instructor: Devi Samyuktha S
 * Name: Jabari Norris
 * Assignment 7
 */
package Lab12;

import java.util.Random;

public class ArrayMethods {
	public static void print(int[] arr) {
		System.out.print(arr[0]);
		for (int i = 1; i < arr.length; i++)
			System.out.print(", " + arr[i]);
	}

	public static int arrayMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++)
			if (max < arr[i])
				max = arr[i];
		return max;
	}

	public static int arrayMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++)
			if (min > arr[i])
				min = arr[i];
		return min;
	}

	public static void arraySquared(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * arr[i];
		}
	}

	public static void arrayReverse(int[] arr) {
		int temp;
		int n = arr.length;
		for (int i = 0; i < n / 2; i++) {
			temp = arr[i];
			arr[i] = arr[n - i - 1];
			arr[n - i - 1] = temp;
		}
	}

	public static void main(String[] args) {

		int[] arr = new int[5];
		Random random = new Random();
		for (int i = 0; i < 5; i++)
			arr[i] = random.nextInt(100) + 1;
		System.out.print("Original array:\t");
		print(arr);
		System.out.println("\nMax Value:\t" + arrayMax(arr));
		System.out.println("Min Value:\t" + arrayMin(arr));
		arraySquared(arr);
		System.out.print("Squared array:\t");
		print(arr);
		arrayReverse(arr);
		System.out.print("\nReversed array:\t");
		print(arr);
	}

}
