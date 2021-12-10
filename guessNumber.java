import java.util.Scanner;
class guessNumber
{
    public static void main(String[] args)
    {
        int myNumber = (int)( Math.random()*100);
        Scanner sc = new Scanner(System.in);
        int userNumber;
        do
        {
            System.out.print("Guess number (1-100) :" );
            userNumber = sc.nextInt();
            if (userNumber == myNumber)
            {
                System.out.println("you win ...correct answer");
                break;
            }
            else if(userNumber > myNumber)
            {
                System.out.println("Number is large");
            }
            else 
            {
                System.out.println("number is small");
            }
        }while(userNumber >= 0);
        System.out.println("my number was: " + myNumber);
        sc.close();
    }
}