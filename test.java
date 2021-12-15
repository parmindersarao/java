/*class exam{
    void display(){
        System.out.println("in exam");
    }
    class exam1{
        void dis(){
            System.out.println("in 1");
        }

    }
    

}
// filename Main.java
class Grandparent {
   
	public void Print()
	{
		System.out.println("Grandparent's Print()" + a);
	}
} */

class Parent{
    int a;
    Parent(int x){
        a=x;
    }
    void Print()
	{
		System.out.println("Parent's Print()" +a );
	}
}

class Child extends Parent {
	
    Child(int x){
        super(x);
    }
    @Override
    void Print(){
        super.Print();
        System.out.println("Child's Print()"+a);
    }
}
    


class test {
      /*  int a;
    char b;
    void get(char x, int y){
        b=x;
        a=y;
    }
    void show(){
        System.out.println(b);
        System.out.println(a);
    }*/
    public static void main(String[] args) {
        Parent P = new Parent(8);
        Child C = new Child(10);
       /* C.Print(); // calling function through child class object it print 10 
        C.show(); // same but it is child class function
        P.Print(); // callin function by parent class which print 8 because we pass value 8
        P=C; // here we assigning reference to parent class 
        P.Print(); // here we call again parent class functin but after referencing so it is gonna print 10 */
        C.Print();

    }

}
