public class InnerClass {
    public static void main(String[] args) {
        a A = new a();
        A.show();

        a.b innerB = A.new b();
        //use a.b innerB = new a(); if the b class was static
        //outter class can never be static
        innerB.con();

        //anonmous inner class
        a example = new a(){
            @Override
            public void show(){
                System.out.println("In the new hiden inner class"); // just for this object 
            } // can also do the same for a abstract class  
        };
        example.show();
    }
    
}
class a{
    public void show(){
        System.out.println("Show");
    }
    class b{
        public void con(){
            System.out.println("In Config");
        }
    }
}
