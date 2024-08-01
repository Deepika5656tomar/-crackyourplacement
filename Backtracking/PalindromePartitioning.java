class Solution {
    List<List<String>> ans=new ArrayList<>();
    public List<List<String>> partition(String s) {
        List<String> al=new ArrayList<>();
        findAns(s,al,0);
        return ans;
    }

    public void findAns(String s,List<String> al,int index){
        if(index==s.length()){
            ans.add(new ArrayList<>(al));
        }
        
        for(int i=index;i<s.length();i++){
            String newString = s.substring(index, i + 1);
            if(palindrome(newString)){
                al.add(newString);
                findAns(s,al,i+1);
                al.remove(al.size()-1);
            }
            else{
                continue;
            }
        }
    }

    public boolean palindrome(String input) {
        if (input == null) {
            return false;
        }
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
