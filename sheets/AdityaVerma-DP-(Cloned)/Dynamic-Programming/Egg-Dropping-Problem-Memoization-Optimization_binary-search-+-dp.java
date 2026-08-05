//constraints were so high we neede this!! eggs <=1000 and floors <=1000
class Solution {
    static int dp[][] = new int[1001][1001];
    {
        for (int d[] : dp) Arrays.fill(d, -1);
    }

    static int eggDrop(int n, int k) {

        if (k == 0 || k == 1) return k;
        if (n == 1) return k;

        if (dp[n][k] != -1) return dp[n][k];

        int low = 1;
        int high = k;
        int min = Integer.MAX_VALUE;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int breakk;
            if (dp[n - 1][mid - 1] == -1)
                breakk = dp[n - 1][mid - 1] = eggDrop(n - 1, mid - 1);
            else
                breakk = dp[n - 1][mid - 1];

            int nbreakk;
            if (dp[n][k - mid] == -1)
                nbreakk = dp[n][k - mid] = eggDrop(n, k - mid);
            else
                nbreakk = dp[n][k - mid];

            int temp = 1 + Math.max(breakk, nbreakk);
            min = Math.min(min, temp);

            if (breakk < nbreakk) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return dp[n][k] = min;
    }
}