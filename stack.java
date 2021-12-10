import java.util.*;
class node{
    private int data;
    private node next;
    void Data(int d){
        data=d;
    }
    void Next(node n){
        next=n;
    }
    int getData(){
        return data;
    }
    node getNext(){
        return next;
    }
}
class dyStack{
    node start=null;
    node top=null;
    void push(int d){
        node n = new node();
        if(start==null){
            n.Data(d);
            n.Next(start);
            start=n;
            top=n;
        }
        else{
            n.Data(d);
            top.Next(n);
            top=n;
        }
    }
    boolean isEmpty(){
        if (start==null)
            return true;
        else
            return false;
    }
    void display(){
      node t=start;
      if(isEmpty()){
        System.out.println("Stack is empty");
      }
      else{
        while(t!=null){
            System.out.println(t.getData());
            t=t.getNext();   
            }
      }
    }

    void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else
        {
            node s=start;
            if(s.getNext()==null){
                start=null;
            }
            else{
                while(s.getNext()!=top){
                    s=s.getNext();
                }
                top=s;
                s.Next(null);
            }

        }
    }
}

public class stack {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      dyStack ob= new dyStack();
      while(true){
          System.out.println("choose what you want to do\n0.exit \n1.Push\n2.Pop\n");
          int operation=sc.nextInt();
          switch(operation){
              case 0: break;
              case 1:System.out.print("ente number that you want to add in stack : ");
                    int d = sc.nextInt(); 
                    ob.push(d);
                    System.out.println("Element in stack");
                    ob.display();
              break;
              case 2: ob.pop();
                      System.out.println("Element pop up new stack:");
                      ob.display();
              break;
              
              default:System.out.println("invalid input");
          }
          if(operation==0){
              break;
          }
      } 
      sc.close();      
  }   
}

