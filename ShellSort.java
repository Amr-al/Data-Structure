public class MyClass {
    
    public static class shellSort{
        int a[],nitem;
        shellSort(int sz)
        {
            a = new int[sz];
            nitem = 0;
        }
        void push(int v)
        {
            a[nitem++] = v;
        }
        int getsize()
        {
            return nitem;
        }
        void shell()
        {
            int n = getsize();
            for(int gab = n/2; gab > 0 ;gab /= 2)
            {
                for(int i = gab; i < n;++i)
                {
                    int key = a[i];
                    for(int j = i-gab; j >= 0 && a[j] > key ;j-=gab)
                    {
                        a[j+gab] = a[j];
                        a[j] = key;
                    }
                }
            }
        }
        void print()
        {
            for(int i = 0 ; i < nitem ;++i)
                System.out.print(a[i] + " ");
                
        }
    }
    public static void main(String args[]) {
        shellSort arr = new shellSort(100);
        arr.push(2);
        arr.push(1);
        arr.push(3);
        arr.push(5);
        arr.push(3);
        arr.shell();
        arr.print();
    }
}
