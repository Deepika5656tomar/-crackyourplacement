class Solution {
    public long multiplyTwoLists(Node first, Node second) {
        // Code here
        long MOD=1000000007;
        long num1=0;
        long num2=0;
        
        Node temp=first;
        while(temp!=null){
            num1=(num1*10+temp.data)%MOD;
            temp=temp.next;
        }
        Node temp2=second;
        while(temp2!=null){
            num2=(num2*10+temp2.data)%MOD;
            temp2=temp2.next;
        }
        long mul=(num1*num2)%MOD;
        return mul;
    }
}
