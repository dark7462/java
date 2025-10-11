public class Throws{
    @SuppressWarnings("CallToPrintStackTrace")
    public static void main(String[] args) {
        example ex = new example();
        try {
            ex.show();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } // here we have to handle it
    }
}
class example{
    public void show() throws ClassNotFoundException{ // this directy thorws the error to the main and asks main to handle it
        Class.forName("exam");
        // try{
        //     Class.forName("exam"); //trying to find the class
        // }
        // catch(ClassNotFoundException e){
        //     System.out.println("Somthing went Wrong : " + e);
        // }
        
    }
}