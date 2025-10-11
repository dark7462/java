public class structure {
    public static class node{ //stuct
        int data;
        node next;
        node(int val){ // constructor
            this.data = val;
            this.next = null;
        }
    }
    public static class linkedlist{ //stuct
        node head;
        node tail; // instance for a node

        public void insert(int val){ //method/functions
            node newnode = new node(val);

            if(head == null){
                head = newnode;
            }else{
                tail.next = newnode;
            }
            tail = newnode;

        }
        public void Display(){
            node temp = head;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            } System.out.println();
        }
    }
        
    public static void main(String[] args) {
        linkedlist ll = new linkedlist(); //makeing a instance
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.Display();
    }
}