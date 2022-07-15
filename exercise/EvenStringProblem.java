package exercise;

public class EvenStringProblem {

    public static void main(String[] args) {
        String str = "I love rap song more";
        int count = 0, evenCounter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
                if (i == str.length() - 1) {
                    if (count % 2 == 0) {
                        evenCounter++;
                    }

                }
            } else {
                if (count % 2 == 0) {
                    evenCounter++;
                }
                count = 0;
            }
        }
        System.out.println(evenCounter);
    }
}
