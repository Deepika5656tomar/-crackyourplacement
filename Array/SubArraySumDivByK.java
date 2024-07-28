class Solution {
    public int subarraysDivByK(int[] nums, int k) {
         int[] remainderFrequency = new int[k];
        remainderFrequency[0] = 1;
        
        int runningSum = 0;
        int count = 0;
        
        for (int num : nums) {
            runningSum += num;
            int remainder = runningSum % k;
            if (remainder < 0) {
                remainder += k;
            }
            count += remainderFrequency[remainder];
            remainderFrequency[remainder]++;
        }
        return count;
    }
}
