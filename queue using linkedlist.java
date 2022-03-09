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
        node first,last;
        public linkedlist()
        {
            first = null;
            last = null;
        }
        public boolean empty()
        {
            return first == null;
        }
        public void addlast(int val)
        {
            node nw = new node(val);
            if(empty())
                first = nw;
            else
                last.next = nw;
            last = nw;
        }
        public void deletfirst()
        {
            first = first.next;
            if(first == null)
                last = null;
        }
        public void print()
        {
            if(!empty())
            System.out.print(first.data + "\n");
        }
    }
    public static class que{
        linkedlist q;
        public que()
        {
            q = new linkedlist();
        }
        public void push(int val)
        {
            q.addlast(val);
        }
        public void pop()
        {
            q.deletfirst();
        }
        public boolean isempty()
        {
            return q.empty();
        }
        public void peek()
        {
            q.print();
        }
    }
    public static void main(String args[]) {
        que q = new que();
        q.push(1);
        q.push(2);
        q.push(3);
        q.peek();
        q.pop();
        q.peek();
        
    }
}
