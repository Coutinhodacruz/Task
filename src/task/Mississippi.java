package task;

public class Mississippi {

        public static void main(String[] args) {
            String word = "Mississippi";
            int countS = 0;
            int countI = 0;

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == 's' || word.charAt(i) == 'S') {
                    countS++;
                } else if (word.charAt(i) == 'i' || word.charAt(i) == 'I') {
                    countI++;
                }
            }

            System.out.println("Number of occurrences of 's': " + countS);
            System.out.println("Number of occurrences of 'i': " + countI);
    }

}
