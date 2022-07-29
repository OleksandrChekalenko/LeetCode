public class Solution {
    public int maximumWealth(int[][] accounts) {
        int higherWealth = 0;
        int wealth = 0;
        for (int[] account : accounts) {
            for (int i : account) {
                wealth += i;
            }
            if (higherWealth < wealth) {
                higherWealth = wealth;
            }
            wealth = 0;
        }
        return higherWealth;
    }
}