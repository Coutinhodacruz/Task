package task;

public class Ventures {
    public static void main(String[] args) {

        String word = "VENTURES";

        for (int i = 0; i < word.length(); i += 2) {
            System.out.println(word.charAt(i) + " " + word.charAt(i+1));
        }


//        String word = "VENTURES";

//        for (int i = 0; i < word.length(); i++) {
//            System.out.print(word.charAt(i));
//            if (i + 1 < word.length()){
//                System.out.print(" " + word.charAt(i+1));
//            }
//        }
//        System.out.println();
    }

}



