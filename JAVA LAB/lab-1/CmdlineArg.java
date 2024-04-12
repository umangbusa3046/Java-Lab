public class CmdlineArg{
    public static void main(String []args){
        String name=args[0];
        int point=Integer.parseInt(args[1]);
        System.out.println(name+point);
    }
}