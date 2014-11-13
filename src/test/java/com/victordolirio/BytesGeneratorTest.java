package com.victordolirio;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BytesGeneratorTest {

    private BytesGenerator bytesGenerator;

    @Before
    public void setUp() throws Exception {
        bytesGenerator = new BytesGenerator();
    }

    @Test
    public void shouldGenerateOnyByteArrayOfNBytes() {

        byte ranKB[] = bytesGenerator.nextBytes(152);

        Assert.assertEquals(152, ranKB.length);
        Assert.assertTrue(notEmpty(ranKB));
    }

    @Test
    public void shouldGenerateOnyByteArrayOfOneKiloByte() {

        byte ranKB[] = bytesGenerator.nextKiloBytes(1);

        Assert.assertEquals(1024, ranKB.length);
        Assert.assertTrue(notEmpty(ranKB));
    }

    @Test
    public void shouldGenerateOnyByteArrayOfTwoKiloByte() {

        byte ranKB[] = bytesGenerator.nextKiloBytes(2);

        Assert.assertEquals(2048, ranKB.length);
        Assert.assertTrue(notEmpty(ranKB));
    }

    @Test
    public void shouldGenerateOnyByteArrayOf4KiloByte() {

        byte ranKB[] = bytesGenerator.nextKiloBytes(4);

        Assert.assertEquals(4096, ranKB.length);
        Assert.assertTrue(notEmpty(ranKB));
    }

    private boolean notEmpty(byte[] ranKB) {
        for (byte b : ranKB) {
            if (b != 0)
                return true;
        }
        return false;
    }
}
