class Solution {
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        // code here
        ArrayList<ArrayList<Integer>> perm = new ArrayList<>();
        Collections.sort(arr);
        
        do {
            perm.add(new ArrayList<>(arr));
        } while (nextPermutation(arr));
        
        return perm;
    }

    private static boolean nextPermutation(ArrayList<Integer> arr) {
        int i = arr.size() - 2;
        while (i >= 0 && arr.get(i) >= arr.get(i + 1)) {
            i--;
        }
        if (i < 0) {
            return false;
        }
        int j = arr.size() - 1;
        while (arr.get(j) <= arr.get(i)) {
            j--;
        }
        Collections.swap(arr, i, j);
        Collections.reverse(arr.subList(i + 1, arr.size()));
        return true; 
    }
};
