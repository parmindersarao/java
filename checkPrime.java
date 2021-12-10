import java.util.Scanner;
class checkPrime
{
    static void checkprime(int x)
    {
        int temp = x/2,c=0;
        for(int i = 2; i<temp; i++)
        {
            if (x%i==0)
            {
                c=0;
                break;
            }
            else
            {
                c=1;
            }
        }
        if (c==0)
        {
            System.out.print(x + " is prime not number");
        }
        else
        {
            System.out.print(x + " is prime number");
        }

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number = ");
        int a=sc.nextInt();
        if (a==2 || a==3 || a==5)
        {
            System.out.print(a + " is prime number");
        }
        else
        {
        checkprime(a);
        }
        sc.close();
    }
    
}