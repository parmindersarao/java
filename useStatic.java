public class useStatic{
    static int x=5,y;
    static void cal(int n){
        System.out.println("n = "+n);
        System.out.println("X= "+ x);
        System.out.println("Y= "+ y);
    }
    static{
        System.out.println("Static block ");
        y=x*5;
    }
    public static void main(String[] args) {
        cal(10);
    }

}