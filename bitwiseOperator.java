public class bitwiseOperator{
    public static void main(String[] args) {
        System.out.println("example of bitwise operator where a= 6 and b=8");
        int a=6,b=8;
        System.out.println("a&b = " + (a&b)); //in binary a=0110 b=1000 a&b = 0000
        System.out.println("a|b = " + (a|b)); // a|b = 1110
        System.out.println("a^b = " + (a^b)); // a^b = 1110
        System.out.println("~a = " + (~a));   // a=0110 ~a=1001 2's compliment 1010   
    }
} 