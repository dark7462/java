public class Interface {
    public static void main(String[] args) {
        child example = new child();
        example.info();
        System.out.println(child.AGE);
    }
}

interface parent{
    int AGE = 19; // the variables in the interface are by default final and static
    //Naming convention for final variable is "All caps"
    void info(); // the methods in the interface can be defined later
}
class child implements parent{
    @Override
    public void info(){ // if we don't impliment the methods the child class will be abstract class
        System.out.println("In the child class printing info");
    }
}