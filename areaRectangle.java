abstract class Rectangle{
    double a,b;
    Rectangle(double x,double y){
        a=x;
        b=y;
    }
    abstract double calArea();
}
class area extends Rectangle{
    area(double x,double y){
        super (x,y);
    }
    double calArea(){
        return a*b;
    }
}
public class areaRectangle{
    public static void main(String[] args) {
        area object1 = new area(7,8);
        System.out.println("Area of rectangle = " + object1.calArea());
    }
}