import java.util.*;
public class sortNameByLength{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many name :");
        int x = sc.nextInt();
        String names[]= new String[x];
        System.out.println("Enter names ");
        for(int i=0; i<x; i++){
            names[i]=sc.next();
        }
        //sort
        for(int i=0; i<x; i++){
            for(int j=1; j<x; j++)
            if(names[j-1].length()>names[j].length()){
                String temp;
                temp=names[j];
                names[j]=names[j-1];
                names[j-1]=temp;
            }
        }
        System.out.println("Names are sorted by length :");
        for(int i=0; i<x; i++){
            System.out.println(names[i]);
        }
        sc.close();
    }
}
