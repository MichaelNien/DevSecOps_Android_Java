package com.devsecops.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppUtilTest {

    @Test
    public void getDataTest() {
        // true
        Assertions.assertEquals(AppUtil.getData(1), 3);
        Assertions.assertEquals(AppUtil.getData(2), 4);

        // false
        Assertions.assertNotEquals(AppUtil.getData(1), 4);
    }
}
