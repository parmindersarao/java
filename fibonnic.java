public class fibonnic
{
    static int n1=0,n2=1,n3=0;
    static void printf(int c)
    {
        if(c>0)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;n2=n3;
            printf(--c);
        }
    }

    public static void main(String[] args)
    {
       int count=10;
       System.out.print(n1 + " " + n2);
       printf(count-2);
    }
}