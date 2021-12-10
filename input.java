/*class second
{
   public int x,y;
    void insert(int x, int y)
    {
        this.x = x;
        this.y = y;
        System.out.println(x+y);
    }

}*/
import java.util.*;

public class input 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter any integer = ");
        for (int i=0; i<5; i++)
        {
            a[i]=sc.nextInt();
        }
        for (int i:a)
        {
            System.out.println(i);
        }
        sc.close();
    }
}
