package fp;

public class Division {

    public static int div1(int a, int b) {
        return a / b;
    }

    public static int div2(int a, int b) {
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        return (int) (a / (float) b);
    }

    public static void main(String[] args) {
        //    System.out.println(div1(1, 0));
        System.out.println("div2: " + div2(1, 0));
    }
}
