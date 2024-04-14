import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Comparator;

public class sortInJava {
    static class Student implements Comparable {
        String name;
        int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" + "name='" + name + '\'' + ", age=" + age + '}';
        }

        @Override
        public int compareTo(@NotNull Object other) {
            Student otherStudent = (Student) other;
            if (this.age == otherStudent.age) {
                return 0;
            } else if (this.age > otherStudent.age) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    static class sosanh implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            if (o1.name.length() == o2.name.length()) {
                return 0;
            } else if (o1.name.length() > o2.name.length()) {
                return 1;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        //sort an interger array
        int[] nums = {6, 3, 2, 1};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        //sort an String array
        String[] strArr = {"1", "000", "2"};
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        //sort a Student array with interface comparable
        Student[] students = {new Student("aaaaa", 20), new Student("bbbb", 10)};
        Arrays.sort(students);
//        System.out.println(Arrays.toString(students));

        //sort a Student array with comparator

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                if (o1.name.equals(o2.name)) {
//                    return 0;
//                }
                return o1.name.compareTo(o2.name.toString());
            }
        });
//        System.out.println(Arrays.toString(students));

        sosanh s = new sosanh();
        Arrays.sort(students, s);
        System.out.println(Arrays.toString(students));
    }

}
