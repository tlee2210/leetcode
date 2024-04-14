//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static  void f(int a){
        a++;
        System.out.println("check a:" + a);
    }
    public static void main(String[] args) {
        int a = 0;
        a ++;
        int[] arr = {1, 2,3};
        for (int i = 1; i <= 10; i++) {
            a++;
            System.out.println("a = " + a);
            f(a);
        }
        System.out.println("Done!");
    }
}