package test;

import org.junit.Assert;
import org.junit.Test;
import sorting.CorrectnessandtheLoopInvariant;

import static org.junit.Assert.assertTrue;

/**
 * Created by a7madm on 3/11/17.
 */
public class CorrectnessTheLoopTest {

    @Test
    public void testcase1() {
        CorrectnessandtheLoopInvariant correctnessandtheLoopInvariant = new CorrectnessandtheLoopInvariant();
        int[] arr = {4, 1, 3, 5, 6, 2};
        arr = correctnessandtheLoopInvariant.insertionSort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            assertTrue(arr[i] <= arr[i + 1]);
        }
    }
}
