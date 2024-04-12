//sum of two double number from cmd line argument
public class Sum{
    public static void main(String []args){
        double point1=Double.parseDouble(args[0]);
        double point2=Double.parseDouble(args[1]);
        double point3=point1+point2;
        System.out.println(point3);
    }
}