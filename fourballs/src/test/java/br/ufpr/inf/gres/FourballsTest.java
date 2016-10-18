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
package br.ufpr.inf.gres;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jackson Antonio do Prado Lima <jacksonpradolima at gmail.com>
 */
public class FourballsTest {

    @Test
    public void testTS_1_1() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = -2;
        double arg3 = -2;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = -1;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, 1, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_2() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = -2;
        double arg3 = -2;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 1;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, 1, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_3() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = -2;
        double arg3 = -2;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 2;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, 1, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_4() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = -2;
        double arg3 = -2;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 3;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, 1, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_5() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = -2;
        double arg3 = -2;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 4;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, 1, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_6() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = -2;
        double arg3 = -2;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 0;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, 1, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_7() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = -2;
        double arg3 = -2;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = -1;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-1.5, -1.5, -1.5};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_8() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = -2;
        double arg3 = -2;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 1;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, 1, -0.6666666666666666};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_9() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = -2;
        double arg3 = -2;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 2;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, 1, -0.6666666666666666};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_10() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = -2;
        double arg3 = -2;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 3;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, 1, -0.6666666666666666};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_11() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = -2;
        double arg3 = -2;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 4;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-1.5, -1.5, -1.5};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_12() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = -2;
        double arg3 = -2;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 0;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-1.5, -1.5, -1.5};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_13() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = -2;
        double arg3 = 3;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = -1;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, 1, -0.6666666666666666};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_14() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = -2;
        double arg3 = 3;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 1;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, -0.6666666666666666, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_15() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = -2;
        double arg3 = 3;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 2;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, -0.6666666666666666, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_16() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = -2;
        double arg3 = 3;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 3;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-1.5, -1.5, -1.5};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_17() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = -2;
        double arg3 = 3;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 4;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, 1, -0.6666666666666666};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_18() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = -2;
        double arg3 = 3;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 0;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, 1, -0.6666666666666666};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_19() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = -2;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = -1;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-1.5, -1.5, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_20() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = -2;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 1;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, -0.6666666666666666, -0.6666666666666666};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_21() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = -2;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 2;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, -0.6666666666666666, -0.6666666666666666};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_22() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = -2;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 3;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-1.5, -1.5, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_23() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = -2;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 4;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-1.5, -1.5, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_24() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = -2;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 0;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-1.5, -1.5, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_25() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = 3;
        double arg3 = -2;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = -1;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, -0.6666666666666666, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_26() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = 3;
        double arg3 = -2;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 1;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-0.6666666666666666, 1, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_27() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = 3;
        double arg3 = -2;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 2;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-1.5, -1.5, -1.5};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_28() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = 3;
        double arg3 = -2;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 3;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, -0.6666666666666666, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_29() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = 3;
        double arg3 = -2;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 4;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, -0.6666666666666666, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_30() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = 3;
        double arg3 = -2;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 0;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, -0.6666666666666666, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_31() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = 3;
        double arg3 = -2;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = -1;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-1.5, 1, -1.5};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_32() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = 3;
        double arg3 = -2;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 1;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-0.6666666666666666, 1, -0.6666666666666666};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_33() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = 3;
        double arg3 = -2;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 2;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-1.5, -1.5, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_34() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = 3;
        double arg3 = -2;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 3;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, -0.6666666666666666, -0.6666666666666666};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_35() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = 3;
        double arg3 = -2;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 4;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-1.5, 1, -1.5};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_36() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = 3;
        double arg3 = -2;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 0;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-1.5, 1, -1.5};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_37() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = -1;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, -0.6666666666666666, -0.6666666666666666};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_38() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 1;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-0.6666666666666666, -0.6666666666666666, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_39() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 2;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-1.5, 1, -1.5};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_40() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 3;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-1.5, 1, -1.5};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_41() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 4;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, -0.6666666666666666, -0.6666666666666666};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_42() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 0;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, -0.6666666666666666, -0.6666666666666666};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_43() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = -1;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-1.5, 1, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_44() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 1;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-0.6666666666666666, -0.6666666666666666, -0.6666666666666666};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_45() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 2;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-1.5, 1, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_46() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 3;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-1.5, 1, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_47() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 4;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-1.5, 1, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_48() {
        Fourballs instance = null;
        double arg1 = -2;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 0;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-1.5, 1, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_49() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = -2;
        double arg3 = -2;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = -1;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-0.6666666666666666, 1, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_50() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = -2;
        double arg3 = -2;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 1;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-1.5, -1.5, -1.5};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_51() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = -2;
        double arg3 = -2;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 2;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-0.6666666666666666, 1, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_52() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = -2;
        double arg3 = -2;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 3;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-0.6666666666666666, 1, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_53() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = -2;
        double arg3 = -2;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 4;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-0.6666666666666666, 1, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_54() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = -2;
        double arg3 = -2;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 0;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-0.6666666666666666, 1, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_55() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = -2;
        double arg3 = -2;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = -1;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, -1.5, -1.5};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_56() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = -2;
        double arg3 = -2;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 1;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-1.5, -1.5, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_57() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = -2;
        double arg3 = -2;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 2;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-0.6666666666666666, 1, -0.6666666666666666};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_58() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = -2;
        double arg3 = -2;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 3;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-0.6666666666666666, 1, -0.6666666666666666};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_59() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = -2;
        double arg3 = -2;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 4;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, -1.5, -1.5};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_60() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = -2;
        double arg3 = -2;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 0;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, -1.5, -1.5};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_61() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = -2;
        double arg3 = 3;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = -1;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-0.6666666666666666, 1, -0.6666666666666666};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_62() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = -2;
        double arg3 = 3;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 1;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-1.5, 1, -1.5};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_63() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = -2;
        double arg3 = 3;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 2;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-0.6666666666666666, -0.6666666666666666, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_64() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = -2;
        double arg3 = 3;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 3;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, -1.5, -1.5};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_65() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = -2;
        double arg3 = 3;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 4;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-0.6666666666666666, 1, -0.6666666666666666};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_66() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = -2;
        double arg3 = 3;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 0;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-0.6666666666666666, 1, -0.6666666666666666};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_67() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = -2;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = -1;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, -1.5, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_68() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = -2;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 1;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-1.5, 1, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_69() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = -2;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 2;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-0.6666666666666666, -0.6666666666666666, -0.6666666666666666};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_70() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = -2;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 3;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, -1.5, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_71() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = -2;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 4;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, -1.5, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_72() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = -2;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 0;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, -1.5, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_73() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = -2;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = -1;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-0.6666666666666666, -0.6666666666666666, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_74() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = -2;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 1;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, -1.5, -1.5};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_75() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = -2;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 2;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, -1.5, -1.5};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_76() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = -2;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 3;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-0.6666666666666666, -0.6666666666666666, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_77() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = -2;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 4;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-0.6666666666666666, -0.6666666666666666, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_78() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = -2;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 0;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-0.6666666666666666, -0.6666666666666666, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_79() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = -2;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = -1;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, 1, -1.5};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_80() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = -2;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 1;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, -1.5, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_81() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = -2;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 2;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, -1.5, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_82() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = -2;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 3;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-0.6666666666666666, -0.6666666666666666, -0.6666666666666666};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_83() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = -2;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 4;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, 1, -1.5};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_84() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = -2;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 0;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, 1, -1.5};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_85() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = -1;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-0.6666666666666666, -0.6666666666666666, -0.6666666666666666};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_86() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 1;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, 1, -1.5};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_87() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 2;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, 1, -1.5};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_88() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 3;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, 1, -1.5};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_89() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 4;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-0.6666666666666666, -0.6666666666666666, -0.6666666666666666};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_90() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = -2;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 0;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{-0.6666666666666666, -0.6666666666666666, -0.6666666666666666};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_91() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = -1;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, 1, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_92() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 1;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, 1, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_93() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 2;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, 1, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_94() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 3;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, 1, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_95() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 4;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, 1, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_96() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 0;
        double[] actuals = instance.relativeWeight(arg5);
        double[] expecteds = new double[]{1, 1, 1};
        assertArrayEquals(expecteds, actuals, 0.001);
    }

    @Test
    public void testTS_1_97() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        assertTrue(instance.mA == 3);
    }

    @Test
    public void testTS_1_98() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        assertTrue(instance.mB == 3);
    }

    @Test
    public void testTS_1_99() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        assertTrue(instance.mC == 3);
    }

    @Test
    public void testTS_1_100() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        assertTrue(instance.mD == 3);
    }

    @Test
    public void testTS_1_101() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 0;
        double[] actuals = instance.relativeWeight(arg5);
        assertTrue(instance.mA == 3);
    }

    @Test
    public void testTS_1_102() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 0;
        double[] actuals = instance.relativeWeight(arg5);
        assertTrue(instance.mB == 3);
    }

    @Test
    public void testTS_1_103() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 0;
        double[] actuals = instance.relativeWeight(arg5);
        assertTrue(instance.mC == 3);
    }

    @Test
    public void testTS_1_104() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        int arg5 = 0;
        double[] actuals = instance.relativeWeight(arg5);
        assertTrue(instance.mD == 3);
    }

    @Test
    public void testTS_1_105() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        double[] actuals = instance.relativeWeight(1);
        assertTrue(instance.mA == 3);
    }

    @Test
    public void testTS_1_106() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        double[] actuals = instance.relativeWeight(1);
        assertTrue(instance.mB == 3);
    }

    @Test
    public void testTS_1_107() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        double[] actuals = instance.relativeWeight(1);
        assertTrue(instance.mC == 3);
    }

    @Test
    public void testTS_1_108() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        double[] actuals = instance.relativeWeight(1);
        assertTrue(instance.mD == 3);
    }

    @Test
    public void testTS_1_109() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        double[] actuals = instance.relativeWeight(2);
        assertTrue(instance.mA == 3);
    }

    @Test
    public void testTS_1_110() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        double[] actuals = instance.relativeWeight(2);
        assertTrue(instance.mB == 3);
    }

    @Test
    public void testTS_1_111() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        double[] actuals = instance.relativeWeight(2);
        assertTrue(instance.mC == 3);
    }

    @Test
    public void testTS_1_112() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        double[] actuals = instance.relativeWeight(2);
        assertTrue(instance.mD == 3);
    }
    
    @Test
    public void testTS_1_113() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        double[] actuals = instance.relativeWeight(3);
        assertTrue(instance.mA == 3);
    }

    @Test
    public void testTS_1_114() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        double[] actuals = instance.relativeWeight(3);
        assertTrue(instance.mB == 3);
    }

    @Test
    public void testTS_1_115() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        double[] actuals = instance.relativeWeight(3);
        assertTrue(instance.mC == 3);
    }

    @Test
    public void testTS_1_116() {
        Fourballs instance = null;
        double arg1 = 3;
        double arg2 = 3;
        double arg3 = 3;
        double arg4 = 3;
        instance = new Fourballs(arg1, arg2, arg3, arg4);
        double[] actuals = instance.relativeWeight(3);
        assertTrue(instance.mD == 3);
    }
}
