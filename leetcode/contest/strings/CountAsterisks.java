package leetcode.contest.strings;

public class CountAsterisks {

    public static int countAsterisks(String s) {
        int count = 0;
        int c = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '|' && c == 0) {
                c = 1;
                continue;
            }
            if (s.charAt(i) == '|' && c == 1) {
                int j = 0;
                if (s.charAt(i) == '*') {
                    count++;
                    System.out.println(count);
                } else if (j != 0 && s.charAt(i) == '|') c = 0;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "l|*e*et|c**o|*de|";
        System.out.println(countAsterisks(str));
    }
}
