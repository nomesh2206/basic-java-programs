public class Solution {
    /*
     * @param A, B: Two integer arrays.
     * @return: Their smallest difference.
     */
    public int smallestDifference(int[] A, int[] B) {
        if (A == null || B == null || A.length == 0 || B.length == 0) {
            return 0;
        }

        Arrays.sort(A);
        Arrays.sort(B);

        int i = 0, j = 0;
        int minDiff = Integer.MAX_VALUE;
        while (i < A.length && j < B.length) {
            minDiff = Math.min(Math.abs(A[i] - B[j]), minDiff);
            if (A[i] < B[j]) {
                i++;
            } else {
                j++;
            }
        }
        return minDiff;
    }
}
