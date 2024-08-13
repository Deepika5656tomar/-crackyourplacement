class  Solution
{
    long minAdjustmentCost(long A[], int n,int target)
    {
        long M = 100;
        long[][] dp = new long[n][101];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= 100; j++) {
                dp[i][j] = Long.MAX_VALUE;
            }
        }
        for (int i = 0; i <= 100; i++) {
            dp[0][i] = Math.abs(A[0] - i);
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= 100; j++) {
                for (int k = Math.max(0, j - target); k <= Math.min(100, j + target); k++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][k] + Math.abs(A[i] - j));
                }
            }
        }
        long minCost = Long.MAX_VALUE;
        for (int i = 0; i <= 100; i++) {
            minCost = Math.min(minCost, dp[n - 1][i]);
        }
        return minCost;
    }
}
