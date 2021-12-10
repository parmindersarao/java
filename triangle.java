class operationTriangle{
    double a,b,c,hb,area,perimeter;
    operationTriangle(double x,double y,double z){
        a=x;
        b=y;
        c=z;
    }
    operationTriangle(double x,double y ){
        b=x;
        hb=area=y;
    }
    void area(){
        area = (b*hb)/2;
    }
    void perimeter(){
        perimeter = a+b+c;
    }
}
class height extends operationTriangle{
    height(double x,double y){
        super(x,y);
    }
    void heightTriangle(){
        hb = (2*area)/b;
    }
}
public class triangle {
    public static void main(String[] args) {
        operationTriangle ot1 = new operationTriangle(8,7,6);
        operationTriangle ot2 = new operationTriangle(7,5);
        height H = new height(7, 17.5);
        ot1.perimeter();
        System.out.println("perimeter = "+ ot1.perimeter);
        ot2.area();
        System.out.println("area = "+ ot2.area);
        H.heightTriangle();
        System.out.println("height = "+ H.hb);
    }
}
