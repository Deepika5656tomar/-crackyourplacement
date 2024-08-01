class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int cnt=0;
        int mid=nums[nums.length/2];
        for(int num:nums){
            cnt+=Math.abs(mid-num);
        }
        return cnt;
    }
}
