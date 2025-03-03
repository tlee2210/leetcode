import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        System.out.println("add: " + arr);
        arr.remove(1);
        System.out.println("remove index = 1 : " + arr);
//        arr.clear();
//        System.out.println("clear: " + arr);
        System.out.println("contains 1: " + arr.contains(1));
    }
}
