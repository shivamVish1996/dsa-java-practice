package exercise;

public class CounterProblem {

    public static void main(String[] args) {
        String str = "12352718";
        int count = 0, first, second, third;

        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length - 2; i++) {

            first = Integer.parseInt(String.valueOf(ch[i]));
            second = Integer.parseInt(String.valueOf(ch[i + 1]));
            third = Integer.parseInt(String.valueOf(ch[i + 2]));

            if ((first + second) == third)
                count++;
        }
        System.out.println(count);
    }
}
