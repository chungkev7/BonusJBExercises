/*
 * @ author: Kevin Chung
 */

package co.grandcircus;

import java.util.ArrayList;
import java.util.Scanner;

public class BonusExercises {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Exercise 1
		// Outputs user input back to console
//		System.out.println("Enter some text:");
//		String userInput = scan.nextLine();
//		System.out.println(userInput);

		// Exercise 2
		// Outputs user input + 1
//		System.out.println("Enter a number:");
//		int userInput = scan.nextInt() + 1;
//		System.out.println(userInput);

		// Exercise 3
		// Outputs user input + .5
//		System.out.println("Enter a number:");
//		double userInput = scan.nextDouble() + .5;
//		System.out.println(userInput);

		// Exercise 4
		// Outputs sum of user inputs (2)
//		System.out.println("Enter a number:");
//		double input1 = scan.nextDouble();
//		System.out.println("Enter another number:");
//		double input2 = scan.nextDouble();
//		double sum = input1 + input2;
//		System.out.println("The sum is " + sum);

		// Exercise 5
		// Outputs product of user inputs (2)
//		System.out.println("Enter a number:");
//		double input1 = scan.nextDouble();
//		System.out.println("Enter another number:");
//		double input2 = scan.nextDouble();
//		double product = input1 * input2;
//		System.out.println("The product is " + product);

		// Exercise 6
		// Outputs Hello, World until user selects no
//		String toContinue = "";
//		do {
//		System.out.println("Hello, World!");
//		System.out.println("Would you like to continue? (y/n):");
//		toContinue = scan.nextLine().toLowerCase();
//		} while (!toContinue.startsWith("n"));

		// Exercise 9
		// Outputs hello, world in difference language based on user input
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
		// Checks if user is tall enough to ride the Raptor
//		double userInput = scan.nextDouble();
//		double heightDifference = 54 - userInput;
//		
//		if (userInput >= 54) {
//			System.out.println("Great, you can ride the Raptor!");
//		} else {
//			System.out.println("Sorry, you cannot ride the Raptor. You need " + String.format("%.1f", heightDifference) + " more inches.");
//		}

		// exercise 11
		// Output all the numbers from 0 to 9
//		for (int i = 0; i <=9; i ++) {
//			System.out.print(i +" ");
//		}

		// exercise 12
		// Output all the numbers from 9 to 0
//		for (int i = 9; i >= 0; i--) {
//		System.out.print(i +" ");
//	}

		// exercise 13
		// Output all numbers from user input all the way to 0
//		int userInput = scan.nextInt();
//		for (int i = userInput; i >= 0; i--) {
//		System.out.print(i +" ");
//	}

		// exercise 14
		// Output the squares of all the numbers from 1 to user input
//		int userInput = scan.nextInt();
//		for (int i = 1 ; i <= userInput; i++) {
//			System.out.print(i*i + " ");
//		}

		// exercise 15
		// Output the cubes of all the numbers from 1 to user input
//		int userInput = scan.nextInt();
//		for (int i = 1 ; i <= userInput; i++) {
//			System.out.print(i*i*i + " ");
//		}

		// exercise 16
		// Outputs a triangle of asterisks with a height of ten
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
		// Calculates the sum of all numbers from 1 to the number entered
//		int userInput = scan.nextInt();
//		int sum = 0;
//		for (int i = 1; i <= userInput; i++) {
//			sum +=i;
//		}
//		System.out.println(sum);

		// exercise 19
		// Calculates the sum of all numbers between userinput1 and userinput2
//		int userInput1 = scan.nextInt();
//		int userInput2 = scan.nextInt();
//		int sum = 0;
//		for (int i = userInput1; i <= userInput2; i++) {
//			sum +=i;
//		}
//		System.out.println("The sum of all numbers from " + userInput1 + " to " + userInput2 + " is " + sum + ".");

		// exercise 20
		// Calculates the product of the number and the two preceding numbers
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
		// Prompts user to enter a series of words. Once completed, output a sentence
		// containing all the words
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
		// Prompts user for two numbers to determine the range. Prompt user to enter a
		// number to determine if it is in the range
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
		// Prompt user to enter a string. Extract and output the first ten characters of
		// the string
//		System.out.println("Enter some text: ");
//		String userInput = scan.nextLine().substring(0, 10);
//		System.out.println("The first ten characters were: " + userInput);

		// exercise 24
		// Prompt user to enter a string. Extract and output the last ten characters of
		// the string
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
		// Splits user input into separate words and display each on its own line
//		System.out.println("Enter a sentence: ");
//		String[] userInput = scan.nextLine().split(" ");
//		for (int i = 0; i < userInput.length; i++) {
//		System.out.println(userInput[i]);
//		}

		// exercise 26
		// Counts how many vowels were in the user input
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
		// Counts how many consonants were in the user input
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
		// Removes all the vowels from userinput and output the text
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
		// Reverses user input text
//		System.out.println("Enter some text: ");
//		StringBuilder reverseString = new StringBuilder(scan.nextLine()).reverse();
//		System.out.println(reverseString);
//		

		// Exercise 31
		// Displays index of user input
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
		// Checks if user input is in array and at which index
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
		// Lets user replace number at user input index of array
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
		// Halfs/doubles the numbers in array based on user input
//		int[] array1 = new int[5];
//		array1[0] = 16;
//		array1[1] = 32;
//		array1[2] = 64;
//		array1[3] = 128;
//		array1[4] = 256;
//
//		System.out.println("Enter a command (half/double):");
//
//		String userInput = scan.nextLine().toLowerCase();
//
//		if (userInput.startsWith("d")) {
//			for (int i = 0; i < array1.length; i++) {
//				array1[i] *= 2;
//			}
//			System.out.println("The array now contains: ");
//			for (int num : array1) {
//				System.out.println(num);
//			}
//		} else {
//			for (int i = 0; i < array1.length; i++) {
//				array1[i] /= 2;
//			}
//			System.out.println("The array now contains: ");
//			for (int num : array1) {
//				System.out.println(num);
//			}
//		}

		// Alternate solution to double numbers
//		int arrayCounter = 0;
//		for (int num : array1) {
//			array1[arrayCounter] = num * 2;
//			arrayCounter++;
//		}

		// Exercise 35
		// Outputs the string at user input index and the letter index
//		String[] arr1 = new String[5];
//		arr1[0] = "cow";
//		arr1[1] = "elephant";
//		arr1[2] = "jaguar";
//		arr1[3] = "horse";
//		arr1[4] = "crow";
//		
//		String toContinue = "";
//		
//		while (!toContinue.startsWith("n")) {
//		System.out.println("Enter two indices separated by a space (i.e. 1 2):");
//		String[] input1 = scan.nextLine().split(" ");
//		String num1 = input1[0];
//		String num2 = input1[1];
//		try {
//			String animal = arr1[Integer.parseInt(num1)];
//			char letter = animal.charAt(Integer.parseInt(num2));
//			System.out.println("The value at index " + num1 + " is " + animal + ". The letter at index " + num2 + " is " + letter + ".");
//		} catch (NumberFormatException e) {
//			System.out.println("These are not valid indices.");
//		} catch (StringIndexOutOfBoundsException e) {
//			System.out.println("The indices do not exist.");
//		}
//		System.out.println("Continue? (y/n):");
//		toContinue = scan.nextLine().toLowerCase();
//		}

		// Exercise 36, only displays part of the song
//		int[] arr1 = new int[5];
//		arr1[0] = 12;
//		arr1[1] = 11;
//		arr1[2] = 10;
//		arr1[3] = 9;
//		arr1[4] = 8;
//		
//		String[] arr2 = new String[5];
//		arr2[0] = "Drummers Drumming";
//		arr2[1] = "Pipers Piping";
//		arr2[2] = "Lords a-Leaping";
//		arr2[3] = "Ladies Dancing";
//		arr2[4] = "Maids a-Milking";
//		
//		String toSing = "";
//		
//		while(!toSing.startsWith("q")) {
//		System.out.println("Enter a command (sing/quit):");
//		toSing = scan.nextLine().toLowerCase();
//		
//		if (toSing.startsWith("s")) {
//			for (int i = 0; i < arr1.length; i++) {
//				System.out.println(arr1[i] + " " + arr2[i]);
//			}
//		}
//		System.out.println("");
//		}

		// Exercise 37
		// Outputs sum of array
//		int[] arr1 = new int[5];
//		int counter = 0;
//		while (counter < 5) {
//		System.out.println("Enter a number:");
//		arr1[counter] = scan.nextInt();
//		counter++;
//		}
//		int sum = 0;
//		for (int num : arr1) {
//			sum +=num;
//		}
//		System.out.println(arr1[0] + " + " + arr1[1] + " + " + arr1[2] + " + " + arr1[3] + " + " + arr1[4] + " = " + sum);

		// Exercise 38
		// Outputs average of array
//		int[] arr1 = new int[5];
//		int counter = 0;
//		while (counter < 5) {
//		System.out.println("Enter a number:");
//		arr1[counter] = scan.nextInt();
//		counter++;
//		}
//		
//		int sum = 0;
//		for (int num : arr1) {
//			sum +=num;
//		}
//		
//		double avg = (double)sum / arr1.length;
//		
//		System.out.println("(" + arr1[0] + " + " + arr1[1] + " + " + arr1[2] + " + " + arr1[3] + " + " + arr1[4] + ")" + " / " + arr1.length + " = " + String.format("%.2f", avg));

		// Exercise 39
		// Outputs the numbers in array in ascending order
//		int[] arr1 = new int[5];
//		int counter = 0;
//		while (counter < 5) {
//		System.out.println("Enter a number:");
//		arr1[counter] = scan.nextInt();
//		counter++;
//		}
//		
//		Arrays.sort(arr1);
//		
//		for (int num : arr1) {
//			System.out.print(num + " ");
//		}

		// Exercise 40
		// Outputs the median of the array
//		int[] arr1 = new int[5];
//		int counter = 0;
//		while (counter < 5) {
//		System.out.println("Enter a number:");
//		arr1[counter] = scan.nextInt();
//		counter++;
//		}
//		Arrays.sort(arr1);
//		System.out.println("The median of " + Arrays.toString(arr1) + " is " + arr1[2] + ".");

		// Exercise 41
		// Divides the two user input numbers to 2 decimal places
//		System.out.println("Enter a number:");
//		int num1 = scan.nextInt();
//		System.out.println("Enter another number:");
//		int num2 = scan.nextInt();
//		double avg = (double) num1 / num2;
//		System.out.println(num1 + "/" + num2 + " is approximately " + String.format("%.2f", avg) + ".");

		// Exercise 42
		// Created a new point object
//		System.out.println("Enter an X coordinate (whole number):");
//		int input1 = scan.nextInt();
//		System.out.println("Enter a Y coordinate (whole number):");
//		int input2 = scan.nextInt();
//		Point p1 = new Point(input1, input2);
//		System.out.println("You have created a point object " + p1 + ".");

		// Exercise 43
		// Calculates the diagonal of the coordinates from the new point object
//		System.out.println("Enter an X coordinate (whole number):");
//		int input1 = scan.nextInt();
//		System.out.println("Enter a Y coordinate (whole number):");
//		int input2 = scan.nextInt();
//		Point p1 = new Point(input1, input2);
//		System.out.println("You have created a point object " + p1 + ". It has a distance of " + p1.calculateDistance(input1, input2) + ".");

		// Exercise 44
		// Calculates the midpoint between the two coordinates of the point objects
//		System.out.println("Enter an X coordinate (whole number):");
//		int input1 = scan.nextInt();
//		System.out.println("Enter a Y coordinate (whole number):");
//		int input2 = scan.nextInt();
//		Point p1 = new Point(input1, input2);
//		System.out.println("Enter an X coordinate (whole number):");
//		int input3 = scan.nextInt();
//		System.out.println("Enter a Y coordinate (whole number):");
//		int input4 = scan.nextInt();
//		Point p2 = new Point(input3, input4);
//		
//		p1.calculateMidpoint(p2.getX(), p2.getY());

		// Exercise 45
		// Calculates area and perimeter of a square
//		System.out.println("Enter a side length:");
//		Square s1 = new Square(scan.nextInt());
//		System.out.println("The square has side length " + s1.getSideLength() + ". Its area is " + s1.calculateArea() + " and its perimeter is " + s1.calculatePerimeter() + ".");

		// Exercise 46
		// Calculates area and perimeter of a triangle
//		System.out.println("Enter the side lengths of a triangle, separated by a space (i.e. 1 2 3):");
//		String[] input = scan.nextLine().split(" ");
//		int side1Length = Integer.parseInt(input[0]);
//		int side2Length = Integer.parseInt(input[1]);
//		int side3Length = Integer.parseInt(input[2]);
//		Triangle tri1 = new Triangle(side1Length, side2Length, side3Length);
//		System.out.println("The triangle has side lengths " + side1Length + ", " + side2Length + ", and "
//				+ side3Length + ". Its area is " + tri1.calculateArea() + " and its perimeter is " + tri1.calculatePerimeter() + ".");

		// Exercise 47
		// Prompt user to enter a string, stores string in a list. Displays contents
		// separated by a space
//		StringBuilder string1 = new StringBuilder();
//		String toContinue = "";
//		
//		while (!toContinue.startsWith("n")) {
//		System.out.println("Enter some text:");
//		string1.append(scan.nextLine() + " ");
//		System.out.println("You have entered: " + string1);
//		System.out.println("Would you like to continue? (y/n)");
//		toContinue = scan.nextLine().toLowerCase();
//		}

		// Exercise 48
		// Prompt user to enter as many numbers, stores numbers in a list. Outputs the
		// sum of the numbers after user quits
//		String input = "";
//		String toContinue = "";
//		ArrayList<Double> list1 = new ArrayList<>();
//		double listSum = 0;
//
//		while (!toContinue.equals("n")) {
//			System.out.println("Enter a number (q to quit):");
//			try {
//				input = scan.nextLine();
//				if (input.equals("q")) {
//					toContinue = "n";
//				} else {
//					list1.add(Double.parseDouble(input));
//				}
//			} catch (NumberFormatException e) {
//				System.out.println("Please enter a number or q to quit.");
//			}
//		}
//
//		for (Double num : list1) {
//			listSum += num;
//		}
//		
//		System.out.println("The sum of " + list1.toString() + " = " + listSum);

		// Exercise 49
		// Creates a list of squares, displays statistics for the list
//		String input = "";
//		String toContinue = "";
//		ArrayList<Square> squareList = new ArrayList<>();
//		double totalSquareArea = 0;
//		double totalSquarePerimeter = 0;
//		int largestSide = 0;
//		int smallestSide = 10000000;
//		
//		while (!toContinue.equals("n")) {
//			System.out.println("Enter a side length (q to quit):");
//		try {
//			input = scan.nextLine();
//			if (input.equals("q")) {
//				toContinue = "n";
//			} else {
//				squareList.add(new Square(Integer.parseInt(input)));
//			}
//		} catch (NumberFormatException e) {
//			System.out.println("Please enter a whole number for side lengths for 'q' to quit.\n");
//		}
//		}
//		
//		for (Square sq : squareList) {
//			totalSquareArea += sq.calculateArea();
//			totalSquarePerimeter += sq.calculatePerimeter();
//			if (sq.getSideLength() > largestSide) {
//				largestSide = sq.getSideLength();
//			}
//			if (sq.getSideLength() < smallestSide) {
//				smallestSide = sq.getSideLength();
//			}
//		}
//		
//		System.out.println("You have created " + squareList.size() + " square(s).");
//		System.out.println("Largest: " + largestSide);
//		System.out.println("Smallest: " + smallestSide);
//		System.out.println("Average area: " + String.format("%.2f", totalSquareArea / squareList.size()));
//		System.out.println("Average perimeter: " + String.format("%.2f", totalSquarePerimeter / squareList.size()));
//		

		// Exercise 50
		// Create a list of triangles, displays statistics for the list
		ArrayList<Triangle> triangleList = new ArrayList<>();
		String toContinue = "";
		String input = "";
		String[] sideLengths = new String[3];
		double totalTriangleArea = 0;
		double totalTrianglePerimeter = 0;
		
		while (!toContinue.equals("n")) {
		System.out.println("Enter the side lengths of a triangle, separated by a space (i.e. 1 2 3), or enter q to quit:");
		
		input = scan.nextLine();
		
		try {
			if (input.startsWith("q")) {
				toContinue = "n";
			} else {
				sideLengths = input.split(" ");
				triangleList.add(new Triangle(Integer.parseInt(sideLengths[0]), Integer.parseInt(sideLengths[1]), Integer.parseInt(sideLengths[2])));
			}
		} catch (NumberFormatException e) {
			System.out.println("Please enter 3 whole numbers separated by a space, or enter q to quit.\n");
		}
		}
		
		for (Triangle t : triangleList) {
			totalTriangleArea += t.calculateArea();
			totalTrianglePerimeter += t.calculatePerimeter();
		}
		
		System.out.println("You have created " + triangleList.size() + " triangle(s).");
		System.out.println("Average area: " + String.format("%.2f", totalTriangleArea / triangleList.size()));
		System.out.println("Average perimeter: " + String.format("%.2f", totalTrianglePerimeter / triangleList.size()));
		
		scan.close();
	}

}