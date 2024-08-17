class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        Arrays.sort(arr);
        int mis=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==mis){
                mis++;
            }
        }
        return mis;
    }
}
