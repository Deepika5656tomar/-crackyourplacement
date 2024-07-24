class Solution {
    public int findPair(int n, int x, int[] arr) {
        // code here
        Arrays.sort(arr);
        int i=0;
        int j=1;
        while(j<n){
            if(arr[j]-arr[i]==x){
                return 1;
            }
            else if(arr[j]-arr[i]>x){
                i++;
                if(i==j){
                    j++;
                }
            }
            else{
                j++;
            }
        }
        return -1;
    }
}
