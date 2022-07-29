import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] mat1 = new int[][]{{1, 1, 0, 0, 0, 0},
                                   {1, 1, 1, 1, 0, 0},
                                   {1, 0, 0, 0, 0, 0},
                                   {1, 1, 0, 0, 0, 0},
                                   {1, 1, 1, 1, 1, 0}};
        int[][] mat2 = new int[][]{{1, 0, 0, 0},
                                   {1, 1, 1, 1},
                                   {1, 0, 0, 0},
                                   {1, 0, 0, 0}};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.kWeakestRows(mat1, 3)));
        System.out.println(Arrays.toString(solution.kWeakestRows(mat2, 2)));
    }
}
