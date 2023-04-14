package task;

import java.util.Arrays;

public class ProductOfElement {

    public static void modifyList(int[] arr) {
        int number = arr.length;
        int[] productOfLeft = new int[number];
        int[] productOfRight = new int[number];
        int[] result = new int[number];

        productOfLeft[0] = 1;
        productOfRight[number - 1] = 1;

        for (int i = 1; i < number; i++) {
            productOfLeft[i] = productOfLeft[i - 1] * arr[i - 1];
        }

        for (int i = number - 2; i >= 0; i--) {
            productOfRight[i] = productOfRight[i + 1] * arr[i + 1];
        }

        for (int i = 0; i < number; i++) {
            result[i] = productOfLeft[i] * productOfRight[i];
        }

        for (int i = 0; i < number; i++) {
            arr[i] = result[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, };
        modifyList(arr);
        System.out.println(Arrays.toString(arr));

    }

}
