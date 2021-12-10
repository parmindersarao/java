class A{
    int x=10;
    static int y= 20;
    private static int z= 30;
    static class B{
        void get(){
            System.out.println("static nested class");
            System.out.println("y = "+y);
            System.out.println("z= "+ z);
        }
    }
    class C{
        void display(){
            System.out.println("non static nested class");
            System.out.println("x = "+x);
            System.out.println("y =" +y);
            System.out.println("z= "+ z);
        }
    }
}
public class staticNested {
    public static void main(String[] args) {
        A.B objectB= new A.B();
        A objectA = new A();
        A.C objectC = objectA.new C();
        objectB.get();
        objectC.display();
    }
}