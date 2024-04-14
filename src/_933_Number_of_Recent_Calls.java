import java.util.LinkedList;
import java.util.Queue;

public class _933_Number_of_Recent_Calls {
    private static Queue<Integer> myQueue = new LinkedList<>();

    public static int ping(int t) {
        myQueue.add(t);
        while (myQueue.peek() < (t - 3000)) {
            myQueue.remove();
        }
        return myQueue.size();
    }
}
