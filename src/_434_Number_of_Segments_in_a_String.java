import java.util.Arrays;

public class _434_Number_of_Segments_in_a_String {
    public static int countSegments(String s) {
        String[] segments = s.trim().split("\\s+");

        return segments.length;
    }

    public static void main(String[] args) {
        String s = "Hello, my name is John";

        System.out.println(countSegments(s));
    }
}
