package problemsolving.algo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.junit.Test;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTesting {
    @Test
    public void t() {
        PriorityQueue<VerticeDistPair> queue = new PriorityQueue<>(Comparator.comparingInt(x -> x.dist));
        queue.add(new VerticeDistPair(10,5));
        queue.add(new VerticeDistPair(2,5));
        queue.add(new VerticeDistPair(3,5));
        queue.add(new VerticeDistPair(1,5));
        System.out.println(queue);

    }

    @Data
    @Getter
    @Setter
    @AllArgsConstructor
    private class VerticeDistPair {

        int dist;
        Object data;

    }
}
