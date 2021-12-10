import java.util.Scanner;
public class largestPrimeFactor {
    public static void primeFactor(int x)
    {
        while(x%2==0)
        {
            System.out.println(2);
            x=x/2;
        }

        for(int i=3; i<Math.sqrt(x); i=i+2)
        {
            while(x%i==0)
            {
                System.out.println(i);
                x = x/i;
            }
        }
        if(x==2)
        {
           x=x/2;
           System.out.println(2);
        }
        System.out.println(x);
    }
    public static void main(String[] args)
    {
        int x;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        primeFactor(x);
        sc.close();

    }
    
}
