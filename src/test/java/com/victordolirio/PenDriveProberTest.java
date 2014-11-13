package com.victordolirio;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PenDriveProberTest {

    private PenDriveProber penDriverProber;

    @Before
    public void setUp() {

    }

    @Test
    public void shouldWriteFilesInPenDriveInOrderToFillEmptySpaceOnDiskAndDeleteFilesAfter() {

        Report report = penDriverProber.probe();

        Assert.assertEquals(100, report.getFreeSpace());
    }
}
