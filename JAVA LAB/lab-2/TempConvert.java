import java.util.*;
//convert temp fahrenhit into celsius 
public class TempConvert{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Temp in Fahrenhit");
        double f=sc.nextDouble();
        double c=(5/9)*(f-32);
        System.out.println("Temp in Celsius="+c);
        }
        }
