import java.util.*;

public class Sorting {
    public static void main(String args[]){

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(200);
        list.add(128);
        list.add(90);

        Collections.sort(list); // this how you sort a ArrayList 
        //System.out.println(list);
        // how can we use a costume comparetor
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(19); arr.add(16); arr.add(15); arr.add(21); arr.add(10);
        System.out.println(arr);
        

        // either make in this way or can be used by lamda funtion as well
        @SuppressWarnings("Convert2Lambda") // we can use lamda funtion and since we are not using it's giving warning that's why supressed to see how it works without lamba funtion
        Comparator<Integer> costum = new Comparator<Integer>(){
            @Override
            public int compare(Integer a, Integer b){
            if(a<b) return 1; // this will give the greter values priorities
            else return -1;
        }
        };

        Collections.sort(arr,costum);
        System.out.println(arr);

        // lets make a list of classes and try to sort them using there values with a comparitor
        ArrayList<Students> studs = new ArrayList<>();
        studs.add(new Students(18,"Anurag"));
        studs.add(new Students(20,"Piyush"));
        studs.add(new Students(19,"Harsh"));

        // for sorting we have to make a comparitor
        // since this is abstract class we can use lamda funtions
        Comparator<Students> stu = (Students i, Students j) -> {
            if(i.age < j.age) return 1;
            else return -1;
        };
        Collections.sort(studs,stu);

        for(Students s : studs){
            s.info();
        }

    }
}
class Students{
    int age;
    String name;
    Students(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public void info(){
        System.out.println("Name : " + name + ", my age is : " + age);
    }
}
