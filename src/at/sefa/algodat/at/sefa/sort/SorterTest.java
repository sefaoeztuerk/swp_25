package at.sefa.sort;

import org.junit.Assert;
import org.junit.Test;

public class SorterTest {
    @Test
    public void testBubbleSort() {
        int[] numbers = { 5, 3, 8, 6, 2 };
        new BubbleSort().sort(numbers);
        Assert.assertArrayEquals(new int[] { 2, 3, 5, 6, 8 }, numbers);
    }

    @Test
    public void testSelectionSort() {
        int[] numbers = { 5, 3, 8, 6, 2 };
        new SelectionSort().sort(numbers);
        Assert.assertArrayEquals(new int[] { 2, 3, 5, 6, 8 }, numbers);
    }

    @Test
    public void testInsertionSort() {
        int[] numbers = { 5, 3, 8, 6, 2 };
        new InsertionSort().sort(numbers);
        Assert.assertArrayEquals(new int[] { 2, 3, 5, 6, 8 }, numbers);
    }
}
