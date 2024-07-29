class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0;
        int n=cardPoints.length;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        int ans=sum;
        for(int i=k-1,j=n-1;i>=0;i--,j--){
            sum+=cardPoints[j]-cardPoints[i];
            ans=Math.max(ans,sum);
        }
        return ans;
    }
}
