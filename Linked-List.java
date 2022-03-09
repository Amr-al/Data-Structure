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
        node head;
        list()
        {
            head = null;
        }
	public boolean isempty(){
		return head == null;
	}
        public void insertfirst(int x)
        {
            node nw = new node(x);
            nw.next = head;
            head = nw;
        }
        public void deletfirst()
        {
            head = head.next;
        }
        public void display()
        {
            node tmp = head;
            while(tmp != null)
            {
                System.out.print(tmp.data + "\n");
                tmp = tmp.next;
            }
        }
        public node find(int key)
        {
            node tmp = head;
            while(tmp.data != key)
            {
                if(tmp.next == null)
                {
                    return null;
                }
                tmp = tmp.next;
            }
            return tmp;
        }
        public node delet(int key)
        {
            node cur = head,pre = head;
            while(cur.data != key)
            {
                if(cur.next == null)
                {
                    return null;
                }
                pre = cur;
                cur = cur.next;
            }
            pre.next = cur.next;
            return cur;
        }
    }
    public static void main(String args[]) {
        list mylist = new list();
        mylist.insertfirst(1);
        mylist.insertfirst(3);
        mylist.insertfirst(2);
        mylist.insertfirst(5);
        mylist.insertfirst(7);
        mylist.deletfirst();
        mylist.display();
    }
}
