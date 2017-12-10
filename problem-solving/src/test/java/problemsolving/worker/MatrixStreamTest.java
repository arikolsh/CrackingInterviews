package problemsolving.worker;

import org.junit.Test;

public class MatrixStreamTest {
    @Test
    public void test() {
        MatrixStream m = new MatrixStream(3);
        System.out.println(m.push(1));
        System.out.println(m.push(1));
        System.out.println(m.push(1));
        System.out.println(m.push(1));
        System.out.println(m.push(0));
        System.out.println(m.push(0));
        System.out.println(m.push(0));
        System.out.println(m.push(0));
        System.out.println(m.push(0));
        System.out.println(m.push(0));
        System.out.println(m.push(0));
        System.out.println(m.push(0));
        System.out.println(m.push(0));
        System.out.println(m.push(0));

    }

}
