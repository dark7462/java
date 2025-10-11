package SystemLevel;
// smallest A thread in Java is the smallest unit of execution within a program
// used to run multiple things at once
// mostly automatically are implemented by your framwork but somtimes you need to do it by yourself
class A extends Thread{
    @Override
    public void run(){
        for(int i = 0 ; i < 10 ; i++){
            System.out.println("hi");
        }
        try {
            Thread.sleep(100); // Single sleep after loop completion
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
class B extends Thread{
    @Override
    public void run(){
        for(int i = 0 ; i < 10 ; i++){
            System.out.println("hello");
        }
        try {
            Thread.sleep(100); // Single sleep after loop completion
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
class Z implements Runnable{
    @Override
    public void run(){
        for(int i = 0 ; i < 5 ; i++){
            System.out.println("run..");
        }
    }
}
public class Threads{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        // we could also set the priority of any object as follows
        b.setPriority(Thread.MAX_PRIORITY); // now b will get more priority 
        // but it doesn't mean that b will be exceuted first
        // we can only suggest our CPU scheduler not force it to do any task

        a.start(); // start will call a run method so the normal method name should be run

        try { // now after a b will start after 2 miliseconds
            Thread.sleep(2);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        b.start();

        // runnable

        Runnable z = new Z(); // instance of runnable object of Z
        Thread t1 = new Thread(z); // kind of works like threads but it's a but diffrent
        t1.start();
    }
}

