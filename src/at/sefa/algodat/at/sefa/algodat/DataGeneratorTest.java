package at.sefa.algodat;

import org.junit.Assert;
import org.junit.Test;

public class DataGeneratorTest {
    @Test
    public void testGenerateDataArray() {
        int[] randomNumbers = DataGenerator.generateDataArray(5);
        Assert.assertEquals(randomNumbers.length, 5);
    }
}
