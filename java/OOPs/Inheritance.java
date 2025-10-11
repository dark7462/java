public class Inheritance {
    public static void main(String[] args) {
        AdvCal obj = new AdvCal();
        obj.show();
        Cal ojb1 = new Cal();
        ojb1.show();
        System.out.println(obj.add(90,9));
        System.out.println(obj.sub(90,9));
        System.out.println(obj.sqrt(90));
    }
}
class Cal{
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int mul(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }
    public void show(){
        System.out.println("Calculator");
    }
}
class AdvCal extends Cal{ // takes methods and veriables of calulator
    public double sqrt(int n){
        return Math.sqrt(n);
    }
    @Override // we have to change some but not all menthods from the parent class
    public void show(){
        System.out.println("Advance Calculator");
    }
}