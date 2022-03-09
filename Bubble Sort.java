public class MyClass {
    static void bubble(int a[],int n)
    {
        for(int i = n-1; i > 1 ; --i)
        {
            for(int j = 0; j < i ;++j)
            {
                if(a[j] > a[j+1])
                    swap(a,j,j+1);
            }
        }
    }
    static void swap(int a[],int i,int j)
    {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
    
    public static void main(String args[]) {
        int a[] = {1,2,7,3,1,6,7};
        bubble(a,7);
        for(int i = 0 ; i < 7 ;++i)
        System.out.print(a[i] + " ");
    }
}
