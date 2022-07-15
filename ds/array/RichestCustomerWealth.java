package ds.array;

import java.util.Arrays;

public class RichestCustomerWealth {

    public static int maximumWealth(int[][] accounts) {
        int resultMax = Integer.MIN_VALUE;
        int curMax;
        for (int i = 0; i < accounts.length; i++) {
            curMax = 0;
            for (int j = 0; j < accounts[i].length; j++)
                curMax = curMax + accounts[i][j];

            if (curMax > resultMax)
                resultMax = curMax;
        }
        return resultMax;
    }


    public static void main(String[] args) {
        //   int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        //   int[][] accounts = {{1,5},{7,3},{3,5}};
        int[][] accounts = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        ;

        System.out.println(maximumWealth(accounts));
    }

}
