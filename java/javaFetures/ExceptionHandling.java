public class ExceptionHandling {
    public static void main(String[] args) {
        int []a = new int[10];
        a[9] = 10;
        try {
            System.out.println(a[10]);
            System.out.println(3/0);
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException e) { // we can specificly say which exceotion we wanna catch,
            System.out.println("somthing went wrong : " + e);   // multiple catch are allowed as well 
        }//but will only print one error then stop the try block
        System.out.println("End");

        //creating out own error and handling it
        int j;
        try {   
            j = 18/20;
            if(j == 0){
                throw new MyException("Galat h");
                // throw used to raise our own errors
            }
        } catch (MyException e) { // and here we catch errors
            j = 20/10;
            System.out.println("Somthing went wrong : " + e);
        }
        System.out.println(j);
    }
}
class MyException extends Exception{ // made our own Exception class and need to extend it
    public MyException(String str){
        super(str); // things taken care by the backend
    }
}