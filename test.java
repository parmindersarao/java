/*class exam{
    void display(){
        System.out.println("in exam");
    }
    class exam1{
        void dis(){
            System.out.println("in 1");
        }

    }
    

}*/


class test {
    static int a;
    static void get(int x){
        a=x;
    }
    public static void main(String[] args) {
        //test obj1 = new test();
       // obj1.get(5);
        //obj1.show();
        get(5);
        show();

    }
    static void show(){
        System.out.println(a);
    }
}
