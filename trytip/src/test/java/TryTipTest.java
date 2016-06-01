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
    public void testTS_1_1() {
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
    public void testTS_1_2() {

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
    public void testTS_1_3() {

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
    public void testTS_1_4() {

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
    public void testTS_1_5() {

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
    public void testTS_1_6() {

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
    public void testTS_1_7() {

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
    public void testTS_1_8() {

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
    public void testTS_1_9() {

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
    public void testTS_1_10() {

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
    public void testTS_1_11() {

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
    public void testTS_1_12() {

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
    public void testTS_1_13() {

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
    public void testTS_1_14() {

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
    public void testTS_1_15() {

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
    public void testTS_1_16() {

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
    public void testTS_1_17() {

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
    public void testTS_1_18() {

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
    public void testTS_1_19() {

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
    public void testTS_1_20() {

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
    public void testTS_1_21() {

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
    public void testTS_1_22() {

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
    public void testTS_1_23() {

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
    public void testTS_1_24() {

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
    public void testTS_1_25() {

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
    public void testTS_1_26() {

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
    public void testTS_1_27() {

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
    public void testTS_1_28() {

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
    public void testTS_1_29() {

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
    public void testTS_1_30() {

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
    public void testTS_1_31() {

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
    public void testTS_1_32() {

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
    public void testTS_1_33() {

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
    public void testTS_1_34() {

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
    public void testTS_1_35() {

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
    public void testTS_1_36() {

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
    public void testTS_1_37() {

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
    public void testTS_1_38() {

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
    public void testTS_1_39() {

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
    public void testTS_1_40() {

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
    public void testTS_1_41() {

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
    public void testTS_1_42() {

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
    public void testTS_1_43() {

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
    public void testTS_1_44() {

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
    public void testTS_1_45() {

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
    public void testTS_1_46() {

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
    public void testTS_1_47() {

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
    public void testTS_1_48() {

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
    public void testTS_1_49() {

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
    public void testTS_1_50() {

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
    public void testTS_1_51() {

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
    public void testTS_1_52() {

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
    public void testTS_1_53() {

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
    public void testTS_1_54() {

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
    public void testTS_1_55() {

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
    public void testTS_1_56() {

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
    public void testTS_1_57() {

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
    public void testTS_1_58() {

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
    public void testTS_1_59() {

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
    public void testTS_1_60() {

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
    public void testTS_1_61() {

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
    public void testTS_1_62() {

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
    public void testTS_1_63() {

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
    public void testTS_1_64() {

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
    public void testTS_1_65() {

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
    public void testTS_1_66() {

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
    public void testTS_1_67() {

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
    public void testTS_1_68() {

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
    public void testTS_1_69() {

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
    public void testTS_1_70() {

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
    public void testTS_1_71() {

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
    public void testTS_1_72() {

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
    public void testTS_1_73() {

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
    public void testTS_1_74() {

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
    public void testTS_1_75() {

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
    public void testTS_1_76() {

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
    public void testTS_1_77() {

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
    public void testTS_1_78() {

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
    public void testTS_1_79() {

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
    public void testTS_1_80() {

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
    public void testTS_1_81() {

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
    public void testTS_1_82() {

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
    public void testTS_1_83() {

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
    public void testTS_1_84() {

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
    public void testTS_1_85() {

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
    public void testTS_1_86() {

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
    public void testTS_1_87() {

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
    public void testTS_1_88() {

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
    public void testTS_1_89() {

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
    public void testTS_1_90() {

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
    public void testTS_1_91() {

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
    public void testTS_1_92() {

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
    public void testTS_1_93() {

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
    public void testTS_1_94() {

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
    public void testTS_1_95() {

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
    public void testTS_1_96() {

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
    public void testTS_1_97() {

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
    public void testTS_1_98() {

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
    public void testTS_1_99() {

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
    public void testTS_1_100() {

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
    public void testTS_1_101() {

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
    public void testTS_1_102() {

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
    public void testTS_1_103() {

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
    public void testTS_1_104() {

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
    public void testTS_1_105() {

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
    public void testTS_1_106() {

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
    public void testTS_1_107() {

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
    public void testTS_1_108() {

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
    public void testTS_1_109() {

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
    public void testTS_1_110() {

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
    public void testTS_1_111() {

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
    public void testTS_1_112() {

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
    public void testTS_1_113() {

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
    public void testTS_1_114() {

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
    public void testTS_1_115() {

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
    public void testTS_1_116() {

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
    public void testTS_1_117() {

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
    public void testTS_1_118() {

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
    public void testTS_1_119() {

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
    public void testTS_1_120() {

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
    public void testTS_1_121() {

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
    public void testTS_1_122() {

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
    public void testTS_1_123() {

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
    public void testTS_1_124() {

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
    public void testTS_1_125() {

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
    public void testTS_1_126() {

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
    public void testTS_1_127() {

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
    public void testTS_1_128() {

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
    public void testTS_1_129() {

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
    public void testTS_1_130() {

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
    public void testTS_1_131() {

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
    public void testTS_1_132() {

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
    public void testTS_1_133() {

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
    public void testTS_1_134() {

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
    public void testTS_1_135() {

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
    public void testTS_1_136() {

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
    public void testTS_1_137() {

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
    public void testTS_1_138() {

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
    public void testTS_1_139() {

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
    public void testTS_1_140() {

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
    public void testTS_1_141() {

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
    public void testTS_1_142() {

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
    public void testTS_1_143() {

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
    public void testTS_1_144() {

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
    public void testTS_1_145() {

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
    public void testTS_1_146() {

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
    public void testTS_1_147() {

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
    public void testTS_1_148() {

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
    public void testTS_1_149() {

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
    public void testTS_1_150() {

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
    public void testTS_1_151() {

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
    public void testTS_1_152() {

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
    public void testTS_1_153() {

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
    public void testTS_1_154() {

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
    public void testTS_1_155() {

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
    public void testTS_1_156() {

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
    public void testTS_1_157() {

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
    public void testTS_1_158() {

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
    public void testTS_1_159() {

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
    public void testTS_1_160() {

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
    public void testTS_1_161() {

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
    public void testTS_1_162() {

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
    public void testTS_1_163() {

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
    public void testTS_1_164() {

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
    public void testTS_1_165() {

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
    public void testTS_1_166() {

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
    public void testTS_1_167() {

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
    public void testTS_1_168() {

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
    public void testTS_1_169() {

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
    public void testTS_1_170() {

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
    public void testTS_1_171() {

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
    public void testTS_1_172() {

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
    public void testTS_1_173() {

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
    public void testTS_1_174() {

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
    public void testTS_1_175() {

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
    public void testTS_1_176() {

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
    public void testTS_1_177() {

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
    public void testTS_1_178() {

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
    public void testTS_1_179() {

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
    public void testTS_1_180() {

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
    public void testTS_1_181() {

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
    public void testTS_1_182() {

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
    public void testTS_1_183() {

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
    public void testTS_1_184() {

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
    public void testTS_1_185() {

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
    public void testTS_1_186() {

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
    public void testTS_1_187() {

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
    public void testTS_1_188() {

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
    public void testTS_1_189() {

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
    public void testTS_1_190() {

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
    public void testTS_1_191() {

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
    public void testTS_1_192() {

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
    public void testTS_1_193() {

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
    public void testTS_1_194() {

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
    public void testTS_1_195() {

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
    public void testTS_1_196() {

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
    public void testTS_1_197() {

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
    public void testTS_1_198() {

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
    public void testTS_1_199() {

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
    public void testTS_1_200() {

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
    public void testTS_1_201() {

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
    public void testTS_1_202() {

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
    public void testTS_1_203() {

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
    public void testTS_1_204() {

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
    public void testTS_1_205() {

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
    public void testTS_1_206() {

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
    public void testTS_1_207() {

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
    public void testTS_1_208() {

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
    public void testTS_1_209() {

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
    public void testTS_1_210() {

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
    public void testTS_1_211() {

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
    public void testTS_1_212() {

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
    public void testTS_1_213() {

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
    public void testTS_1_214() {

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
    public void testTS_1_215() {

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
    public void testTS_1_216() {

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

}
