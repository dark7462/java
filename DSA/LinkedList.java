public class LinkedList{
    public static void main(String []args){
        list l1 = new list();
        l1.insert(10);
        l1.insert(20);
        l1.insert(30);
        l1.insert(40);
        l1.insert(50);
        l1.display();  
    }
}
class node{
    int data;
    node next;
}
class list{
    node head;
    node tail;
    list(int val){
        insert(val);
    }
    list(){
        this.head = null;
    }
    public int top(){
        return tail.data;
    }
    public void insert(int val){
        node newnode = new node();
        newnode.data = val;
        newnode.next = null;
        if(head == null) {
            head = newnode;
        } else{
            tail.next = newnode;
        }
        tail = newnode;
    }
    public void display(){
        node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        } System.out.println();
    }
    
}