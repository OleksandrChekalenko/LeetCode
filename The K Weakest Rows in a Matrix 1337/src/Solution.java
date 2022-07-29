class Solution {
//    public int[] kWeakestRows(int[][] mat, int k) {
//        int[] arrLength = new int[mat.length];
//        int length;
//        for (int i = 0; i < mat.length; i++) {
//            length = 0;
//            for (int p : mat[i]) {
//                if (p == 1) {
//                    length++;
//                }
//            }
//            arrLength[i] = length;
//        }
//        int[] kArr = new int[k];
//        int kIndex = 0;
//        int count = 0;
//        int soldier = 0;
//        while (count < k) {
//            for (int i = 0; i < arrLength.length; i++) {
//                if (arrLength[i] == soldier) {
//                    kArr[kIndex] = i;
//                    count++;
//                    kIndex++;
//                    break;
//                }
//            }
//            soldier++;
//        }
//        return kArr;
//    }

    //Not my answer
    public int[] kWeakestRows(int[][] mat, int k) {
        int y = mat.length, x = mat[0].length, kix = 0;
        int[] vis = new int[y], ans = new int[k];
        for (int j = 0; j <= x; j++)
            for (int i = 0; i < y; i++) {
                if (vis[i] == 0 && (j == x || mat[i][j] == 0)) {
                    ans[kix++] = i;
                    vis[i]++;
                }
                if (kix == k) return ans;
            }
        return ans;
    }
}
