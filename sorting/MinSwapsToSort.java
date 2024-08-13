class Solution
{
    public void swap(int[] arr, int x, int y)
    {
        int t= arr[x];
        arr[x]=arr[y];
        arr[y]=t;
    }
    //Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int nums[])
    {
        // Code here
        int count=0;
        int n=nums.length;
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int x=0;x<n;x++)
            map.put(nums[x],x);
        Arrays.sort(nums);
        
        for(int x=0; x<n; x++)
        {
            if(x == map.get(nums[x]))
                continue;
            else
            {
                count++;
                swap(nums,x,map.get(nums[x]));
                x--;
            }
        }
        return count;
    }
