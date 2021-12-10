class Object{
    int a,b;
    Object(int x,int y){
        a=x;
        b=y;
        System.out.println("a="+a +"\nb="+b);
    }
    Object swap(Object o1){
        Object O = new Object(o1.b,o1.a);
        return O;
    }
}

class swapObject {

    public static void main(String[] args) {
        System.out.println("Before swap");
        Object o1 = new Object(10, 5);
        System.out.println("After swap");
        Object o2 = o1.swap(o1);
        o2.a = o2.b; ///just for remove warning :D
    }
}
