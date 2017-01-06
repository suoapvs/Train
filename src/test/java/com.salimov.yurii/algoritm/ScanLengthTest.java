package com.salimov.yurii.algoritm;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * @author Yurii Salimov (yurii.alex.salimov@gmail.com)
 * @version 1.0
 */
public class ScanLengthTest {

    @Test
    public void whenSetInConstructorNullThenGetZeroLength() {
        final IScanLength scanLength = new ScanLength(null);
        final int length = scanLength.scan();
        assertEquals(length, 0);
    }

    @Ignore
    @Test
    public void whenSetInConstructorInputStreamThenScanLength() {
        final IScanLength scanLength = new ScanLength(System.in);
        final int length = scanLength.scan();
        assertTrue(length > 0);
    }
}
