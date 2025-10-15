import java.util.ArrayList;
public class Queue_ {
    public static void main(String []args){
        queue q1 = new queue();
        q1.enQueue(10);
        q1.enQueue(20);
        q1.enQueue(30);
        q1.enQueue(40);
        q1.enQueue(50);
        q1.display();
        q1.deQueue();
        q1.display();
        System.out.println(q1.getSize());
    }
}

class queue{ // last in first out (basic implimentation)
    private int top;
    private int front;
    private ArrayList<Integer> arr = new ArrayList<>();
    queue(){
        top = -1;
        front = -1;
    }
    queue(int val){
        top = 0;
        front = 0;
        arr.add(val);
    }
    public boolean isEmpty(){
        if(top == -1 || top < front) return true;
        else return false;
    }
    public boolean isFull(){
        if(top == 10e7) return true; // almost 10 power 7 theoratical limit of a ArrayList (you can still store till your memory is full)
        else return false;
    }
    public void enQueue(int val){
        if(isFull()){
            System.out.println("Queue is full.");
            return;
        }
        if(front == -1) front = 0;
        arr.add(val);
        top++;
    }
    public void deQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty.");
            return;
        }
        front++;
    }
    public int getSize(){
        return (top-front+1);
    }
    public void display(){
        for(int i = front ; i <= top ; i++){
            System.out.print(arr.get(i) + " ");
        } System.out.println();
    }
}
