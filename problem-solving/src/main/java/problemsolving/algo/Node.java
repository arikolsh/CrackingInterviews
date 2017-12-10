package problemsolving.algo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by ariko on 11/28/2017.
 */
@Data
public class Node {
    Integer val;
    Node left = null;
    Node right = null;

    public Node(Integer v) {
        val = v;
    }
}
