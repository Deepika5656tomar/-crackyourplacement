class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(0,nums,ans);
        return ans;
    }
    public void backtrack(int index,int[] nums,List<List<Integer>> ans){
        if(index==nums.length){
            List<Integer> ds=new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            if(!ans.contains(ds)){
                ans.add(new ArrayList<>(ds));
            }
            
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(i,index,nums);
            backtrack(index+1,nums,ans);
            swap(i,index,nums);
        }
    }
    public void swap(int i,int j,int[] nums){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
}
