import java.util.Scanner;
public class Lab4_4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Range");
        int n=sc.nextInt();
        int [] arr=new int[n];  
        for(int i=0;i<n;i++){
        System.out.print("Enter value at "+(i+1)+" Index:");
        arr[i]=sc.nextInt();
        }
        for (int i = arr.length - 1; i >=0; i--) {
            System.out.print(arr[i]+" ");
        }
    }


}