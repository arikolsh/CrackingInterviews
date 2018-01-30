package problemsolving.algo;

import lombok.*;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

public class FindSchedule {


    public ArrayList<Group> solve(ArrayList<Activity> activies) {//w.c. O(n^2) when everyone collide

        ArrayList<Activity> A = new ArrayList<>(activies);
        ArrayList<Group> groups = new ArrayList<>();
        int minEnd = 0; // if we know the minimum end at all times then we can check validity in O(1)
        //need min heap for this
        Collections.sort(A, Comparator.comparingInt(a -> a.start)); //O(nlogn)
        for (int i = 0; i < A.size(); i++) { //O(n)
            Activity tmp = A.get(i);
            boolean added = false;
            for (Group group : groups) { //O(n)
                if (added = group.add(tmp)) {
                    break;
                }
            }
            if (!added) groups.add(new Group(tmp));
        }
        return groups;

    }

    @Test
    public void t() {
        int[] dist = new int[10];
            for (int i = 0; i < 10; dist[i++] = Integer.MAX_VALUE);
        HashMap<Integer,List<Integer>> m = new HashMap<>();
        m.put(3,Arrays.asList(3,2));
        System.out.println(m.size());
        ArrayList<Activity> arr = new ArrayList<>(
                Arrays.asList(
                        new Activity(1, 2),
                        new Activity(4, 6),
                        new Activity(5, 8),
                        new Activity(9, 10),
                        new Activity(7, 11),
                        new Activity(3, 12)
                )
        );
        System.out.println(solve(arr));
    }


}

@ToString
@AllArgsConstructor
class Activity {
    int start;
    int end;
}

@ToString
class Group {

    @Setter
    @Getter
    int end;

    ArrayList<Activity> group = new ArrayList<>();

    public Group(Activity first) {
        group.add(first);
        end = first.end;
    }

    boolean add(Activity activity) {
        if (activity.start <= end) return false;
        group.add(activity);
        if (activity.end > this.end) this.end = activity.end;
        return true;
    }

}