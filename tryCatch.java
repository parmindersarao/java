
public class tryCatch {
    public static void main(String[] args) {
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
    try{
        System.out.println("we are in nested");
        //int c=1/0; // if it throw exception then the rest of code in block is not excute even finally
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
    }

    }    
}
