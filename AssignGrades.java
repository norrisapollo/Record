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

public class AssignGrades {
	public static void printGrades(int[] scores) {
		int grade;
		char letterGrade;
		for (int i = 0; i < scores.length; i++) {
			grade = scores[i];
			if (grade >= 90) {
				letterGrade = 'A';
			} else if (grade >= 80) {
				letterGrade = 'B';
			} else if (grade >= 70) {
				letterGrade = 'C';
			} else if (grade >= 60) {
				letterGrade = 'D';
			} else {
				letterGrade = 'F';
			}
			System.out.println("Student " + i + " score is " + grade + " and grade is " + letterGrade);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("How many students are in class: ");
		int[] grades = new int[in.nextInt()];
		System.out.print("Enter " + grades.length + " grades: ");
		for (int i = 0; i < grades.length; i++) {
			grades[i] = in.nextInt();
		}
		System.out.println("Class size:     " + grades.length);
		System.out.print("Entered grades: ");
		for (int i = 0; i < grades.length; i++) {
			System.out.print(grades[i]);
			if (i < grades.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		printGrades(grades);
	}
}
