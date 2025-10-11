import java.util.*;
public class SetCollection {
    public static void main(String[] args) {
        Set<Integer> st = new HashSet<>();
        // can only store unique values (no duplicates are allowed)
        st.add(10);
        st.add(10);
        st.add(20);
        st.add(10);
        st.add(30);

        for(int i : st){    // since set don't have any index we have to travel by for each loop
            System.out.print(i + " ");
        } System.out.println();

        TreeSet<Integer> orderset = new TreeSet<>();
        // it'll store all the elements in the sorted manner
        orderset.add(89);
        orderset.add(49);
        orderset.add(29);
        orderset.add(99);
        System.out.println(orderset);

        Iterator <Integer> it = st.iterator(); // makes the value iterable
        while(it.hasNext()){    // hasNext to check it there is a next element to iterate or not
            System.out.print(it.next() + " ");  // next to jump to next interation
        }System.out.println();
    }
}
