/**
 * File: Converting Data Types
 * Author: Mikah Ho
 * Date Created: Mar 4, 2026
 * Date Last Modified: Mar 4, 2026
 */

import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
	}

	public static void q1() {
		//Write question 1 code here

		Scanner input = new Scanner(System.in);

		int num;

		System.out.print("Input an integer: ");
		num = (int)input.nextInt();

		System.out.println(num + 3);

	}

	public static void q2() {
		//Write question 2 code here

		Scanner input = new Scanner(System.in);

		String num;

		System.out.print("Input a number: ");
		num = input.nextLine() + "4";

		System.out.println(Double.parseDouble(num) + 2);

	}

	public static void q3() {
		//Write question 3 code here

		Scanner input = new Scanner(System.in);

		double rad;

		System.out.print("Input a radius: ");
		rad = input.nextDouble();

		System.out.println(3.14*(Math.pow(rad, 2)));

	}

	public static void q4() {
		//Write question 4 code here

		Scanner input = new Scanner(System.in);

		double num;

		System.out.print("Input a number: ");
		num = input.nextDouble();

		System.out.println(Math.floor(num*12));

	}

}
