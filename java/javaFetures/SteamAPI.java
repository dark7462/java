import java.util.*;
import java.util.stream.Stream;

public class SteamAPI {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,3,8,23,4,1); // we can give direct values to it by passing values as arrays

        nums.forEach(n -> System.out.println(n));
        // for each funtion in lists or any class's obj

        Stream <Integer> s1 = nums.stream(); // values of nums are copied to steam s1
        s1.forEach(n -> System.out.println(n)); // commnet this to use s2

        // cretaed a stream that can be used only once 
        // can be used only once but printed multiple times
        s1.forEach(n -> System.out.println(n)); // this will give error now

        Stream <Integer> s2 = s1.filter(n -> n%2 == 0); // since I'm using s1 here i need to comment the upper print froEach statement else it won't work
        s2.forEach(n -> System.out.println(n)); // noe here s2 is used now we can't use it anymore

        Stream <Integer> s3 = s1.map(n -> n*n); // in order to use this i need to commet everything above except line 12 (nums.Stream)
        s3.forEach(n -> System.out.println(n));

        // there's a more easy way to use Stream
        nums.stream().filter(n -> n%2 != 0).forEach(n -> System.out.println(n));
        // nums.stream gives a stream which is later on filered and the printed
    }
}