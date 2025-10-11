/*
 * The 'status' enum.
 * <p>
 * Enums in Java are special class types that represent a group of constants.
 * They provide type-safety for a set of related values and are commonly used for
 * representing fixed sets of values (like status codes, days of week, etc.).
 * Usage example:
 * enum Status { PENDING, ACTIVE, INACTIVE, DELETED }
 * Status currentStatus = Status.ACTIVE;
 * also can't extend enum 
 */
public class enums {
    public static void main(String[] args) {
        Status[] s = Status.values(); // to use as array do this

        for(Status obj : s){
            System.out.println(obj + " : " + obj.ordinal());
            //                every object   odinal is the index (st from 0)
        }

        for(Laptop i : Laptop.values()){ // loop for all without a external object
            System.out.println(i + "'s Price : " + i.getPrice());
        }

    }
}

enum Status{
    PENDING, ACTIVE, INACTIVE, DELETED;
    // creates objects auto matically
}
enum Laptop{
    Macbook(3000),striks(40000),Xps(1200),Surface;

    private int price; //varible to assgin the values
    private Laptop(){ // defult non paramitersied constructor
        price = 9999;
    }
    private Laptop(int price){
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }    
}
