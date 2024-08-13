class Solution
{
    public static int maxElement(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            
        }
        return max;
        
    }
    static void countingSort(int[] arr, int place){
        int n = arr.length;
        int[]  output = new int[n];
        int[] count = new int[10];
        for(int i = 0; i<n; i++){
            count[(arr[i]/place)%10]++;
        }
        for(int i = 1; i<count.length; i++){
            count[i] += count[i-1];
        }
        for(int i = n-1; i>=0; i--){
            int idx = count[(arr[i]/place)%10] -1;
            output[idx] = arr[i];
            count[(arr[i]/place)%10]--;
        }
        for(int i = 0; i<n; i++){
            arr[i] = output[i];
        }
    }
    static void radixSort(int arr[], int n) 
    { 
        // code here
        int max = maxElement(arr);
        for(int place = 1;  max/place > 0; place *= 10){
            countingSort(arr,place);
        }
    } 
}

