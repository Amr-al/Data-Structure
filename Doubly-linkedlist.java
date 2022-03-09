public class MyClass {
    public static class node{
        int data;
        node next;
        node prev;
        node(int x)
        {
            this.data = x;
        }
    }
    public static class doubly{
        node first,last;
        doubly()
        {
            first = null;
            last = null;
        }
        public boolean isempty()
        {
            return first == null;
        }
        public void insertfirst(int x)
        {
            node nw = new node(x);
            if(first == null)
            {
                first = last = nw;
            }
            else
            {
                nw.next = first;
                first.prev = nw;
                first = nw;
            }
        }
        public void insertlast(int x)
        {
            node nw = new node(x);
            if(isempty())
                first = nw;
            else{
                last.next = nw;
                nw.prev = last;
                last = nw;
            }
        }
        public void deletfirst()
        {
            if(first.next == null)
                last = null;
            first.next.prev = null;
            first = first.next;
        }
        public void delettlast()
        {
            if(last.prev == null)
                first = null;
            last.prev.next = null;
            last = last.prev;
        }
        public void insertafter(int key,int x)
        {
            node tmp = first;
            node nw = new node(x);
            while(tmp.data != key)
            {
                if(tmp.next == null)
                    return;
                tmp = tmp.next;
            }
            if(tmp == last){
                tmp.next = nw;
                nw.prev = tmp;
                last = nw;
            }
            else{
                tmp.next.prev = nw;
                tmp.next = nw;
                nw.next = tmp.next;
                nw.prev = tmp;
            }
        }
        public void displayforward()
        {
            node tmp = first;
            while(tmp != null)
            {
                System.out.print(tmp.data + " ");
                tmp = tmp.next;
            }
            System.out.print("\n");
        }
        public void displaybackward()
        {
            node tmp = last;
            while(tmp != null)
            {
                System.out.print(tmp.data + " ");
                tmp = tmp.prev;
            }
            System.out.print("\n");
        }
           
    }
    public static void main(String args[]) {
        doubly mylist = new doubly();
        mylist.insertfirst(1);
        mylist.insertfirst(2);
        mylist.insertlast(4);
        mylist.insertlast(5); 
        mylist.displayforward(); // 2 1 4 5
        mylist.displaybackward(); // 5 4 1 2
        mylist.deletfirst(); 
        mylist.delettlast();
        mylist.displayforward(); //  1 4 
        mylist.displaybackward(); //  4 1 
    }
}
