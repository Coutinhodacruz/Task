package task;

public class NonRepeatingInteger {

    public static int findFirstUnique(int[] array) {
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return array[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1};
        int firstUnique = findFirstUnique(arr);
        System.out.println(firstUnique);

    }

}
