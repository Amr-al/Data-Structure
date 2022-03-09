public class MyClass {
    public static class mergeSort{
        int a[],nitem;
        mergeSort(int sz)
        {
            a = new int[sz];
            nitem = 0;
        }
        void push(int v)
        {
            a[nitem++] = v;
        }
        void merge(int l,int m,int r)
        {
            int n = m-l+1,n2 = r-m;
            int L[] = new int [n];
            int R[] = new int [n2];
            for(int i = 0; i < n ;++i)
                L[i] = a[i+l];
            for(int i = 0; i < n2 ;++i)
                R[i] = a[i+m+1];
            int i = 0,j = 0, k = l;
            while(i < n && j < n2)
            {
                if(L[i] < R[j])
                    a[k++] = L[i++];
                else
                    a[k++] = R[j++];
            }
            while(i < n)
                a[k++] = L[i++];
            while(j < n2)
                a[k++] = R[j++];
        }
        int getsize()
        {
            return nitem;
        }
        void mergesort(int l ,int r )
        {
            if(l >= r)
                return;
            int mid = l + (r-l) / 2;
            mergesort(l,mid);
            mergesort(mid+1,r);
            merge(l,mid,r);
        }
        void print()
        {
            for(int i = 0 ; i < nitem ;++i)
                System.out.print(a[i] + " ");
                
        }
    }
    public static void main(String args[]) {
        mergeSort arr = new mergeSort(100);
        arr.push(2);
        arr.push(1);
        arr.push(5);
        arr.push(3);
        arr.mergesort(0,arr.getsize()-1);
        arr.print();
    }
}
