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

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jackson Antonio do Prado Lima <jacksonpradolima at gmail.com>
 */
public class BisectTest {

    @Test
    public void testTS_1_1() {
        Bisect instance = new Bisect();
        double arg1 = 0.1;
        instance.setEpsilon(arg1);
        double arg2 = 5;
        assertEquals(instance.sqrt(arg2), 2.25, 0.001);
    }

    @Test
    public void testTS_1_2() {
        Bisect instance = new Bisect();
        double arg1 = 0.1;
        instance.setEpsilon(arg1);
        double arg2 = 3;
        assertEquals(instance.sqrt(arg2), 1.75, 0.001);
    }

    @Test
    public void testTS_1_3() {
        Bisect instance = new Bisect();
        double arg1 = 0.1;
        instance.setEpsilon(arg1);
        double arg2 = 0.0000001;
        assertEquals(instance.sqrt(arg2), 1.0E-7, 0.001);
    }

    @Test
    public void testTS_1_4() {
        Bisect instance = new Bisect();
        double arg1 = 0.1;
        instance.setEpsilon(arg1);
        double arg2 = 2;
        assertEquals(instance.sqrt(arg2), 1.4375, 0.001);
    }

    @Test
    public void testTS_1_5() {
        Bisect instance = new Bisect();
        double arg1 = 0.1;
        instance.setEpsilon(arg1);
        double arg2 = 4;
        assertEquals(instance.sqrt(arg2), 1.984375, 0.001);
    }

    @Test
    public void testTS_1_6() {
        Bisect instance = new Bisect();
        double arg1 = 5;
        instance.setEpsilon(arg1);
        double arg2 = 5;
        assertEquals(instance.sqrt(arg2), 3.0, 0.001);
    }

    @Test
    public void testTS_1_7() {
        Bisect instance = new Bisect();
        double arg1 = 5;
        instance.setEpsilon(arg1);
        double arg2 = 3;
        assertEquals(instance.sqrt(arg2), 2.0, 0.001);
    }

    @Test
    public void testTS_1_8() {
        Bisect instance = new Bisect();
        double arg1 = 5;
        instance.setEpsilon(arg1);
        double arg2 = 0.0000001;

        assertEquals(instance.sqrt(arg2), 0.0, 0.001);
    }

    @Test
    public void testTS_1_9() {
        Bisect instance = new Bisect();

        double arg1 = 5;
        instance.setEpsilon(arg1);
        double arg2 = 2;

        assertEquals(instance.sqrt(arg2), 2.0, 0.001);
    }

    @Test
    public void testTS_1_10() {
        Bisect instance = new Bisect();

        double arg1 = 5;
        instance.setEpsilon(arg1);
        double arg2 = 4;

        assertEquals(instance.sqrt(arg2), 2.5, 0.001);
    }

    @Test
    public void testTS_1_11() {
        Bisect instance = new Bisect();

        double arg1 = 0.00001;
        instance.setEpsilon(arg1);
        double arg2 = 5;

        assertEquals(instance.sqrt(arg2), 2.2360687255859375, 0.001);
    }

    @Test
    public void testTS_1_12() {
        Bisect instance = new Bisect();

        double arg1 = 0.00001;
        instance.setEpsilon(arg1);
        double arg2 = 3;

        assertEquals(instance.sqrt(arg2), 1.7320480346679688, 0.001);
    }

    @Test
    public void testTS_1_13() {
        Bisect instance = new Bisect();

        double arg1 = 0.00001;
        instance.setEpsilon(arg1);
        double arg2 = 0.0000001;

        assertEquals(instance.sqrt(arg2), 1.0E-7, 0.001);
    }

    @Test
    public void testTS_1_14() {
        Bisect instance = new Bisect();

        double arg1 = 0.00001;
        instance.setEpsilon(arg1);
        double arg2 = 2;

        assertEquals(instance.sqrt(arg2), 1.414215087890625, 0.001);
    }

    @Test
    public void testTS_1_15() {
        Bisect instance = new Bisect();

        double arg1 = 0.00001;
        instance.setEpsilon(arg1);
        double arg2 = 4;

        assertEquals(instance.sqrt(arg2), 2.000001907348633, 0.001);
    }

    @Test
    public void testTS_1_16() {
        Bisect instance = new Bisect();

        double arg1 = 2;
        instance.setEpsilon(arg1);
        double arg2 = 5;

        assertEquals(instance.sqrt(arg2), 2.0, 0.001);
    }

    @Test
    public void testTS_1_17() {
        Bisect instance = new Bisect();

        double arg1 = 2;
        instance.setEpsilon(arg1);
        double arg2 = 3;

        assertEquals(instance.sqrt(arg2), 2.0, 0.001);
    }

    @Test
    public void testTS_1_18() {
        Bisect instance = new Bisect();

        double arg1 = 2;
        instance.setEpsilon(arg1);
        double arg2 = 0.0000001;

        assertEquals(instance.sqrt(arg2), 1.0E-7, 0.001);
    }

    @Test
    public void testTS_1_19() {
        Bisect instance = new Bisect();

        double arg1 = 2;
        instance.setEpsilon(arg1);
        double arg2 = 2;

        assertEquals(instance.sqrt(arg2), 2.0, 0.001);
    }

    @Test
    public void testTS_1_20() {
        Bisect instance = new Bisect();

        double arg1 = 2;
        instance.setEpsilon(arg1);
        double arg2 = 4;

        assertEquals(instance.sqrt(arg2), 1.75, 0.001);
    }

    @Test
    public void testTS_1_21() {
        Bisect instance = new Bisect();

        double arg1 = 4;
        instance.setEpsilon(arg1);
        double arg2 = 5;

        assertEquals(instance.sqrt(arg2), 3.0, 0.001);
    }

    @Test
    public void testTS_1_22() {
        Bisect instance = new Bisect();

        double arg1 = 4;
        instance.setEpsilon(arg1);
        double arg2 = 3;

        assertEquals(instance.sqrt(arg2), 2.0, 0.001);
    }

    @Test
    public void testTS_1_23() {
        Bisect instance = new Bisect();

        double arg1 = 4;
        instance.setEpsilon(arg1);
        double arg2 = 0.0000001;

        assertEquals(instance.sqrt(arg2), 1.0E-7, 0.001);
    }

    @Test
    public void testTS_1_24() {
        Bisect instance = new Bisect();

        double arg1 = 4;
        instance.setEpsilon(arg1);
        double arg2 = 2;

        assertEquals(instance.sqrt(arg2), 2.0, 0.001);
    }

    @Test
    public void testTS_1_25() {
        Bisect instance = new Bisect();

        double arg1 = 4;
        instance.setEpsilon(arg1);
        double arg2 = 4;

        assertEquals(instance.sqrt(arg2), 2.5, 0.001);
    }
}
