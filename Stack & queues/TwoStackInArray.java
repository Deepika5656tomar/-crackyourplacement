class twoStacks {
    ArrayList<Integer> al;
    twoStacks() {
        al=new ArrayList<>();
        al.add(-1);
    }

    // Function to push an integer into the stack1.
    void push1(int x) {
        al.add(0,x);
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        al.add(x);
    }

    // Function to remove an element from top of the stack1.
    int pop1() {
        if(al.get(0)!=-1)
        return al.remove(0);
        else return -1;
    }

    // Function to remove an element from top of the stack2.
    int pop2() {
        if(al.get(al.size()-1)!=-1)
        return al.remove(al.size()-1);
        else return -1;
    }
}
