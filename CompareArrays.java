/*
 * Class: CSE 1321L
 * Section: 06
 * Term: Spring 2020
 * Instructor: Devi Samyuktha S
 * Name: Jabari Norris
 * Assignment 7
 */
package Lab12;

import java.util.Scanner;

public class CompareArrays {
	static boolean Compare(int[] arr1, int[] arr2) {

		boolean flag = true;

		for (int j = 0; j < arr1.length; j++) {

			if (arr1[j] != arr2[j]) {

				flag = false;

				return flag;

			}

		}

		return flag;

	}

	public static void main(String[] args) {

		System.out.print("Array size: ");

		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		sc.nextLine();

		int array1[] = new int[size];

		int array2[] = new int[size];

		System.out.print("First array: ");

		Scanner input1 = new Scanner(System.in); // Take console input for populating the array here

		for (int i = 0; i < size; i++) {

			array1[i] = input1.nextInt();

		}

		System.out.print("Second array: ");

		Scanner input2 = new Scanner(System.in);

		for (int i = 0; i < size; i++) {

			array2[i] = input2.nextInt();

		}

		if (Compare(array1, array2)) {

			System.out.println("Judgement: The arrays are identical");

		}

		else

			System.out.println("Judgement: The arrays are not identical");

	}
}
