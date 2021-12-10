import java.util.Scanner;

public class calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("cal for two number ");
        int a = sc.nextInt();
        String operation = sc.next();
        int b = sc.nextInt();
        switch(operation){
            case "+":int result = a+b;
                     System.out.println("sum = " + result);
            break;
            case "-":result = a-b;
                     System.out.println("substraction = " + result);
            break;
            case "*":result = a*b;
                     System.out.println("Multiplication = " + result);
            break;
            case "/":result = a/b;
                     System.out.println("Division = " + result);
            break;
            case "%":result = a%b;
                     System.out.println("Remainder = " + result);
            break;
            default : System.out.println("invalid operation");
        }
        sc.close();

    }
}
