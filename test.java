class exam{
    void display(){
        System.out.println("in exam");
    }
    class exam1{
        void dis(){
            System.out.println("in 1");
        }

    }
    

}


class test {
    public static void main(String[] args) {
        exam obj2 = new exam();
        exam.exam1 obj1 = obj2.new exam1();
        obj1.dis();
    }
}
