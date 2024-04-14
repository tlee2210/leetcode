import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyHashSetInJava {
    public static void main(String[] args) {
        Set<String> myIntSet = new TreeSet<>();
        myIntSet.add("1");
        myIntSet.add("22");
        myIntSet.add("333");
        myIntSet.add("22");
        myIntSet.add("1");

        for (String i : myIntSet) {
            System.out.println(i);
        }
    }
}
