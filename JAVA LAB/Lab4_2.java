import java.util.Scanner;
public class Lab4_2{
    public static void main(String[]args){
    System.out.println("Enter String");
    Scanner sc=new Scanner(System.in);
    String str=next();
    int v=0,c=0;
    for(int i=0;i<str.lenght();i++){
        if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u' ){
            v++;
        }
        else if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I'|| str.charAt(i)=='O'|| str.charAt(i)=='U'){
            v++;
        }
        else{
            c++;
        }
        }
        System.out.println("Number of Vowels in  a String : "+v);
        System.out.println("Number of Consonants in a String : "+c);    
    }
}
