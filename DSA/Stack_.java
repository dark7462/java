import java.util.ArrayList;

public class Stack_ {
    public static void main(String []args){
        stack s1 = new stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        s1.display();
        s1.pop();
        s1.display();
    }
}
class stack{ // last in first out (basic implimentation)
    private int top;
    private ArrayList<Integer> arr = new ArrayList<>();
    stack(){
        top = -1;
    }
    stack(int val){
        top = 0;
        arr.add(val);
    }
    public boolean isEmpty(){
        if(top == -1) return true;
        else return false;
    }
    public boolean isFull(){
        if(top == 10e7) return true; // almost 10 power 7 theoratical limit of a ArrayList (you can still store till your memory is full)
        else return false;
    }
    public void push(int val){
        if(isFull()){
            System.out.println("Stack is full.");
            return;
        }
        arr.add(val);
        top++;
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty.");
            return;
        }
        arr.remove(top);
        // time complexity : O(1) (if removing the last element, no shifting needed)
        top--;
    }
    public void display(){
        for(int i = 0; i <= top; i++){
            System.out.print(arr.get(i) + " ");
        } System.out.println();
    }
}