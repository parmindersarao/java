import java.util.*;

class Date{
    static int Day,Month,Year,Days;
    Date(int D,int M,int Y){
        Day=D;
        Month=M;
        Year=Y;
    }
    public void storeD(int add){
        Days=add;
    }
    static boolean isLeap(int Y){
        if(Y%4==0)
            return true;
        return false;
    }
    static int offset(int D,int M, int Y){
        int offset=D;
        switch(M-1){
            case 1: offset+=31;
            break;
            case 2: offset+=59;
            break;
            case 3: offset+=90;
            break;
            case 4: offset+=120;
            break;
            case 5: offset+=151;
            break;
            case 6: offset+=181;
            break;
            case 7: offset+=212;
            break;
            case 8: offset+=243;
            break;
            case 9: offset+=273;
            break;
            case 10: offset+=304;
            break;
            case 11: offset+=334; 
        }
        if (isLeap(Y)&& M > 2){
            offset +=1;
        }
        return offset;
    }
    static void revoffsetDays(int offset)
    {
        int []month={ 0, 31, 28, 31, 30, 31, 30,31, 31, 30, 31, 30, 31 };
    
        if (isLeap(Year))
            month[2] = 29;
    
        int i;
        for (i = 1; i <= 12; i++)
        {
            if (offset <= month[i])
                break;
            offset = offset - month[i];
        }
    
        Day = offset;
        Month = i;
        System.out.println(Day + "/ " + Month + "/ " + Year);
    }
    public void addDays(){
        int offset1 = offset(Day,Month,Year);
        int remDays = isLeap(Year)?(366-offset1):(365-offset1);
        int y2, offset2 = 0;
        if (Days <= remDays)
        {
            y2 = Year;
            offset2 =offset1 + Days;
        }
    
        else
        {
            Days -= remDays;
            y2 = Year + 1;
            int y2days = isLeap(y2) ? 366 : 365;
            while (Days >= y2days)
            {
                Days -= y2days;
                y2++;
                y2days = isLeap(y2) ? 366 : 365;
            }
            offset2 = Days;
        }
        Year=y2;
        revoffsetDays(offset2);
    }
}
public class constructer_date{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a date in form dd/mm/yy");
        int D = sc.nextInt();
        int M = sc.nextInt();
        int Y = sc.nextInt();
        Date MyObj = new Date(D,M,Y);
        System.out.println("enter the number of Days to add ");
        int add = sc.nextInt();
        MyObj.storeD(add);
        MyObj.addDays();
        sc.close();
    }
}