class Solution {
    public String convertToTitle(int columnNumber) {
       StringBuilder res=new StringBuilder();
        while(columnNumber>0){
            int r=(columnNumber-1)%26;
            res.append((char)(r+'A'));
            columnNumber=(columnNumber-1)/26;
        }
        return res.reverse().toString();
    }
}
