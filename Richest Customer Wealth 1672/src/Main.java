public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr = new int[][]{{1,2,3},{3,2,1}};
        int[][] arr2 = new int[][]{{2,8,7},{7,1,3},{1,9,5}};

        System.out.println(solution.maximumWealth(arr));
        System.out.println(solution.maximumWealth(arr2));
    }
}