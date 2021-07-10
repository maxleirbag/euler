package euler;

import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class solution001 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many times do you wish to find the sum of multiples of 3 or 5?");
		int times = input.nextInt();
		int sum = 0, number = 0;

		for (int run = 0; run < times; run++) {

			System.out.println("The number of which the multiples you wish to find:");
			number = input.nextInt();
			for (int i = 0; i < number; i++) {
				if (i % 3 == 0 || i % 5 == 0) {
					sum += i;
				}
			}
			System.out.println(sum);
			sum = 0;
		}
		input.close();
	}

}
