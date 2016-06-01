/*
 * Copyright 2016 Jackson Antonio do Prado Lima <jacksonpradolima at gmail.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hg4hom;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jackson Antonio do Prado Lima <jacksonpradolima at gmail.com>
 */
public class FindTest {

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_1() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = -1;
        obtained.partition(arg5);
    }

    @Test
    public void testTS_1_2() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 0;
        obtained.partition(arg5);
        int[] expectedResult = new int[]{-1, -1, -1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_3() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 1;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, -1, -1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_4() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 2;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, -1, -1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_5() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 3;
        obtained.partition(arg5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_6() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = -1;
        obtained.partition(arg5);
    }

    @Test
    public void testTS_1_7() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 0;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, -1, 0};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_8() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 1;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, -1, 0};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_9() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 2;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, -1, 0};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_10() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 3;
        obtained.partition(arg5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_11() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = -1;
        obtained.partition(arg5);
    }

    @Test
    public void testTS_1_12() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 0;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, -1, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_13() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 1;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, -1, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_14() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 2;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, -1, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_15() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 3;
        obtained.partition(arg5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_16() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = -1;
        obtained.partition(arg5);
    }

    @Test
    public void testTS_1_17() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 0;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, -1, 0};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_18() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 1;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, -1, 0};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_19() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 2;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, -1, 0};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_20() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 3;
        obtained.partition(arg5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_21() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = -1;
        obtained.partition(arg5);
    }

    @Test
    public void testTS_1_22() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 0;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, 0, 0};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_23() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 1;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, 0, 0};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_24() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 2;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, 0, 0};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_25() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 3;
        obtained.partition(arg5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_26() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = -1;
        obtained.partition(arg5);
    }

    @Test
    public void testTS_1_27() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 0;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, 0, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_28() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 1;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, 0, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_29() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 2;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, 0, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_30() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 3;
        obtained.partition(arg5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_31() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = -1;
        obtained.partition(arg5);
    }

    @Test
    public void testTS_1_32() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 0;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, -1, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_33() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 1;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, -1, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_34() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 2;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, -1, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_35() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 3;
        obtained.partition(arg5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_36() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = -1;
        obtained.partition(arg5);
    }

    @Test
    public void testTS_1_37() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 0;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, 1, 0};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_38() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 1;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, 0, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_39() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 2;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, 0, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_40() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 3;
        obtained.partition(arg5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_41() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = -1;
        obtained.partition(arg5);
    }

    @Test
    public void testTS_1_42() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 0;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, 1, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_43() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 1;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, 1, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_44() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 2;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, 1, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_45() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = -1;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 3;
        obtained.partition(arg5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_46() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = -1;
        obtained.partition(arg5);
    }

    @Test
    public void testTS_1_47() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 0;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, -1, 0};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_48() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 1;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, -1, 0};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_49() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 2;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, -1, 0};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_50() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 3;
        obtained.partition(arg5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_51() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = -1;
        obtained.partition(arg5);
    }

    @Test
    public void testTS_1_52() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 0;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, 0, 0};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_53() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 1;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, 0, 0};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_54() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 2;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, 0, 0};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_55() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 3;
        obtained.partition(arg5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_56() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = -1;
        obtained.partition(arg5);
    }

    @Test
    public void testTS_1_57() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 0;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, 0, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_58() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 1;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, 0, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_59() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 2;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{0, -1, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_60() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 3;
        obtained.partition(arg5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_61() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = -1;
        obtained.partition(arg5);
    }

    @Test
    public void testTS_1_62() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 0;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, 0, 0};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_63() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 1;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, 0, 0};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_64() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 2;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, 0, 0};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_65() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 3;
        obtained.partition(arg5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_66() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = -1;
        obtained.partition(arg5);
    }

    @Test
    public void testTS_1_67() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 0;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{0, 0, 0};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_68() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 1;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{0, 0, 0};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_69() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 2;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{0, 0, 0};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_70() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 3;
        obtained.partition(arg5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_71() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = -1;
        obtained.partition(arg5);
    }

    @Test
    public void testTS_1_72() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 0;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{0, 0, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_73() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 1;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{0, 0, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_74() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 2;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{0, 0, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_75() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 3;
        obtained.partition(arg5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_76() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = -1;
        obtained.partition(arg5);
    }

    @Test
    public void testTS_1_77() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 0;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, 0, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_78() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 1;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{0, -1, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_79() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 2;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, 0, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_80() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 3;
        obtained.partition(arg5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_81() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = -1;
        obtained.partition(arg5);
    }

    @Test
    public void testTS_1_82() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 0;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{0, 0, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_83() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 1;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{0, 0, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_84() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 2;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{0, 0, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_85() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 3;
        obtained.partition(arg5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_86() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = -1;
        obtained.partition(arg5);
    }

    @Test
    public void testTS_1_87() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 0;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{0, 1, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_88() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 1;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{0, 1, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_89() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 2;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{0, 1, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_90() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 0;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 3;
        obtained.partition(arg5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_91() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = -1;
        obtained.partition(arg5);
    }

    @Test
    public void testTS_1_92() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 0;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, -1, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_93() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 1;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, -1, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_94() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 2;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, -1, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_95() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 3;
        obtained.partition(arg5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_96() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = -1;
        obtained.partition(arg5);
    }

    @Test
    public void testTS_1_97() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 0;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, 0, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_98() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 1;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, 1, 0};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_99() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 2;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, 0, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_100() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 3;
        obtained.partition(arg5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_101() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = -1;
        obtained.partition(arg5);
    }

    @Test
    public void testTS_1_102() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 0;
        obtained.partition(arg5);
    }

    @Test
    public void testTS_1_103() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 1;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, 1, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_104() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 2;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, 1, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_105() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = -1;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 3;
        obtained.partition(arg5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_106() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = -1;
        obtained.partition(arg5);
    }

    @Test
    public void testTS_1_107() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 0;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{0, -1, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_108() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 1;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, 0, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_109() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 2;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, 1, 0};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_110() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 3;
        obtained.partition(arg5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_111() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = -1;
        obtained.partition(arg5);
    }

    @Test
    public void testTS_1_112() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 0;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{0, 0, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_113() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 1;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{0, 0, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_114() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 2;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{0, 0, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_115() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 3;
        obtained.partition(arg5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_116() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = -1;
        obtained.partition(arg5);
    }

    @Test
    public void testTS_1_117() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 0;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{0, 1, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_118() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 1;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{0, 1, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_119() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 2;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{0, 1, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_120() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = 0;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 3;
        obtained.partition(arg5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_121() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = -1;
        obtained.partition(arg5);
    }

    @Test
    public void testTS_1_122() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 0;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, 1, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_123() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 1;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, 1, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_124() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 2;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{-1, 1, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_125() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = -1;
        obtained.addItem(arg4);
        int arg5 = 3;
        obtained.partition(arg5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_126() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = -1;
        obtained.partition(arg5);
    }

    @Test
    public void testTS_1_127() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 0;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{0, 1, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_128() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 1;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{0, 1, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_129() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 2;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{0, 1, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_130() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = 0;
        obtained.addItem(arg4);
        int arg5 = 3;
        obtained.partition(arg5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_131() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = -1;
        obtained.partition(arg5);
    }

    @Test
    public void testTS_1_132() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 0;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{1, 1, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_133() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 1;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{1, 1, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test
    public void testTS_1_134() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 2;
        obtained.partition(arg5);

        int[] expectedResult = new int[]{1, 1, 1};
        assertArrayEquals(expectedResult, obtained.getVector());
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testTS_1_135() {

        Find obtained = null;
        int arg1 = 3;
        obtained = new Find(arg1);
        int arg2 = 1;
        obtained.addItem(arg2);
        int arg3 = 1;
        obtained.addItem(arg3);
        int arg4 = 1;
        obtained.addItem(arg4);
        int arg5 = 3;
        obtained.partition(arg5);
    }

}
