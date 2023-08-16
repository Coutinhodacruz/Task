package task;

import java.util.Arrays;

public class PositiveAndNegativeValue {

    public static void rearrange(int[] array){
        int number = 0;
        int secondNumber = array.length - 1;

        while (number < secondNumber){
            while (array[number] < 0 && number < secondNumber){
                number++;
            }
            while (array[secondNumber] >= 0 && number < secondNumber){
                secondNumber--;
            }
            if (number < secondNumber){
                int temp = array[number];
                array[number] = array[secondNumber];
                array[secondNumber] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {10, -1, 20, 4, 5, -9, -6};
        System.out.println("Before rearrangement: " + Arrays.toString(arr));
        rearrange(arr);
        System.out.println("After rearrangement: " + Arrays.toString(arr));

    }
}
