import java.util.*; //by * i can import whole library 
class MyException extends Exception{
    @Override
    public String toString(){
        return "it is toString ";
    }
    @Override
    public String getMessage(){
        return "its get message ";
    }
}
public class tryCatch {
    static void division(int x) throws ArithmeticException{
        System.out.println(x/0);//here we use built in exception so we don't need to throw exception by self
    }
    static void enterNumbee(int y) throws MyException{
        if(y<9)
            throw new MyException(); //when we made exception by self then we have to throw exception by self
        else
            System.out.println("greater number ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(); // taking input any integer 
        try{
            //division(a);
            enterNumbee(a);
        }
        catch(Exception e){ // we can also use Exception which is super class 
            System.out.println(e); //this will print "it is toString" 
            System.out.println(e.getMessage()); // this will print "its get message"
            e.printStackTrace(); // this will print "at tryCatch.main(tryCatch.java:27)" meant excpetion throw by which line
        }
        sc.close();
        System.out.println("program ended");
  /*      try{    
            String s=null;
            int a = s.length();
           }        
           catch(ArithmeticException e){System.out.println("task1 is completed");}    
           catch(ArrayIndexOutOfBoundsException e){System.out.println("task 2 completed");} 
           catch(Exception e){System.out.println("common task completed");}    
           System.out.println("rest of the code...");       
    }*/
   /* try{
        System.out.println("it works ");
        try{
            int a=50/0;
        }
        catch(ArithmeticException e){

        } 
    }

    catch(Exception e){
        System.out.println("cath");
    }*/
   /* try{
        System.out.println("we are in nested");
        //int c=1/0; // if it throw exception then the rest of code in block is not excute even finally because it is in try block
        try{
            int a= 50/0;  
        }
        catch(ArithmeticException e){
            System.out.println("nested catch");
        }
        finally{
            System.out.println("nested finally");
        }
    }
    catch(Exception e){
        System.out.println("in main");
    }
    finally{
        System.out.println("it should be printed");
    }*/

    }    
}
