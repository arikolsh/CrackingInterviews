package problemsolving.misc;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by ariko on 11/23/2017.
 */
public class ArrayPartitionTest {

    @Test
    public void test() {


        int arr[] = {0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1};
        new ArrayPartition().solve0and1(arr);
        System.out.println(Arrays.toString(arr));

        int arr2[] = {1, 1, 0, 0, 2, 1, 1, 2, 0, 0, 2, 0, 2, 1, 1};
        new ArrayPartition().solve0and1and2(arr2);
        System.out.println(Arrays.toString(arr2));


    }


}
