package testingmisc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
@Slf4j
public class IteratorTesting {
    @Test
    public void removeInLoop(){
        ArrayList<Interval> intervals= new ArrayList<>();
        intervals.add(new Interval(1,3));
        intervals.add(new Interval(5,9));
        intervals.add(new Interval(10,13));
        intervals.add(new Interval(14,20));
        Iterator<Interval> iter =intervals.iterator();
        log.info("{}",intervals);
        while (iter.hasNext()) {
            int tmp=iter.next().getX(); //iter.next removes also forwards the pointer
            if (tmp >= 5 && tmp<14) {
                iter.remove(); //removes last value we got from the next
            }
        }
        log.info("{}",intervals);
    }

}
@Data
@AllArgsConstructor
@ToString
class Interval{

    int x;
    int y;

}
