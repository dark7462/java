import testing_classes.*;

public class Main {
    // Unit testing means to test a unit of code
    // Unit of code means a method or a group of methods performing a task
    // Junit5 is a framework that helps us test our code
    // find the testing functions in the testing_classes folder in the same dir
    public static void main(String[] args) {
        calculator c1 = new calculator();
        if (c1.add(10, 20) == 30) { // this is a manual unit test
            System.out.println("test passed");
        } else {
            System.out.println("Test failed");
        }
        reverseString rev = new reverseString();
        System.out.println(rev.reverse("Anurag"));

    }
}