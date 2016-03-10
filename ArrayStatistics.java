// This project minipulates an array of inputs from you

import java.util.Scanner;

public class ArrayStatistics{
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("How many numbers do you want to input? \033[4m");
		int input1 = Integer.parseInt(scan.next());
		if (input1 < 2) {

				// I can't make it not work with decimals..........

			System.out.println("\033[0m\033[1mYour input of " + input1 + " less than 2!\033[0m");
		} else {
			int[] array = new int[input1];
			int firstnumebr;
			int secondnumber;
			for (int a = 0; a < input1; a++){
				System.out.print("\033[0m" + (a + 1) + ") ");
				array[a] = Math.abs(Integer.parseInt(scan.next()));
			}
			System.out.print("\033[0m");
			System.out.println("Your numbers are: " + repeatnumbers(array,input1));
			System.out.println("The biggest number is: " + highestnumber(array,input1));
			System.out.println("The 2nd highest number is: " + secondLargest(array));
			System.out.println("The lowest number is: " + lowestnumber(array,input1));
			System.out.print("Enter a number to search for: \033[4m");
			
			int input2 = Integer.parseInt(scan.next());
			
			System.out.print("\033[0m");
			System.out.println(checkinputinarray(input2,array));
			System.out.print("Enter a number to search for: \033[4m");
			
			int input3 = Integer.parseInt(scan.next());
			
			System.out.println("\033[0m" + checkinputinarray(input3,array));
			System.out.println("The sum is: " + sum(array));
			System.out.println("The mean is: " + mean(array));
		}
	}

	public static int mean(int[] insideArray) {	// finds the average
		int result = 0;
		int counter = 0;
		for (int i = 0; i < insideArray.length; i++) {
			result = result + insideArray[i];
			counter++;
		}
		return (result/counter);
	}

	public static int sum(int[] insideArray) {	// finds the sum
		int result = 0;
		for (int i = 0; i < insideArray.length; i++) {
			result = result + insideArray[i];
		}
		return result;
	}

	public static String checkinputinarray(int input, int[] insideArray) { //sees if the number that the user inputs is in the array.
		String result = (input + " \033[1mIS NOT\033[0m in the array.");
		for (int i = 0; i < insideArray.length; i++) {
			if (input == insideArray[i]) {
				result = (input + " \033[1mIS\033[0m in the array.");
			}
		}
		return result;
	}

	public static String repeatnumbers(int[] input, int max) {	// simply repeats the numbers :P
		String result = "";
		for (int b = 0; b < max; b++){
			if (b == max - 1) {
				result = result + (input[b]) + ".";
			} else {
				result = result + input[b] + " ";
			}
		}
		return result;
	}	

	public static int highestnumber(int[] input, int max) {
		int highnumber = input[0];
		for (int i = 0; i < max; i++){
			if (input[i] > highnumber) {	// This is to find the highest number
				highnumber = input[i];
			}
		}
		return highnumber;
	}

	public static int lowestnumber(int[] input, int max) {	// finds what the lowest number is
		int lownumber = input[0];
		for (int i = 0; i < max; i++) {
			if (input[i] < lownumber) {
				lownumber = input[i];
			}
		}
		return lownumber;
	}

	public static int secondLargest(int[] input) {	// finds the second highest number
		int largest,secondLargest;
		if(input[0] > input[1]) {
			largest = input[0];
			secondLargest = input[1];
		} else {
			largest = input[1];
			secondLargest = input[0];
		}
		for(int i = 2; i < input.length; i++) {
			if((input[i] <= largest) && input[i] > secondLargest) {
				secondLargest = input[i];
			} else if(input[i] > largest) {
				secondLargest = largest;
				largest = input[i];
			}
		}
		return secondLargest;
	}
}