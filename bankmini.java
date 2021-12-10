import java.util.Scanner;
public class bankmini 
{
    public static void main(String[] args)
    {
        int mainBalance=1000,operation;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println(" Your current balance : " + mainBalance);
            System.out.println(" Enter 1 for Transfer money \n Enter 2 for deposite money \n Enter 0 for exit ");
            operation = sc.nextInt();
            switch(operation)
            {
                case 0: System.out.println("Thank you for vist ");
                        break;
                case 1 : System.out.print("Enter amount that you want to transfer :");
                        int amount = sc.nextInt();
                        if(mainBalance == 0 || amount<=0 || amount>mainBalance)
                        {
                            System.out.println("Please enter valid amount :( ");
                        }
                        else 
                        {
                        mainBalance -= amount;
                        System.out.println("Transaction completed :)");
                        }
                        break;
                case 2 : System.out.print("How many rupees you want to deposit : ");
                        int damount = sc.nextInt();
                        mainBalance += damount;
                        break;
                default: System.out.println("please Enter valid operation !");
                    
            }
        }while(operation != 0);
        sc.close();
    }
    
}
