
import java.util.*;

public class ListArray {
    public static void main(String arg[]){
        ArrayList<Integer> nums = new ArrayList<>(); // dynamic arrya in java
        nums.add(1); // to push the elements like push_back In vector (if from a c++ backgroud)
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);

        System.out.println("value at 2nd index : " + nums.get(2)); // used to fetch the values from a index
        System.out.println("Index where 7 is : " + nums.indexOf(7)); // it'll get me the index where 7 is stored

        System.out.println(nums); // to print the whole list at onces

        for(int i = 0 ; i < nums.size(); i++){ // normal for loop of the list
            System.out.print(nums.get(i) + " ");
        } System.out.println();

        for(int u : nums){   // for each loop for list
            System.out.print(u + " ");
        } System.out.println();

        nums.sort(Comparator.naturalOrder()); // to sort the Array list
    }
}
