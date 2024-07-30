import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> m=new HashMap();
        int presum=0;
        int cnt=0;
        m.put(0,1);
        for(int i=0;i<n;i++){
            presum+=nums[i];
            int r=presum-k;
            cnt+=m.getOrDefault(r,0);
            m.put(presum,m.getOrDefault(presum,0)+1);
        }
        return cnt;
    }
}
