public  class frecursion {
    public static void fibonnic(int a,int b,int n)
    {
        if (n==0)
        {
            return;
        }
        int c=a+b;
        System.out.print(" " + c);
        fibonnic(b, c, n-1);
    }

    public static void main(String[] args)
    {
        int n=10,a=0,b=1;
        System.out.print(a + " " + b);
        fibonnic(a, b, n-2);

    }
}
