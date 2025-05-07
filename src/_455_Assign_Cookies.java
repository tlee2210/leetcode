import java.util.Arrays;

public class _455_Assign_Cookies {
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child = 0, cookies = 0;
        while (cookies < s.length && child < g.length) {
            if (s[cookies] >= g[child]) {
                child++;
            }
            cookies++;
        }

        return child;
    }

    public static void main(String[] args) {
        int[] g = {1, 2, 3}, s = {1, 1};

        System.out.println(findContentChildren(g, s));
    }
}
