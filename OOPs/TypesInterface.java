public class TypesInterface{
    public static void main(String[] args) {
        sam A = ()-> System.out.println("hello"); 
        // this is lamda expression came in java 8
        // only for SAM with funtional interface
        A.show();

        Add ex = (i,j) -> (i+j);
        int ans = ex.sum(3, 3);
        System.out.println(ans);
    }
}
//interface having 2 or more methods it a NORMAL INTERFACE
//SAM - single abstract interafce (only one method is allowed)
@FunctionalInterface // only allows one method
interface sam{
    void show();
}

@FunctionalInterface
interface Add {
    int sum(int a, int b);
}