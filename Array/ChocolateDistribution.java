class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        Collections.sort(a);
        long result=Long.MAX_VALUE;
        for(int i=0;i<n-m+1;i++){
            int firstEl=a.get(i);
            int lastEl=a.get(i+m-1);
            int diff=lastEl-firstEl;
            result=Math.min(result,diff);
        }
        return result;
    }
}
