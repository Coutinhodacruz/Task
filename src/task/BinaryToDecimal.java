package task;

import java.util.Scanner;

public class BinaryToDecimal {

    public static int convertBinaryToDecimal(int binary){
        int decimal = 0;
        int count = 0;

        while (binary != 0){
            int digit = binary % 10;
            decimal += digit * Math.pow(2, count);
            binary /= 10;
            count++;
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a binary integer: ");
        int binary = input.nextInt();
        int decimal = convertBinaryToDecimal(binary);
        System.out.println("The decimal equivalent of " + binary + " is " + decimal);
    }
}
