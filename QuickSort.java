public class MyClass {
    
    public static class QuickSort{
        int a[],nitem;
        QuickSort(int sz)
        {
            a = new int[sz];
            nitem = 0;
        }
        void swap(int i, int j)
        {
            
        }
        void push(int v)
        {
            a[nitem++] = v;
        }
        int part(int l,int r)
        {
            int pv = a[r];
            int j = l;
            for(int idx = l; idx < r ;++idx)
            {
                if(a[idx] <= pv)
                {
                    int temp = a[idx];
                    a[idx] = a[j];
                    a[j] = temp;
                    ++j;
                }
            }
            int temp = a[j];
            a[j] = a[r];
            a[r] = temp;
            return j;
        }
        int getsize()
        {
            return nitem;
        }
        void quick(int l ,int r)
        {
            if(l >= r)
                return;
            int p = part(l,r);
            quick(l,p-1);
            quick(p+1,r);
        }
        void print()
        {
            for(int i = 0 ; i < nitem ;++i)
                System.out.print(a[i] + " ");
                
        }
    }
    public static void main(String args[]) {
        QuickSort arr = new QuickSort(100);
        arr.push(2);
        arr.push(1);
        arr.push(5);
        arr.push(3);
        arr.push(4);
        arr.quick(0,arr.getsize()-1);
        arr.print();
    }
}
