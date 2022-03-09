public class MyClass {
    public static class node{
        int data;
        node next;
        node(int x)
        {
            this.data = x;
        }
    }
    public static class list{
        node first;
        node last;
        list()
        {
            first = null;
            last = null;
        }
        boolean isempty()
        {
            return first == null;
        }
        public void insetfirst(int val)
        {
            node nw = new node(val);
            if(isempty())
                last = first = nw;
            else{
                nw.next = first;
                first = nw;
            }
        }
        public void insertlast(int val)
        {
            node nw = new node(val);
            if(isempty())
                last = first = nw;
            else{
                last.next = nw;
                nw = last;
            }
        }
        public void deletfirst()
        {
            first = first.next;
            if(first == null)
            last = null;
        }
        
    }
    public static void main(String args[]) {
        
    }
}
