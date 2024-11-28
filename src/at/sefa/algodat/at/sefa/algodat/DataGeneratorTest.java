package at.sefa.algodat;

import org.junit.Assert;
import org.junit.Test;

public class DataGeneratorTest {
    @Test
    public void testGenerateDataArray() {
        int[] randomNumbers = DataGenerator.generateDataArray(5);
        Assert.assertEquals(randomNumbers.length, 5);
    }

    @Test
    public void testGenerateDataArray2() {
        int[] randomNumbers = DataGenerator.generateDataArray2(5, 10, 50);
        Assert.assertEquals(randomNumbers.length, 5);

    }

}
