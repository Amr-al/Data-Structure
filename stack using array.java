public class MyClass {
    public static class stack{
        int mxsize;
        int []stackarray;
        int top;
        public stack(int sz)
        {
            mxsize = sz;
            stackarray = new int [sz];
            top = -1;
        }
        public boolean empty(){
            return top == -1;
        }
        public boolean full(){
            return top == mxsize-1;
        }
        public void push(int x){
            if(!full())
                stackarray[++top] = x;
        }
        public void pop(){
            if(!empty())
                --top;
        }
        public void peek(){
            System.out.print(stackarray[top] + "\n");
        }
    }
    public static void main(String args[]) {

        stack mystack = new stack(20);
        mystack.push(1);
        mystack.push(2);
        mystack.push(3);
        mystack.push(5);
        mystack.peek();
        mystack.pop();
        mystack.peek();
    }
}
