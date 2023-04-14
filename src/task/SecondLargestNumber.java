package task;

import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a series of numbers separated by spaces: ");
        String input = scanner.nextLine();

        // split the input string into an array of numbers
        String[] numbers = input.split("\\s+");

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // loop through the numbers array and update the largest and second largest variables
        for (String number : numbers) {
            int current = Integer.parseInt(number);
            if (current > largest) {
                secondLargest = largest;
                largest = current;
            } else if (current > secondLargest && current != largest) {
                secondLargest = current;
            }
        }

        // print the second largest number
        System.out.println("The second largest number is: " + secondLargest);
    }
}

