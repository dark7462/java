
import java.util.*;

public class BasicMethods{
    public static void main(String args[]){
        int a,b;
        try(Scanner scn = new Scanner(System.in)){
            a = scn.nextInt();
            b = scn.nextInt();
        }
        
        System.out.println("Add : " + clac.add(a,b));
        System.out.println("sub : " + clac.sub(a,b));
        System.out.println("div : " + clac.div(a,b));
        System.out.println("mul : " + clac.mul(a,b));
        System.out.println("mod : " + clac.mod(a,b));
    }
}
class clac{

    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a, int b){
        if(a>b) return a-b;
        else if(a < b) return b-a;
        else return 0;
    }
    public static int div(int a, int b){
        return a/b;
    }
    public static int mul(int a, int b){
        return a*b;
    }
    public static int mod(int a, int b){
        return a%b;
    }
}