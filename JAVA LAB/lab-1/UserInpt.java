import java.util.Scanner;
public class UserInpt{
    public static void main(String [] args){
    Scanner a=new Scanner(System.in);
    String name=a.nextLine();
    int marks=a.nextInt();
    System.out.println(name+marks);
    }
}