class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> combination= new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();
        backtrack(n,k,1,combination,result);
        return result;
    }
    public void backtrack(int n,int k,int start,List<Integer> combination , List<List<Integer>> result){
        if(combination.size()==k){
            result.add(new ArrayList<>(combination));
            return;
        }
        for(int i=start;i<=n;i++){
            combination.add(i);
            backtrack(n,k,i+1,combination,result);
            combination.remove(combination.size()-1);
        }
    }
}
