package print;
public class printData {
    String name;
    int roll_no;
    double marks;
    public void Data(String n,int r_n, double m){
        name=n;
        roll_no=r_n;
        marks=m;
    }
    public void display(){
        System.out.println("Name = " + name+"\nRoll No."+roll_no+"\nMarks= "+marks);
    }
}
