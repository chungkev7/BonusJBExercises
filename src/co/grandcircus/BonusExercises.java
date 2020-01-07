/*
 * @ author: Kevin Chung
 */

package co.grandcircus;

import java.util.Scanner;

public class BonusExercises {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Exercise 1
//		System.out.println("Enter some text:");
//		String userInput = scan.nextLine();
//		System.out.println(userInput);
		
		// Exercise 2
//		System.out.println("Enter a number:");
//		int userInput = scan.nextInt() + 1;
//		System.out.println(userInput);
		
		// Exercise 3
//		System.out.println("Enter a number:");
//		double userInput = scan.nextDouble() + .5;
//		System.out.println(userInput);
		
		// Exercise 4
//		System.out.println("Enter a number:");
//		double input1 = scan.nextDouble();
//		System.out.println("Enter another number:");
//		double input2 = scan.nextDouble();
//		double sum = input1 + input2;
//		System.out.println("The sum is " + sum);
		
		// Exercise 5
//		System.out.println("Enter a number:");
//		double input1 = scan.nextDouble();
//		System.out.println("Enter another number:");
//		double input2 = scan.nextDouble();
//		double product = input1 * input2;
//		System.out.println("The product is " + product);
		
		// Exercise 6
//		String toContinue = "";
//		do {
//		System.out.println("Hello, World!");
//		System.out.println("Would you like to continue? (y/n):");
//		toContinue = scan.nextLine().toLowerCase();
//		} while (!toContinue.startsWith("n"));
		
		// Exercise 9
//		System.out.println("Enter a language:");
//		String userInput = scan.nextLine();
//		switch (userInput) {
//		case "English":
//			System.out.println("Hello, World!");
//			break;
//		case "Spanish":
//			System.out.println("Hola Mundo!");
//			break;
//		case "Dutch":
//			System.out.println("Hallo wereld!");
//			break;
//		default:
//			System.out.println("Sorry, language not recognized or not in system.");
//			break;
//		}
		
		// exercise 10
//		double userInput = scan.nextDouble();
//		double heightDifference = 54 - userInput;
//		
//		if (userInput >= 54) {
//			System.out.println("Great, you can ride the Raptor!");
//		} else {
//			System.out.println("Sorry, you cannot ride the Raptor. You need " + String.format("%.1f", heightDifference) + " more inches.");
//		}

		// exercise 11
//		for (int i = 0; i <=9; i ++) {
//			System.out.print(i +" ");
//		}

		// exercise 12
//		for (int i = 9; i >= 0; i--) {
//		System.out.print(i +" ");
//	}

		// exercise 13
//		int userInput = scan.nextInt();
//		for (int i = userInput; i >= 0; i--) {
//		System.out.print(i +" ");
//	}

		// exercise 14
//		int userInput = scan.nextInt();
//		for (int i = 1 ; i <= userInput; i++) {
//			System.out.print(i*i + " ");
//		}

		// exercise 15
//		int userInput = scan.nextInt();
//		for (int i = 1 ; i <= userInput; i++) {
//			System.out.print(i*i*i + " ");
//		}

		// exercise 16
//		String x = " ";
//		StringBuilder y = new StringBuilder();
//		for(int i= 1; i<=10; i++)
//		   y = y.append("*").append(y.charAt(i));
//		System.out.println(y);
//		System.out.println(y);
//		
//		String x = " ";
//		for (int i = 1; i <= 10; i++) {
//			
//			System.out.println(x.con
//		}

		// exercise 18
//		int userInput = scan.nextInt();
//		int sum = 0;
//		for (int i = 1; i <= userInput; i++) {
//			sum +=i;
//		}
//		System.out.println(sum);

		// exercise 19
//		int userInput1 = scan.nextInt();
//		int userInput2 = scan.nextInt();
//		int sum = 0;
//		for (int i = userInput1; i <= userInput2; i++) {
//			sum +=i;
//		}
//		System.out.println("The sum of all numbers from " + userInput1 + " to " + userInput2 + " is " + sum + ".");

		// exercise 20
//		int userInput = scan.nextInt();
//		int sumDifference = 1;
//		int difference1 = userInput - 1;
//		int difference2 = userInput - 2;
//		
//		for (int i = userInput; i >= difference2; i--) {
//			sumDifference = sumDifference * i;
//		}
//		System.out.println("The product of " + userInput + ", " + difference1 + ", " + "and " + difference2 + " is " + sumDifference + "." );

		// exercise 21
//		String userInput = "";
//		String toContinue = "y";
//		while (toContinue.equals("y")) {
//		System.out.println("Enter a word: ");
//		userInput = userInput.concat(scan.nextLine().concat(" "));
//		System.out.println("Would you like to enter another word (y/n)?");
//		toContinue = scan.nextLine();
//		}
//		System.out.println(userInput);

		// exercise 22
//		String toContinue = "y";
//		System.out.println("Enter a number: ");
//		int userInput1 = scan.nextInt();
//		System.out.println("Enter another number: ");
//		int userInput2 = scan.nextInt();
//		while (toContinue.equals("y")) {
//			System.out.println("Enter a number to verify it is in the range: ");
//			int userInput3 = scan.nextInt();
//			System.out.println("Your range is " + userInput1 + "-" + userInput2);
//			if (userInput3 > userInput1 && userInput3 > userInput2) {
//				System.out.println(userInput3 + " is outside the range.");
//			} else if (userInput3 < userInput1 && userInput3 < userInput1) {
//				System.out.println(userInput3 + " is outside the range.");
//			} else {
//				System.out.println(userInput3 + " is in range.");
//			}
//			System.out.println("Would you like to continue (y/n)?");
//			scan.nextLine();
//			toContinue = scan.nextLine();
//		}

		// exercise 23
//		System.out.println("Enter some text: ");
//		String userInput = scan.nextLine().substring(0, 10);
//		System.out.println("The first ten characters were: " + userInput);

		// exercise 24
//		System.out.println("Enter some text: ");
//		String userInput = scan.nextLine();
//		String lastTenDigits = "";
//		if (userInput.length() > 10) {
//			lastTenDigits = userInput.substring(userInput.length()-10);
//		} else {
//			lastTenDigits = userInput;
//		}
//		System.out.println("The last ten characters were: " + lastTenDigits);

		// exercise 25
//		System.out.println("Enter a sentence: ");
//		String[] userInput = scan.nextLine().split(" ");
//		for (int i = 0; i < userInput.length; i++) {
//		System.out.println(userInput[i]);
//		}

		// exercise 26
//		int vowelCount = 0;
//		System.out.println("Enter some text: ");
//		String[] userInput = scan.nextLine().toLowerCase().split("");
//		for (int i = 0; i < userInput.length; i++) {
//			if (userInput[i].contains("a") || userInput[i].contains("e") || userInput[i].contains("i") || userInput[i].contains("o") || userInput[i].contains("u")) {
//				vowelCount++;
//			}
//		}
//		System.out.println("There were " + vowelCount + " vowels.");

		// exercise 27
//		int consonantCount = 0;
//		int vowelCount = 0;
//		System.out.println("Enter some text: ");
//		String userInput = scan.nextLine().replaceAll("\\s", "");
//		for (int i = 0; i < userInput.length(); i++) {
//			if (userInput.charAt(i) == 'a' || userInput.charAt(i) == 'e' || userInput.charAt(i) == 'i' || userInput.charAt(i) == 'o' || userInput.charAt(i) == 'u') {
//				vowelCount++;
//			} else {
//				consonantCount++;
//			}
//		} 
//		System.out.println("There were " + consonantCount + " consonants.");

		// exercise 28
//		System.out.println("Enter some text: ");
//		String userInput = scan.nextLine();
//		userInput = userInput.replace("a", "").replace("e", "").replace("i", "").replace("o", "").replace("u", "");
//		System.out.println(userInput);

		// didn't work
//		System.out.println("Enter some text: ");
//		String userInput = scan.nextLine();
//		for (int i = 0; i < userInput.length(); i++) {
//			if (userInput.charAt(i) == 'a' || userInput.charAt(i) == 'e' || userInput.charAt(i) == 'i'
//					|| userInput.charAt(i) == 'o' || userInput.charAt(i) == 'u') {
//				userInput = userInput.replace(target, replacement)
//			}
//		}
//		System.out.println(userInput);

		// didn't work
//		System.out.println("Enter some text: ");
//		String userInput = scan.nextLine();
//		StringBuilder word = new StringBuilder(userInput);
//		for (int i = 0; i < word.length(); i++) {
//			if (userInput.charAt(i) == 'a' || userInput.charAt(i) == 'e' || userInput.charAt(i) == 'i' || userInput.charAt(i) == 'o' || userInput.charAt(i) == 'u') {
//				word.deleteCharAt(i);
//			}
//		}
//		System.out.println(word);

		// exercise 29
//		System.out.println("Enter some text: ");
//		String userInput = scan.nextLine();
//		String userInput2 = "";
//		String userInput3 = "";
//		String userInput4 = "";
//		if (userInput.startsWith("A") || userInput.startsWith("a") || userInput.startsWith("E")
//				|| userInput.startsWith("e") || userInput.startsWith("I") || userInput.startsWith("i")
//				|| userInput.startsWith("O") || userInput.startsWith("o") || userInput.startsWith("U")
//				|| userInput.startsWith("u")) {
//			if (userInput.endsWith("A") || userInput.endsWith("a") || userInput.endsWith("E") || userInput.endsWith("e")
//					|| userInput.endsWith("I") || userInput.endsWith("i") || userInput.endsWith("O")
//					|| userInput.endsWith("o") || userInput.endsWith("U") || userInput.endsWith("u")) {
//				userInput2 = userInput.substring(0, 1);
//				userInput3 = userInput.substring(userInput.length() - 1);
//				userInput = userInput.replace("A", "").replace("a", "").replace("E", "").replace("e", "")
//						.replace("I", "").replace("i", "").replace("O", "").replace("o", "").replace("U", "")
//						.replace("u", "");
//				userInput4 = userInput2.concat(userInput).concat(userInput3);
//			} else {
//				userInput2 = userInput.substring(0, 1);
//				userInput3 = userInput.substring(userInput.length() - 1);
//				userInput = userInput.replace("A", "").replace("a", "").replace("E", "").replace("e", "")
//						.replace("I", "").replace("i", "").replace("O", "").replace("o", "").replace("U", "")
//						.replace("u", "");
//				userInput4 = userInput2.concat(userInput);
//			} 
//		} else {
//				userInput = userInput.replace("a", "").replace("e", "").replace("i", "").replace("o", "").replace("u", "");
//			}
//		System.out.println(userInput);
//		System.out.println(userInput2);
//		System.out.println(userInput3);
//		System.out.println(userInput4);

		// exercise 30
//		System.out.println("Enter some text: ");
//		StringBuilder reverseString = new StringBuilder(scan.nextLine()).reverse();
//		System.out.println(reverseString);
//		

		// Exercise 31
//		int[] array1 = new int[5];
//		array1[0] = 2;
//		array1[1] = 8;
//		array1[2] = 0;
//		array1[3] = 24;
//		array1[4] = 51;
//		
//		
//		System.out.println("Enter an index of the array:");
//		
//		int userInput = scan.nextInt();
//		
//		try {
//			System.out.println("The value at index " + userInput + " is " + array1[userInput]);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("That is not a valid index.");
//		}

		// Exercise 32
//		int[] array1 = new int[5];
//		array1[0] = 2;
//		array1[1] = 8;
//		array1[2] = 0;
//		array1[3] = 24;
//		array1[4] = 51;
//		
//		System.out.println("Enter a whole number:");
//		
//		int userInput = scan.nextInt();
//		
//		int arrayCount = 0;
//		for (int num : array1) {
//			if (num == userInput) {
//				System.out.println("The value " + userInput + " can be found at index " + arrayCount + ".");
//				arrayCount = 0;
//			} else {
//				arrayCount++;
//			}
//		}

		// Exercise 33
//		int[] array1 = new int[5];
//		array1[0] = 2;
//		array1[1] = 8;
//		array1[2] = 0;
//		array1[3] = 24;
//		array1[4] = 51;
//		
//		String toContinue = "";
//		String changeNum = "";
//		
//		while (!toContinue.startsWith("n")) {
//		System.out.println("Enter an index of the array:");
//		
//		int userInput = scan.nextInt();
//		
//		if (userInput >= 0 && userInput <= 4) {
//		System.out.println("The value at index " + userInput + " is " + array1[userInput] + ". Would you like to change it? (y/n):");
//			scan.nextLine();
//			changeNum = scan.nextLine().toLowerCase();
//			if (changeNum.startsWith("y")) {
//				System.out.println("Enter the replacement value at index " + userInput + ":");
//				array1[userInput] = scan.nextInt();
//				scan.nextLine();
//			}
//		} else {
//			System.out.println("That is not a valid index.\n");
//			scan.nextLine();
//		}
//
//		System.out.println("Would you like to continue? (y/n):");
//		toContinue = scan.nextLine().toLowerCase();
//		}

		// Exercise 34
		int[] array1 = new int[5];
		array1[0] = 16;
		array1[1] = 32;
		array1[2] = 64;
		array1[3] = 128;
		array1[4] = 256;

		System.out.println("Enter a command (half/double):");

		String userInput = scan.nextLine().toLowerCase();

		if (userInput.startsWith("d")) {
			for (int i = 0; i < array1.length; i++) {
				array1[i] *= 2;
			}
			System.out.println("The array now contains: ");
			for (int num : array1) {
				System.out.println(num);
			}
		} else {
			for (int i = 0; i < array1.length; i++) {
				array1[i] /= 2;
			}
			System.out.println("The array now contains: ");
			for (int num : array1) {
				System.out.println(num);
			}
		}

		// Alternate solution to double numbers
//		int arrayCounter = 0;
//		for (int num : array1) {
//			array1[arrayCounter] = num * 2;
//			arrayCounter++;
//		}

		scan.close();
	}

}