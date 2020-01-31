package br.ufpr.inf.gres;

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
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jackson Antonio do Prado Lima <jacksonpradolima at gmail.com>
 */
public class TryTipTest {

    @Test(expected = IllegalArgumentException.class)
    public void test_1() {
        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_2() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_3() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_4() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_5() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_6() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_7() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_8() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_9() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_10() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_11() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_12() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_13() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_14() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_15() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_16() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_17() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_18() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_19() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_20() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_21() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_22() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_23() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_24() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_25() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_26() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_27() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_28() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_29() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_30() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_31() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_32() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_33() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_34() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_35() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_36() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = -1;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_37() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_38() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_39() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_40() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_41() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_42() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_43() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_44() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_45() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_46() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_47() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_48() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_49() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_50() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_51() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_52() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_53() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_54() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_55() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_56() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_57() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_58() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_59() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_60() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_61() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_62() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_63() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_64() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_65() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_66() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_67() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_68() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_69() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_70() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_71() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_72() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 0;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_73() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_74() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_75() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_76() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_77() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_78() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_79() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_80() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_81() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_82() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_83() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_84() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_85() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_86() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_87() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.EQUILATERO, actual);

    }

    @Test
    public void test_88() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_89() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_90() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_91() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_92() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_93() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_94() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.ISOSCELES, actual);

    }

    @Test
    public void test_95() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_96() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_97() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_98() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_99() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_100() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_101() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.ISOSCELES, actual);

    }

    @Test
    public void test_102() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_103() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_104() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_105() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_106() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_107() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_108() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 1;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.ISOSCELES, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_109() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_110() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_111() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_112() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_113() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_114() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_115() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_116() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_117() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_118() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_119() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_120() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_121() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_122() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_123() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_124() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.ISOSCELES, actual);

    }

    @Test
    public void test_125() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_126() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_127() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_128() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_129() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.ISOSCELES, actual);

    }

    @Test
    public void test_130() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.EQUILATERO, actual);

    }

    @Test
    public void test_131() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.ISOSCELES, actual);

    }

    @Test
    public void test_132() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_133() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_134() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_135() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_136() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.ISOSCELES, actual);

    }

    @Test
    public void test_137() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.ISOSCELES, actual);

    }

    @Test
    public void test_138() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.ESCALENO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_139() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_140() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_141() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_142() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_143() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.ESCALENO, actual);

    }

    @Test
    public void test_144() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 2;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.ISOSCELES, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_145() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_146() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_147() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_148() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_149() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_150() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_151() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_152() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_153() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_154() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_155() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_156() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_157() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_158() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_159() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_160() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_161() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.ISOSCELES, actual);

    }

    @Test
    public void test_162() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_163() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_164() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_165() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_166() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.ISOSCELES, actual);

    }

    @Test
    public void test_167() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.ISOSCELES, actual);

    }

    @Test
    public void test_168() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.ESCALENO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_169() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_170() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_171() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.ISOSCELES, actual);

    }

    @Test
    public void test_172() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.ISOSCELES, actual);

    }

    @Test
    public void test_173() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.EQUILATERO, actual);

    }

    @Test
    public void test_174() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.ISOSCELES, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_175() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_176() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_177() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_178() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.ESCALENO, actual);

    }

    @Test
    public void test_179() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.ISOSCELES, actual);

    }

    @Test
    public void test_180() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 3;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.ISOSCELES, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_181() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_182() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_183() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_184() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_185() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_186() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = -1;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_187() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_188() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_189() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_190() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_191() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_192() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = 0;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_193() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_194() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_195() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_196() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_197() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_198() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = 1;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.ISOSCELES, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_199() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_200() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_201() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_202() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_203() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.ESCALENO, actual);

    }

    @Test
    public void test_204() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = 2;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.ISOSCELES, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_205() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_206() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_207() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_208() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.ESCALENO, actual);

    }

    @Test
    public void test_209() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.ISOSCELES, actual);

    }

    @Test
    public void test_210() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = 3;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.ISOSCELES, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_211() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = -1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test(expected = IllegalArgumentException.class)
    public void test_212() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = 0;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);

    }

    @Test
    public void test_213() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = 1;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.ISOSCELES, actual);

    }

    @Test
    public void test_214() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = 2;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.ISOSCELES, actual);

    }

    @Test
    public void test_215() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = 3;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.ISOSCELES, actual);

    }

    @Test
    public void test_216() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 4;
        instance.setI(arg1);
        int arg2 = 4;
        instance.setJ(arg2);
        int arg3 = 4;
        instance.setK(arg3);
        int actual = instance.getTipo();
        assertEquals(TryTip.EQUILATERO, actual);
    }

    @Test
    public void test_217() {

        TryTip instance = new TryTip();
        instance.setI(4);
        assertEquals(instance.i, 4);
    }

    @Test
    public void test_218() {

        TryTip instance = new TryTip();
        instance.setJ(4);
        assertEquals(instance.j, 4);
    }

    @Test
    public void test_219() {

        TryTip instance = new TryTip();
        instance.setK(4);
        assertEquals(instance.k, 4);
    }

    @Test
    public void test_220() {

        TryTip instance = new TryTip();
        assertEquals(instance.tipo, TryTip.NO_TRIANGULO);
    }

    @Test
    public void test_221() {

        TryTip instance = new TryTip();
        instance.i = -1;
        instance.j = -1;
        instance.k = -1;
        assertEquals(instance.getTipo(), TryTip.NO_TRIANGULO);
    }

    @Test
    public void test_222() {
        TryTip instance = new TryTip();
        assertEquals(instance.NO_TRIANGULO, 0);
    }

    @Test
    public void test_223() {
        TryTip instance = new TryTip();
        assertEquals(instance.ESCALENO, 1);
    }

    @Test
    public void test_224() {
        TryTip instance = new TryTip();
        assertEquals(instance.ISOSCELES, 2);
    }

    @Test
    public void test_225() {
        TryTip instance = new TryTip();
        assertEquals(instance.EQUILATERO, 3);
    }

    @Test
    public void test_226() {
        TryTip instance = new TryTip();
        instance.setI(1);
        instance.setJ(99);
        instance.setK(3);
        assertEquals(instance.getTipo(), TryTip.NO_TRIANGULO);
    }

    @Test
    public void test_227() {
        TryTip instance = new TryTip();
        instance.setI(1);
        instance.setJ(99);
        instance.setK(1);
        assertEquals(instance.getTipo(), TryTip.NO_TRIANGULO);
    }

    @Test
    public void test_228() {
        TryTip instance = new TryTip();
        instance.setI(1);
        instance.setJ(99);
        instance.setK(1);
        int type = instance.getTipo();

        assertEquals(instance.i, 1);
    }

    @Test
    public void test_229() {
        TryTip instance = new TryTip();
        instance.setI(1);
        instance.setJ(99);
        instance.setK(1);
        int type = instance.getTipo();

        assertEquals(instance.j, 99);
    }

    @Test
    public void test_230() {
        TryTip instance = new TryTip();
        instance.setI(1);
        instance.setJ(99);
        instance.setK(1);
        int type = instance.getTipo();

        assertEquals(instance.k, 1);
    }

    @Test
    public void test_231() {
        TryTip instance = new TryTip();
        instance.setI(1);
        instance.setJ(3);
        instance.setK(3);
        int actual = instance.getTipo();
        assertEquals(instance.j, 3);

    }

    @Test
    public void test_232() {
        TryTip instance = new TryTip();
        instance.setI(1);
        instance.setJ(3);
        instance.setK(3);
        int actual = instance.getTipo();
        assertEquals(instance.k, 3);
    }

    @Test
    public void test_233() {
        TryTip instance = new TryTip();
        instance.setI(1);
        instance.setJ(3);
        instance.setK(3);
        int actual = instance.getTipo();
        assertEquals(instance.i, 1);
    }

    @Test
    public void test_234() {
        TryTip instance = new TryTip();
        instance.i = -1;
        instance.j = -1;
        instance.k = -1;
        int actual = instance.getTipo();
        assertEquals(instance.i, -1);
    }

    @Test
    public void test_235() {
        TryTip instance = new TryTip();
        instance.i = -1;
        instance.j = -1;
        instance.k = -1;
        int actual = instance.getTipo();
        assertEquals(instance.j, -1);
    }

    @Test
    public void test_236() {
        TryTip instance = new TryTip();
        instance.i = -1;
        instance.j = -1;
        instance.k = -1;
        int actual = instance.getTipo();
        assertEquals(instance.k, -1);
    }

    @Test
    public void test_237() {
        TryTip instance = new TryTip();
        instance.setI(1);
        instance.setJ(3);
        instance.setK(3);
        int actual = instance.getTipo();
        assertEquals(TryTip.ISOSCELES, instance.tipo);
    }

    @Test
    public void test_238() {
        TryTip instance = new TryTip();
        instance.setI(1);
        instance.setJ(4);
        instance.setK(1);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, instance.tipo);
    }

    @Test
    public void test_239() {
        TryTip instance = new TryTip();
        instance.setI(2);
        instance.setJ(2);
        instance.setK(1);
        int actual = instance.getTipo();
        assertEquals(TryTip.ISOSCELES, instance.tipo);
    }

    @Test
    public void test_240() {
        TryTip instance = new TryTip();
        instance.setI(2);
        instance.setJ(1);
        instance.setK(2);
        int actual = instance.getTipo();
        assertEquals(TryTip.ISOSCELES, instance.tipo);
    }

    @Test
    public void test_241() {
        TryTip instance = new TryTip();
        instance.setI(1);
        instance.setJ(1);
        instance.setK(1);
        int actual = instance.getTipo();
        assertEquals(TryTip.EQUILATERO, instance.tipo);
    }

    @Test
    public void test_242() {
        TryTip instance = new TryTip();
        instance.setI(2);
        instance.setJ(3);
        instance.setK(4);
        int actual = instance.getTipo();
        assertEquals(TryTip.ESCALENO, instance.tipo);
    }

    @Test
    public void test_243() {
        TryTip instance = new TryTip();
        instance.setI(1);
        instance.setJ(2);
        instance.setK(3);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, instance.tipo);

    }

    @Test
    public void test_244() {

        TryTip instance = new TryTip();
        instance.i = -1;
        instance.j = -1;
        instance.k = -1;
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, instance.tipo);
    }

    @Test
    public void test_245() {

        TryTip instance = new TryTip();
        instance.i = 2;
        instance.j = 2;
        instance.k = 2;
        instance.tipo = 3;
        int actual = instance.getTipo();
        assertEquals(TryTip.EQUILATERO, instance.tipo);
    }

    @Test
    public void test_246() {

        TryTip instance = null;
        instance = new TryTip();
        instance.setI(3);
        instance.setJ(6);
        instance.setK(17);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);
    }

    @Test
    public void test_247() {

        TryTip instance = null;
        instance = new TryTip();
        int arg1 = 100;
        instance.setI(100);
        instance.setJ(6);
        instance.setK(17);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);
    }

    @Test
    public void test_248() {

        TryTip instance = null;
        instance = new TryTip();
        instance.setI(3);
        instance.setJ(100);
        instance.setK(40);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);
    }

    @Test
    public void test_249() {

        TryTip instance = null;
        instance = new TryTip();
        instance.setI(4);
        instance.setJ(4);
        instance.setK(9);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);
    }

    @Test
    public void test_250() {

        TryTip instance = null;
        instance = new TryTip();
        instance.setI(4);
        instance.setJ(9);
        instance.setK(4);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);
    }

    @Test
    public void test_251() {

        TryTip instance = null;
        instance = new TryTip();
        instance.setI(9);
        instance.setJ(4);
        instance.setK(4);
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, actual);
    }

    @Test
    public void test_252() {

        TryTip instance = new TryTip();
        instance.i = -1;
        instance.j = 2;
        instance.k = 2;
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, instance.tipo);
    }

    @Test
    public void test_253() {

        TryTip instance = new TryTip();
        instance.i = 2;
        instance.j = -1;
        instance.k = 2;
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, instance.tipo);
    }

    @Test
    public void test_254() {

        TryTip instance = new TryTip();
        instance.i = 2;
        instance.j = 2;
        instance.k = -1;
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, instance.tipo);
    }

    @Test
    public void test_255() {

        TryTip instance = new TryTip();
        instance.i = 0;
        instance.j = 1;
        instance.k = 1;
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, instance.tipo);
    }

    @Test
    public void test_256() {

        TryTip instance = new TryTip();
        instance.i = 1;
        instance.j = 0;
        instance.k = 1;
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, instance.tipo);
    }

    @Test
    public void test_257() {

        TryTip instance = new TryTip();
        instance.i = 1;
        instance.j = 1;
        instance.k = 0;
        int actual = instance.getTipo();
        assertEquals(TryTip.NO_TRIANGULO, instance.tipo);
    }

    @Test
    public void test_258() {

        TryTip instance = new TryTip();
        instance.setI(TryTip.EQUILATERO);
        instance.setJ(TryTip.ESCALENO);
        instance.setK(TryTip.ISOSCELES);
        assertEquals(TryTip.NO_TRIANGULO, instance.getTipo());
    }

    @Test
    public void test_259() {

        TryTip instance = new TryTip();
        instance.setI(instance.EQUILATERO);
        instance.setJ(instance.ESCALENO);
        instance.setK(instance.ISOSCELES);
        assertEquals(instance.NO_TRIANGULO, instance.getTipo());
    }
}
