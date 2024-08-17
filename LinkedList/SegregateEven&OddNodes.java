/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node divide(Node head) {
        // code here
        if(head==null || head.next==null){
            return head;
        }
        Node odd=null;
        Node even=null;
        Node prev=null;
        Node temp=head;
        
        while(temp!=null){
            if(temp.data%2!=0 && odd==null){
                odd=temp;
            }
            else if(temp.data%2==0){
                if(odd==null){
                    even=temp;
                }
                else{
                    prev.next=temp.next;
                    temp.next=odd;
                    if(even==null){
                        even=temp;
                        head=even;
                    }
                    else{
                        even.next=temp;
                        even=even.next;
                    }
                    temp=prev;
                }
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }
}
