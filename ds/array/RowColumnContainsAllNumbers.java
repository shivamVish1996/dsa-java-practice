package ds.array;

import java.util.ArrayList;
import java.util.List;

public class RowColumnContainsAllNumbers {
    public static boolean checkValid(int[][] matrix) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(list.contains(matrix[i][j]))
                    return false;
            }
            list.clear();
        }

        return true;
    }

    public static void main(String[] args) {
        //int[][] matrix = {{1, 2, 3}, {3, 1, 2}, {2, 3, 1}};
        int[][] matrix = {{1,1,1},{1,2,3},{1,2,3}};

        System.out.println(checkValid(matrix));
    }
}
