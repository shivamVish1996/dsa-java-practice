package hackerearth.contest.twx;

import java.util.Scanner;


/*find gcd using euclidean algorithm

If A = 0 then GCD(A,B)=B, since the GCD(0,B)=B, and we can stop.
If B = 0 then GCD(A,B)=A, since the GCD(A,0)=A, and we can stop.
Write A in quotient remainder form (A = B⋅Q + R)
Find GCD(B,R) using the Euclidean Algorithm since GCD(A,B) = GCD(B,R)
 */
public class CommonFactors {

    private static int findGcd(int num1, int num2) {

        if (num1 == 0)
            return num2;
        if (num2 == 0)
            return num1;
        if (num1 == num2)
            return num1;
        if (num1 > num2)
            return findGcd(num2, num1 % num2);
        else
            return findGcd(num1, num2 % num1);
    }

    private static int findCommonFactorCount(int gcd) {
        int count = 0;
        for (int i = 1; i <= gcd; i++) {
            if (gcd % i == 0) {
                System.out.println("common factor: " + i);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        //find gcd
        int gcd = findGcd(num1, num2);
        System.out.println("gcd: "+gcd);
        //find common factor count
        int commonFactorCount = findCommonFactorCount(gcd);

        System.out.println(commonFactorCount);
    }

}
