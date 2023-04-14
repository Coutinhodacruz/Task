package task;

import java.util.Arrays;

public class MergeTwoSortedList {


    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int[] mergedArray = new int[array1.length + array2.length];


        int firstNumber = 0;
        int secondNumber = 0;
         int thirdNumber = 0;

        while (firstNumber < array1.length && secondNumber < array2.length) {
            if (array1[firstNumber] <= array2[secondNumber]) {
                mergedArray[thirdNumber++] = array1[firstNumber++];
            } else {
                mergedArray[thirdNumber++] = array2[secondNumber++];
            }
        }

        while (firstNumber < array1.length) {
            mergedArray[thirdNumber++] = array1[firstNumber++];
        }

        while (secondNumber < array2.length) {
            mergedArray[thirdNumber++] = array2[secondNumber++];
        }

        return mergedArray;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};

        int[] mergedArray = mergeSortedArrays(arr1, arr2);

        System.out.println(Arrays.toString(mergedArray));

    }

}
