public class MyClass {
    public static class que{
        int mxsz;
        int []qarray;
        int rear ,front , nitems;
        public que(int sz){
            mxsz = sz;
            qarray = new int[sz];
            rear = -1;
            front = 0;
            nitems = 0;
        }
        public void push(int x)
        {
            if(rear == mxsz-1)
                rear = -1;
            qarray[++rear] = x;
            nitems++;
        }
        public void pop()
        {
            nitems--;
            front = (front+1)%mxsz;
        }
        public void peek()
        {
            System.out.print(qarray[front] + "\n");
        }
        public boolean empty()
        {
            return nitems == 0;
        }
        public int size()
        {
            return nitems;
        }
    }
    public static void main(String args[]) {
        que q = new que(20);
        q.push(1);
        q.push(2);
        q.push(3);
        System.out.print(q.size() + "\n");
        q.peek();
        q.pop();
        q.peek();
        
    }
}
