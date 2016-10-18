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
public class CalTest {
    
    @Test
    public void test1() {                
        assertEquals(62, Cal.cal(1, 2, 3, 4, 2012));        
    }

    @Test
    public void test2() {
        assertEquals(27, Cal.cal(2, 2, 2, 29, 2012));
    }

    @Test
    public void test3() {
        assertEquals(111, Cal.cal(2, 2, 5, 24, 2011));

    }

    @Test
    public void test4() {
        assertEquals(112, Cal.cal(2, 2, 5, 24, 0));

    }

    @Test
    public void test5() {
        assertEquals(111, Cal.cal(2, 2, 5, 24, 500));

    }

    @Test
    public void test6() {
        assertEquals(111, Cal.cal(2, 2, 5, 24, -500));

    }

    @Test
    public void test7() {
        assertEquals(112, Cal.cal(2, 2, 5, 24, -2012));

    }

    @Test
    public void test8() {
        assertEquals(53, Cal.cal(5, 2, 2, 24, -2012));

    }

    @Test
    public void test9() {
        assertEquals(111, Cal.cal(2, 2, 5, 24, -1));

    }

    @Test
    public void test10() {
        assertEquals(34, Cal.cal(2, 10, 3, 15, 2000));
    }
}
