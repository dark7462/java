// final classes - are the classes which can't be inheritated and the methods and memebers are final
@SuppressWarnings("unused")
final class fin{
    public void show(){
        System.out.println("Final class");
    }
}
// class ex_final extends fin{
    // we can't extend (inherit the final class)
// }

// Sealed classes - It's similar to the final / non-sealed class but here cancould give access to the class which can inherit the properties 
sealed class A permits B,C{

}
// the inherited class of the sealed class should be final & should inherit the perent class
non-sealed class B extends A{ // final for ending the inheritance and non-sealed for extension enabling

}
final class C extends A{
    
}

public class SealedClasses {
    public static void main(String args[]){
        
    }
}
