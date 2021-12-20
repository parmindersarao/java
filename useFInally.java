//we know finally will going to always execute 
public class useFInally {
    static int value(int x){
        try{
            return x; // assuming we are open some file and read it get some value and returnig 
        }
        /*it may cause IOexception but i am not using catch here
         because we are not avtually openning any file so it is 
         just an example
         we using finally here because after executing try and catch block file
         is still open so we have to close but once this function return then control
         goes to main function so how we can close which is open we can use finally block
         to do this work because even try return but it is finally so it will execute*/

        finally{
            System.out.println("it run even already return or cleaning up  ");
        }
    }
    public static void main(String[] args) {
        System.out.println("value return by value function "+value(5));
        //Output 
        /*it run even already return or cleaning up
          value return by value function 5 */
        
          /*from output it is clearly shows that before giving control to main function
          it runs finally block it means the file that we want to close is clase */
    }
}
// must read
/** we are not going to use finally only for these scenerio. Their are many another uses can be
 * possible where we can do some work before return or stop program so we use finally for these kind
 * of work. Most of cases are similar we are at the end closing any file which open or any connection 
 */