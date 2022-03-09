import java.util.*;  
public class MyClass {
    public static class priortyq{
        int sz, nitems;
        int []a;
        public priortyq(int mxsz)
        {
            sz = mxsz;
            a = new int[mxsz];
            nitems = 0;
        }
        public void push(int val)
        {
            if(nitems == 0)
                a[nitems++] = val;
            else{
                int i;
                for(i = nitems - 1; i >= 0 ;--i)
                {
                    if(a[i] <= val){
                        a[i+1] = a[i];
                    }
                    else
                        break;
                }
                a[i+1] = val;
                nitems++;
            }
        }
        public void pop()
        {
            --nitems;
        }
        public int peek()
        {
            return a[nitems-1];
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
        Scanner cin = new Scanner(System.in);  
        priortyq q = new priortyq(100);
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(5);
        q.push(2);
        q.pop();
        q.pop();
        q.pop();
        q.pop();
        System.out.print(q.peek());
      
    }
}
