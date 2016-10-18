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
public class MidTest {

    @Test
    public void testTS_1_1() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -2;
        instance.setA(arg1);
        int arg2 = -2;
        instance.setB(arg2);
        int arg3 = -2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-2, actual);
    }

    @Test
    public void testTS_1_2() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -2;
        instance.setA(arg1);
        int arg2 = -2;
        instance.setB(arg2);
        int arg3 = -1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-1, actual);
    }

    @Test
    public void testTS_1_3() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -2;
        instance.setA(arg1);
        int arg2 = -2;
        instance.setB(arg2);
        int arg3 = 0;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_4() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -2;
        instance.setA(arg1);
        int arg2 = -2;
        instance.setB(arg2);
        int arg3 = 1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(1, actual);
    }

    @Test
    public void testTS_1_5() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -2;
        instance.setA(arg1);
        int arg2 = -2;
        instance.setB(arg2);
        int arg3 = 2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(2, actual);
    }

    @Test
    public void testTS_1_6() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -2;
        instance.setA(arg1);
        int arg2 = -1;
        instance.setB(arg2);
        int arg3 = -2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-2, actual);
    }

    @Test
    public void testTS_1_7() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -2;
        instance.setA(arg1);
        int arg2 = -1;
        instance.setB(arg2);
        int arg3 = -1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-1, actual);
    }

    @Test
    public void testTS_1_8() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -2;
        instance.setA(arg1);
        int arg2 = -1;
        instance.setB(arg2);
        int arg3 = 0;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-1, actual);
    }

    @Test
    public void testTS_1_9() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -2;
        instance.setA(arg1);
        int arg2 = -1;
        instance.setB(arg2);
        int arg3 = 1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-1, actual);
    }

    @Test
    public void testTS_1_10() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -2;
        instance.setA(arg1);
        int arg2 = -1;
        instance.setB(arg2);
        int arg3 = 2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-1, actual);
    }

    @Test
    public void testTS_1_11() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -2;
        instance.setA(arg1);
        int arg2 = 0;
        instance.setB(arg2);
        int arg3 = -2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-2, actual);
    }

    @Test
    public void testTS_1_12() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -2;
        instance.setA(arg1);
        int arg2 = 0;
        instance.setB(arg2);
        int arg3 = -1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-1, actual);
    }

    @Test
    public void testTS_1_13() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -2;
        instance.setA(arg1);
        int arg2 = 0;
        instance.setB(arg2);
        int arg3 = 0;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_14() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -2;
        instance.setA(arg1);
        int arg2 = 0;
        instance.setB(arg2);
        int arg3 = 1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_15() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -2;
        instance.setA(arg1);
        int arg2 = 0;
        instance.setB(arg2);
        int arg3 = 2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_16() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -2;
        instance.setA(arg1);
        int arg2 = 1;
        instance.setB(arg2);
        int arg3 = -2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-2, actual);
    }

    @Test
    public void testTS_1_17() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -2;
        instance.setA(arg1);
        int arg2 = 1;
        instance.setB(arg2);
        int arg3 = -1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-1, actual);
    }

    @Test
    public void testTS_1_18() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -2;
        instance.setA(arg1);
        int arg2 = 1;
        instance.setB(arg2);
        int arg3 = 0;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_19() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -2;
        instance.setA(arg1);
        int arg2 = 1;
        instance.setB(arg2);
        int arg3 = 1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(1, actual);
    }

    @Test
    public void testTS_1_20() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -2;
        instance.setA(arg1);
        int arg2 = 1;
        instance.setB(arg2);
        int arg3 = 2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(1, actual);
    }

    @Test
    public void testTS_1_21() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -2;
        instance.setA(arg1);
        int arg2 = 2;
        instance.setB(arg2);
        int arg3 = -2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-2, actual);
    }

    @Test
    public void testTS_1_22() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -2;
        instance.setA(arg1);
        int arg2 = 2;
        instance.setB(arg2);
        int arg3 = -1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-1, actual);
    }

    @Test
    public void testTS_1_23() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -2;
        instance.setA(arg1);
        int arg2 = 2;
        instance.setB(arg2);
        int arg3 = 0;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_24() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -2;
        instance.setA(arg1);
        int arg2 = 2;
        instance.setB(arg2);
        int arg3 = 1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(1, actual);
    }

    @Test
    public void testTS_1_25() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -2;
        instance.setA(arg1);
        int arg2 = 2;
        instance.setB(arg2);
        int arg3 = 2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(2, actual);
    }

    @Test
    public void testTS_1_26() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -1;
        instance.setA(arg1);
        int arg2 = -2;
        instance.setB(arg2);
        int arg3 = -2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-2, actual);
    }

    @Test
    public void testTS_1_27() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -1;
        instance.setA(arg1);
        int arg2 = -2;
        instance.setB(arg2);
        int arg3 = -1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-1, actual);
    }

    @Test
    public void testTS_1_28() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -1;
        instance.setA(arg1);
        int arg2 = -2;
        instance.setB(arg2);
        int arg3 = 0;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-1, actual);
    }

    @Test
    public void testTS_1_29() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -1;
        instance.setA(arg1);
        int arg2 = -2;
        instance.setB(arg2);
        int arg3 = 1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-1, actual);
    }

    @Test
    public void testTS_1_30() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -1;
        instance.setA(arg1);
        int arg2 = -2;
        instance.setB(arg2);
        int arg3 = 2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-1, actual);
    }

    @Test
    public void testTS_1_31() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -1;
        instance.setA(arg1);
        int arg2 = -1;
        instance.setB(arg2);
        int arg3 = -2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-2, actual);
    }

    @Test
    public void testTS_1_32() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -1;
        instance.setA(arg1);
        int arg2 = -1;
        instance.setB(arg2);
        int arg3 = -1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-1, actual);
    }

    @Test
    public void testTS_1_33() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -1;
        instance.setA(arg1);
        int arg2 = -1;
        instance.setB(arg2);
        int arg3 = 0;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_34() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -1;
        instance.setA(arg1);
        int arg2 = -1;
        instance.setB(arg2);
        int arg3 = 1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(1, actual);
    }

    @Test
    public void testTS_1_35() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -1;
        instance.setA(arg1);
        int arg2 = -1;
        instance.setB(arg2);
        int arg3 = 2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(2, actual);
    }

    @Test
    public void testTS_1_36() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -1;
        instance.setA(arg1);
        int arg2 = 0;
        instance.setB(arg2);
        int arg3 = -2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-1, actual);
    }

    @Test
    public void testTS_1_37() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -1;
        instance.setA(arg1);
        int arg2 = 0;
        instance.setB(arg2);
        int arg3 = -1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-1, actual);
    }

    @Test
    public void testTS_1_38() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -1;
        instance.setA(arg1);
        int arg2 = 0;
        instance.setB(arg2);
        int arg3 = 0;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_39() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -1;
        instance.setA(arg1);
        int arg2 = 0;
        instance.setB(arg2);
        int arg3 = 1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_40() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -1;
        instance.setA(arg1);
        int arg2 = 0;
        instance.setB(arg2);
        int arg3 = 2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_41() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -1;
        instance.setA(arg1);
        int arg2 = 1;
        instance.setB(arg2);
        int arg3 = -2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-1, actual);
    }

    @Test
    public void testTS_1_42() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -1;
        instance.setA(arg1);
        int arg2 = 1;
        instance.setB(arg2);
        int arg3 = -1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-1, actual);
    }

    @Test
    public void testTS_1_43() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -1;
        instance.setA(arg1);
        int arg2 = 1;
        instance.setB(arg2);
        int arg3 = 0;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_44() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -1;
        instance.setA(arg1);
        int arg2 = 1;
        instance.setB(arg2);
        int arg3 = 1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(1, actual);
    }

    @Test
    public void testTS_1_45() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -1;
        instance.setA(arg1);
        int arg2 = 1;
        instance.setB(arg2);
        int arg3 = 2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(1, actual);
    }

    @Test
    public void testTS_1_46() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -1;
        instance.setA(arg1);
        int arg2 = 2;
        instance.setB(arg2);
        int arg3 = -2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-1, actual);
    }

    @Test
    public void testTS_1_47() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -1;
        instance.setA(arg1);
        int arg2 = 2;
        instance.setB(arg2);
        int arg3 = -1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-1, actual);
    }

    @Test
    public void testTS_1_48() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -1;
        instance.setA(arg1);
        int arg2 = 2;
        instance.setB(arg2);
        int arg3 = 0;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_49() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -1;
        instance.setA(arg1);
        int arg2 = 2;
        instance.setB(arg2);
        int arg3 = 1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(1, actual);
    }

    @Test
    public void testTS_1_50() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = -1;
        instance.setA(arg1);
        int arg2 = 2;
        instance.setB(arg2);
        int arg3 = 2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(2, actual);
    }

    @Test
    public void testTS_1_51() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 0;
        instance.setA(arg1);
        int arg2 = -2;
        instance.setB(arg2);
        int arg3 = -2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-2, actual);
    }

    @Test
    public void testTS_1_52() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 0;
        instance.setA(arg1);
        int arg2 = -2;
        instance.setB(arg2);
        int arg3 = -1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-1, actual);
    }

    @Test
    public void testTS_1_53() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 0;
        instance.setA(arg1);
        int arg2 = -2;
        instance.setB(arg2);
        int arg3 = 0;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_54() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 0;
        instance.setA(arg1);
        int arg2 = -2;
        instance.setB(arg2);
        int arg3 = 1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_55() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 0;
        instance.setA(arg1);
        int arg2 = -2;
        instance.setB(arg2);
        int arg3 = 2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_56() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 0;
        instance.setA(arg1);
        int arg2 = -1;
        instance.setB(arg2);
        int arg3 = -2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-1, actual);
    }

    @Test
    public void testTS_1_57() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 0;
        instance.setA(arg1);
        int arg2 = -1;
        instance.setB(arg2);
        int arg3 = -1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-1, actual);
    }

    @Test
    public void testTS_1_58() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 0;
        instance.setA(arg1);
        int arg2 = -1;
        instance.setB(arg2);
        int arg3 = 0;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_59() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 0;
        instance.setA(arg1);
        int arg2 = -1;
        instance.setB(arg2);
        int arg3 = 1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_60() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 0;
        instance.setA(arg1);
        int arg2 = -1;
        instance.setB(arg2);
        int arg3 = 2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_61() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 0;
        instance.setA(arg1);
        int arg2 = 0;
        instance.setB(arg2);
        int arg3 = -2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-2, actual);
    }

    @Test
    public void testTS_1_62() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 0;
        instance.setA(arg1);
        int arg2 = 0;
        instance.setB(arg2);
        int arg3 = -1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-1, actual);
    }

    @Test
    public void testTS_1_63() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 0;
        instance.setA(arg1);
        int arg2 = 0;
        instance.setB(arg2);
        int arg3 = 0;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_64() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 0;
        instance.setA(arg1);
        int arg2 = 0;
        instance.setB(arg2);
        int arg3 = 1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(1, actual);
    }

    @Test
    public void testTS_1_65() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 0;
        instance.setA(arg1);
        int arg2 = 0;
        instance.setB(arg2);
        int arg3 = 2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(2, actual);
    }

    @Test
    public void testTS_1_66() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 0;
        instance.setA(arg1);
        int arg2 = 1;
        instance.setB(arg2);
        int arg3 = -2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_67() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 0;
        instance.setA(arg1);
        int arg2 = 1;
        instance.setB(arg2);
        int arg3 = -1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_68() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 0;
        instance.setA(arg1);
        int arg2 = 1;
        instance.setB(arg2);
        int arg3 = 0;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_69() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 0;
        instance.setA(arg1);
        int arg2 = 1;
        instance.setB(arg2);
        int arg3 = 1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(1, actual);
    }

    @Test
    public void testTS_1_70() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 0;
        instance.setA(arg1);
        int arg2 = 1;
        instance.setB(arg2);
        int arg3 = 2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(1, actual);
    }

    @Test
    public void testTS_1_71() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 0;
        instance.setA(arg1);
        int arg2 = 2;
        instance.setB(arg2);
        int arg3 = -2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_72() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 0;
        instance.setA(arg1);
        int arg2 = 2;
        instance.setB(arg2);
        int arg3 = -1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_73() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 0;
        instance.setA(arg1);
        int arg2 = 2;
        instance.setB(arg2);
        int arg3 = 0;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_74() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 0;
        instance.setA(arg1);
        int arg2 = 2;
        instance.setB(arg2);
        int arg3 = 1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(1, actual);
    }

    @Test
    public void testTS_1_75() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 0;
        instance.setA(arg1);
        int arg2 = 2;
        instance.setB(arg2);
        int arg3 = 2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(2, actual);
    }

    @Test
    public void testTS_1_76() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 1;
        instance.setA(arg1);
        int arg2 = -2;
        instance.setB(arg2);
        int arg3 = -2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-2, actual);
    }

    @Test
    public void testTS_1_77() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 1;
        instance.setA(arg1);
        int arg2 = -2;
        instance.setB(arg2);
        int arg3 = -1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-1, actual);
    }

    @Test
    public void testTS_1_78() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 1;
        instance.setA(arg1);
        int arg2 = -2;
        instance.setB(arg2);
        int arg3 = 0;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_79() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 1;
        instance.setA(arg1);
        int arg2 = -2;
        instance.setB(arg2);
        int arg3 = 1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(1, actual);
    }

    @Test
    public void testTS_1_80() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 1;
        instance.setA(arg1);
        int arg2 = -2;
        instance.setB(arg2);
        int arg3 = 2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(1, actual);
    }

    @Test
    public void testTS_1_81() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 1;
        instance.setA(arg1);
        int arg2 = -1;
        instance.setB(arg2);
        int arg3 = -2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-1, actual);
    }

    @Test
    public void testTS_1_82() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 1;
        instance.setA(arg1);
        int arg2 = -1;
        instance.setB(arg2);
        int arg3 = -1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-1, actual);
    }

    @Test
    public void testTS_1_83() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 1;
        instance.setA(arg1);
        int arg2 = -1;
        instance.setB(arg2);
        int arg3 = 0;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_84() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 1;
        instance.setA(arg1);
        int arg2 = -1;
        instance.setB(arg2);
        int arg3 = 1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(1, actual);
    }

    @Test
    public void testTS_1_85() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 1;
        instance.setA(arg1);
        int arg2 = -1;
        instance.setB(arg2);
        int arg3 = 2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(1, actual);
    }

    @Test
    public void testTS_1_86() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 1;
        instance.setA(arg1);
        int arg2 = 0;
        instance.setB(arg2);
        int arg3 = -2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_87() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 1;
        instance.setA(arg1);
        int arg2 = 0;
        instance.setB(arg2);
        int arg3 = -1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_88() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 1;
        instance.setA(arg1);
        int arg2 = 0;
        instance.setB(arg2);
        int arg3 = 0;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_89() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 1;
        instance.setA(arg1);
        int arg2 = 0;
        instance.setB(arg2);
        int arg3 = 1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(1, actual);
    }

    @Test
    public void testTS_1_90() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 1;
        instance.setA(arg1);
        int arg2 = 0;
        instance.setB(arg2);
        int arg3 = 2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(1, actual);
    }

    @Test
    public void testTS_1_91() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 1;
        instance.setA(arg1);
        int arg2 = 1;
        instance.setB(arg2);
        int arg3 = -2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-2, actual);
    }

    @Test
    public void testTS_1_92() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 1;
        instance.setA(arg1);
        int arg2 = 1;
        instance.setB(arg2);
        int arg3 = -1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-1, actual);
    }

    @Test
    public void testTS_1_93() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 1;
        instance.setA(arg1);
        int arg2 = 1;
        instance.setB(arg2);
        int arg3 = 0;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_94() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 1;
        instance.setA(arg1);
        int arg2 = 1;
        instance.setB(arg2);
        int arg3 = 1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(1, actual);
    }

    @Test
    public void testTS_1_95() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 1;
        instance.setA(arg1);
        int arg2 = 1;
        instance.setB(arg2);
        int arg3 = 2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(2, actual);
    }

    @Test
    public void testTS_1_96() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 1;
        instance.setA(arg1);
        int arg2 = 2;
        instance.setB(arg2);
        int arg3 = -2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(1, actual);
    }

    @Test
    public void testTS_1_97() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 1;
        instance.setA(arg1);
        int arg2 = 2;
        instance.setB(arg2);
        int arg3 = -1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(1, actual);
    }

    @Test
    public void testTS_1_98() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 1;
        instance.setA(arg1);
        int arg2 = 2;
        instance.setB(arg2);
        int arg3 = 0;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(1, actual);
    }

    @Test
    public void testTS_1_99() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 1;
        instance.setA(arg1);
        int arg2 = 2;
        instance.setB(arg2);
        int arg3 = 1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(1, actual);
    }

    @Test
    public void testTS_1_100() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 1;
        instance.setA(arg1);
        int arg2 = 2;
        instance.setB(arg2);
        int arg3 = 2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(2, actual);
    }

    @Test
    public void testTS_1_101() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 2;
        instance.setA(arg1);
        int arg2 = -2;
        instance.setB(arg2);
        int arg3 = -2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-2, actual);
    }

    @Test
    public void testTS_1_102() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 2;
        instance.setA(arg1);
        int arg2 = -2;
        instance.setB(arg2);
        int arg3 = -1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-1, actual);
    }

    @Test
    public void testTS_1_103() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 2;
        instance.setA(arg1);
        int arg2 = -2;
        instance.setB(arg2);
        int arg3 = 0;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_104() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 2;
        instance.setA(arg1);
        int arg2 = -2;
        instance.setB(arg2);
        int arg3 = 1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(1, actual);
    }

    @Test
    public void testTS_1_105() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 2;
        instance.setA(arg1);
        int arg2 = -2;
        instance.setB(arg2);
        int arg3 = 2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(2, actual);
    }

    @Test
    public void testTS_1_106() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 2;
        instance.setA(arg1);
        int arg2 = -1;
        instance.setB(arg2);
        int arg3 = -2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-1, actual);
    }

    @Test
    public void testTS_1_107() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 2;
        instance.setA(arg1);
        int arg2 = -1;
        instance.setB(arg2);
        int arg3 = -1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-1, actual);
    }

    @Test
    public void testTS_1_108() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 2;
        instance.setA(arg1);
        int arg2 = -1;
        instance.setB(arg2);
        int arg3 = 0;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_109() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 2;
        instance.setA(arg1);
        int arg2 = -1;
        instance.setB(arg2);
        int arg3 = 1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(1, actual);
    }

    @Test
    public void testTS_1_110() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 2;
        instance.setA(arg1);
        int arg2 = -1;
        instance.setB(arg2);
        int arg3 = 2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(2, actual);
    }

    @Test
    public void testTS_1_111() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 2;
        instance.setA(arg1);
        int arg2 = 0;
        instance.setB(arg2);
        int arg3 = -2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_112() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 2;
        instance.setA(arg1);
        int arg2 = 0;
        instance.setB(arg2);
        int arg3 = -1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_113() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 2;
        instance.setA(arg1);
        int arg2 = 0;
        instance.setB(arg2);
        int arg3 = 0;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_114() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 2;
        instance.setA(arg1);
        int arg2 = 0;
        instance.setB(arg2);
        int arg3 = 1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(1, actual);
    }

    @Test
    public void testTS_1_115() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 2;
        instance.setA(arg1);
        int arg2 = 0;
        instance.setB(arg2);
        int arg3 = 2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(2, actual);
    }

    @Test
    public void testTS_1_116() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 2;
        instance.setA(arg1);
        int arg2 = 1;
        instance.setB(arg2);
        int arg3 = -2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(1, actual);
    }

    @Test
    public void testTS_1_117() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 2;
        instance.setA(arg1);
        int arg2 = 1;
        instance.setB(arg2);
        int arg3 = -1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(1, actual);
    }

    @Test
    public void testTS_1_118() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 2;
        instance.setA(arg1);
        int arg2 = 1;
        instance.setB(arg2);
        int arg3 = 0;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(1, actual);
    }

    @Test
    public void testTS_1_119() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 2;
        instance.setA(arg1);
        int arg2 = 1;
        instance.setB(arg2);
        int arg3 = 1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(1, actual);
    }

    @Test
    public void testTS_1_120() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 2;
        instance.setA(arg1);
        int arg2 = 1;
        instance.setB(arg2);
        int arg3 = 2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(2, actual);
    }

    @Test
    public void testTS_1_121() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 2;
        instance.setA(arg1);
        int arg2 = 2;
        instance.setB(arg2);
        int arg3 = -2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-2, actual);
    }

    @Test
    public void testTS_1_122() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 2;
        instance.setA(arg1);
        int arg2 = 2;
        instance.setB(arg2);
        int arg3 = -1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(-1, actual);
    }

    @Test
    public void testTS_1_123() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 2;
        instance.setA(arg1);
        int arg2 = 2;
        instance.setB(arg2);
        int arg3 = 0;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(0, actual);
    }

    @Test
    public void testTS_1_124() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 2;
        instance.setA(arg1);
        int arg2 = 2;
        instance.setB(arg2);
        int arg3 = 1;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(1, actual);
    }

    @Test
    public void testTS_1_125() {
        Mid instance = null;
        instance = new Mid();
        int arg1 = 2;
        instance.setA(arg1);
        int arg2 = 2;
        instance.setB(arg2);
        int arg3 = 2;
        instance.setC(arg3);
        int actual = instance.getMid();
        assertEquals(2, actual);
    }

    @Test
    public void testTS_1_126() {
        Mid instance = new Mid();
        instance.setA(2);
        assertTrue(instance.mA == 2);
    }

    @Test
    public void testTS_1_127() {
        Mid instance = new Mid();
        instance.setB(2);
        assertTrue(instance.mB == 2);
    }

    @Test
    public void testTS_1_128() {
        Mid instance = new Mid();
        instance.setC(2);
        assertTrue(instance.mC == 2);
    }

    @Test
    public void testTS_1_129() {
        Mid instance = new Mid();
        instance.setA(1);
        instance.setB(2);
        instance.setC(3);
        int actual = instance.getMid();
        assertEquals(2, instance.mMiddle);
    }

    @Test
    public void testTS_1_130() {
        Mid instance = new Mid();
        assertEquals(1, instance.menor(1, 2));
    }

    @Test
    public void testTS_1_131() {
        Mid instance = new Mid();
        assertEquals(1, instance.menor(1, 2, 3));
    }

    @Test
    public void testTS_1_132() {
        Mid instance = new Mid();
        assertEquals(2, instance.mayor(1, 2));
    }

    @Test
    public void testTS_1_133() {
        Mid instance = new Mid();
        assertEquals(3, instance.mayor(1, 2, 3));
    }

    @Test
    public void testTS_1_134() {
        Mid instance = new Mid();
        instance.setA(1);
        instance.setB(2);
        instance.setC(3);
        int actual = instance.getMid();
        assertEquals(instance.mB, instance.mMiddle);
    }

    @Test
    public void testTS_1_135() {
        Mid instance = new Mid();
        instance.setA(2);
        instance.setB(1);
        instance.setC(3);
        int actual = instance.getMid();
        assertEquals(instance.mA, instance.mMiddle);
    }

    @Test
    public void testTS_1_136() {
        Mid instance = new Mid();
        instance.setA(3);
        instance.setB(1);
        instance.setC(2);
        int actual = instance.getMid();
        assertEquals(instance.mC, instance.mMiddle);
    }      
}
