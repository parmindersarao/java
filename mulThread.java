class print extends Thread{// here we creating thread by extend class Thread
    /**Thread class has many method to override  */
    @Override
    public void run(){
        for(int i=0; i<20; i++){
            System.out.println("@ print 1 = "+ i);
        }
    }
}
class print2 implements Runnable{//here we creting class by implement interface 
    /**Interface Runnable has only one method to overide which is Run  */
    @Override
    public void run(){
        for(int i=0; i<20; i++){
            System.out.println("&& print 2 =  " + i);
        }
    }
}
public class mulThread {
    public static void main(String[] args) { //main thread
        System.out.println("Program starts");
        print print1= new print();
        print2 print2= new print2(); // here we create object of class print2
        /**we can't use directly object of print2 class because we implement it 
         * by Runnable interface so we have to create thread class object and 
         * pass pritn2 object throw Thread constructor */
        Thread th = new Thread(print2); 
        print1.start();//we override run method but to start thread we call start method 
        th.start();// here we starting Runable interface thread
        
        for(int i=0; i<20; i++){           
             System.out.println("^^^^ print "+ i);
        }
        
    }
}
//output can we different if we run it again because it depends on JVM how much time give to thread 
/**Program starts
^^^^ print 0
^^^^ print 1
@ print 1 = 0
@ print 1 = 1
&& print 2 =  0
&& print 2 =  1
@ print 1 = 2
@ print 1 = 3
^^^^ print 2
^^^^ print 3
@ print 1 = 4
@ print 1 = 5
&& print 2 =  2
&& print 2 =  3
@ print 1 = 6
@ print 1 = 7
^^^^ print 4
^^^^ print 5
@ print 1 = 8
@ print 1 = 9
&& print 2 =  4
@ print 1 = 10
^^^^ print 6
@ print 1 = 11
&& print 2 =  5
@ print 1 = 12
^^^^ print 7
@ print 1 = 13
&& print 2 =  6
&& print 2 =  7
@ print 1 = 14
^^^^ print 8
^^^^ print 9
@ print 1 = 15
@ print 1 = 16
&& print 2 =  8
&& print 2 =  9
@ print 1 = 17
@ print 1 = 18
^^^^ print 10
^^^^ print 11
@ print 1 = 19
&& print 2 =  10
&& print 2 =  11
^^^^ print 12
&& print 2 =  12
^^^^ print 13
^^^^ print 14
&& print 2 =  13
&& print 2 =  14
^^^^ print 15
^^^^ print 16
&& print 2 =  15
&& print 2 =  16
^^^^ print 17
^^^^ print 18
&& print 2 =  17
&& print 2 =  18
^^^^ print 19
&& print 2 =  19 */