class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        
        for(String s:strs){
            char ch[]=s.toCharArray();
            Arrays.sort(ch);
            String word=new String(ch);
            if(!map.containsKey(word)){
                map.put(word,new ArrayList<>());
            }
            map.get(word).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
