class print extends Thread{
    @Override
    public void run(){
        for(int i=0; i<20; i++){
            System.out.println("@ print "+ i);
        }
    }
}
public class mulThread {
    public static void main(String[] args) {
        print obj1= new print();
        obj1.start();
        for(int i=0; i<20; i++){           
             System.out.println("^^^^ print "+ i);
        }
        
    }
}
