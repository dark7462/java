public class Encapsulation {
    public static void main(String[] args) {
        human anu = new human();
        anu.setAge(10);
        anu.setName("Anurag");

        System.out.println("Name : " + anu.getName() + " || Age : " + anu.getAge());

        final int a = 10; // used as const in c,c++
        // a = 11; // this is a error
        System.out.println(a);
        // use final for veriable to stop inheritance stop method override and stopchanging of values
    }
}
class human{
    private String name;
    private int age;
    public int getAge(){ //getter
        return age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) { //setter
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}