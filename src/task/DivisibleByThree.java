package task;

import java.util.Scanner;

public class DivisibleByThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many number do you want to sum");
        int count =input.nextInt();

        for (int number = 1; number <= count; number++) {
            System.out.println("Enter number");
            int sumNumber = input.nextInt();
            if (sumNumber >= 1 && sumNumber <= 30){
                int divide = sumNumber % 3;
                if (divide == 0){
                    System.out.println("The number is divisible by 3");
                }
            }else System.out.println("The number is not divisible by 3");
        }
    }
}
