package task;

import java.util.Arrays;

public class RotateByOneIndex {

    public static void rightRotateBYOne(int[] array){
        int last = array[array.length -1];
        for (int i = array.length - 2; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        array[0] = last;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println("Before rotate " + Arrays.toString(arr));
        rightRotateBYOne(arr);
        System.out.println("After rotate " + Arrays.toString(arr));
    }
}
