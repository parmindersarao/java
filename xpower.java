/* */

public class xpower {
    public static int xpw(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        if(x==0)
        {
            return 0;
        }
        int pwnm1=xpw(x, n-1);
        int pwn= x*pwnm1;
        return pwn;
    }
    public static void main(String[] args)
    {
        int x=8,n=4;
        int ans=xpw(x, n);
        System.out.println(ans);



    }
}
