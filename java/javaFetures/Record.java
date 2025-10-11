// import java.util.Objects;
// class coder{
//     private final int id;
//     private final String name;

//     coder(int id, String name){
//         this.id = id;
//         this.name = name;
//     }
//     public int getId(){
//         return this.id;
//     }
//     public String getName(){
//         return this.name;
//     }

//     @Override
//     public String toString(){
//         return "Id : " + this.id + "\n" + "Name : " + this.name + "\n";
//     }
//     @Override
//     public boolean equals (Object o){
//         if(this == o) return true;
//         if(o == null || getClass() != o.getClass()) return false;
//         coder code = (coder) o;
//         return id == code.id && Objects.equals(name, code.name);
//     }

//     @Override
//     public int hashCode(){
//         return Objects.hash(id, name);
//     }
//     // insted for these class of code for comparing and printing the data use record
// }
record coder (int id, String name) {
    // just this and done all the above code is given by lang in backend
    public coder/* no need for the  variables here it's already given above */ {
        if(id == 0){
            throw new IllegalArgumentException("Id can't be zero");
        }// constuructor is made and called automatically in the backend
        // you just ahve to write the extra part
    }
    // can make methods
    public void show(){
        System.out.println("In Show");
    }
    // can be static varible but not 
}

public class Record {
    public static void main(String args[]){
        coder c1 = new coder(0,"Anurag");
        coder c2 = new coder(1,"Anurag");
        System.out.println(c1);

        System.out.println(c1.equals(c2));
    }
}