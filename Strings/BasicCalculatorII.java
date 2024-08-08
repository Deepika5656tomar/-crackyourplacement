class Solution {
    public int calculate(String s) {
        int len=0;
        if(s==null || (len=s.length())==0) return 0;
        Stack<Integer> st=new Stack<Integer>();
        int num=0;
        char sign='+';
        for(int i=0;i<len;i++){
            if(Character.isDigit(s.charAt(i))){
                num=num*10+s.charAt(i)-'0';
            }
            if((!Character.isDigit(s.charAt(i)) && ' '!=s.charAt(i)) || i==len-1){
                if(sign=='+'){
                    st.push(num);
                }
                if(sign=='-'){
                    st.push(-num);
                }
                if(sign=='*'){
                    st.push(st.pop()*num);
                }
                if(sign=='/'){
                    st.push(st.pop()/num);
                }
                sign=s.charAt(i);
                num=0;
            }
        }
        int res=0;
        for(int i:st){
            res+=i;
        }
        return res;
    }
}
