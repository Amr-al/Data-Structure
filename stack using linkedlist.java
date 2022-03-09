public class MyClass {
    public static class node{
        int data;
        node next;
        public node(int x)
        {
            data = x;
        }
    }
    public static class linkedlist{
        node head;
        public linkedlist()
        {
            head = null;
        }
        public boolean empty()
        {
            return head == null;
        }
        public void addfirst(int val)
        {
            node nw = new node(val);
            nw.next = head;
            head = nw;
        }
        public void deletfirst()
        {
            head = head.next;
        }
        public void print()
        {
            if(!empty())
            System.out.print(head.data + "\n");
        }
    }
    public static class stack{
        linkedlist st;
        public stack()
        {
            st = new linkedlist();
        }
        public void push(int val)
        {
            st.addfirst(val);
        }
        public void pop()
        {
            st.deletfirst();
        }
        public boolean isempty()
        {
            return st.empty();
        }
        public void peek()
        {
            st.print();
        }
    }
    public static void main(String args[]) {
        stack mystack = new stack();
        mystack.push(1);
        mystack.push(2);
        mystack.push(3);
        mystack.peek();
        mystack.pop();
        mystack.peek();
        
    }
}
