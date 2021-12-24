/**we can set priority of thread its value is between 1 to 10 if value goes over 10 or 
 * less then 10 then it will raise illegalArgumentException. By setting priority we are 
 * not 100% sure that it will work according to us. By default value of thread priority is
 * 5. Here is mainly two method one is .getPriority() which is used to know what is the priority of 
 * thread and second one is setPriority which used set or modify priority
 */
class print extends Thread{// here we creating thread by extend class Thread
    @Override
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("@ print 1 = "+ i);
        }
    }
}
class print2 implements Runnable{//here we creting class by implement interface 
    /**Interface Runnable has only one method to overide which is Run  */
    @Override
    public void run(){
        for(int i=0; i<10; i++){
            System.out.println("&& print 2 =  " + i);
        }
    }
}
public class Threadprio {
    public static void main(String[] args) {
        System.out.println("Program starts");
        print print1= new print();
        print2 print2= new print2(); 
        Thread th = new Thread(print2); 
        print1.setPriority(9);
        th.setPriority(2);
        Thread.currentThread().setPriority(6); //set main thread priority
        print1.start();
        th.start();
        /* by .getproprity() method we get priority which is by default 5 if we didnot set it */
        System.out.println("Print thread priority = " +print1.getPriority());
        System.out.println("Print2 thread priority = " + th.getPriority());
        System.out.println("main thread priority ="+ Thread.currentThread().getPriority());//get main thread priority
        for(int i=0; i<10; i++){           
             System.out.println("^^^^ print "+ i);
        }
    }
}
//output we can clearly see Print thread run firs then main thread then Print2 thread
/**Program starts
@ print 1 = 0
@ print 1 = 1
@ print 1 = 2
@ print 1 = 3
@ print 1 = 4
@ print 1 = 5
@ print 1 = 6
@ print 1 = 7
@ print 1 = 8
@ print 1 = 9
Print thread priority = 9
Print2 thread priority = 2
main thread priority =6
^^^^ print 0
^^^^ print 1
^^^^ print 2
^^^^ print 3
^^^^ print 4
^^^^ print 5
^^^^ print 6
^^^^ print 7
^^^^ print 8
^^^^ print 9
&& print 2 =  0
&& print 2 =  1
&& print 2 =  2
&& print 2 =  3
&& print 2 =  4
&& print 2 =  5
&& print 2 =  6
&& print 2 =  7
&& print 2 =  8
&& print 2 =  9 */
