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
public class jtcasTest {

    @Test
    public void test1() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0), 0);
    }

    @Test
    public void test2() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(958, 1, 1, 2597, 574, 4253, 0, 399, 400, 0, 0, 1), 0);
    }

    @Test
    public void test3() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(627, 0, 0, 621, 216, 382, 1, 400, 641, 1, 1, 0), 0);
    }

    @Test
    public void test4() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(549, 1, 1, 4398, 133, 1445, 1, 641, 639, 0, 0, 1), 0);
    }

    @Test
    public void test5() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(576, 0, 1, 3469, 183, 381, 2, 641, 501, 1, 0, 1), 0);
    }

    @Test
    public void test6() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(992, 1, 0, 3342, 23, 4657, 1, 640, 741, 0, 0, 0), 1);
    }

    @Test
    public void test7() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(548, 0, 1, 34, 542, 3514, 2, 499, 401, 1, 1, 1), 0);
    }

    @Test
    public void test8() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(710, 0, 0, 127, 403, 4616, 3, 500, 400, 0, 0, 0), 0);
    }

    @Test
    public void test9() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(638, 0, 1, 698, 499, 2465, 3, 500, 501, 0, 0, 0), 0);
    }

    @Test
    public void test10() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(893, 1, 0, 205, 283, 5056, 3, 400, 641, 1, 1, 1), 0);
    }

    @Test
    public void test11() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(976, 1, 1, 5378, 390, 1000, 2, 641, 741, 1, 0, 0), 2);
    }

    @Test
    public void test12() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(763, 0, 0, 136, 576, 2305, 0, 401, 741, 0, 0, 0), 0);
    }

    @Test
    public void test13() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(570, 0, 1, 1945, 376, 2064, 0, 739, 740, 1, 1, 1), 0);
    }

    @Test
    public void test14() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(967, 1, 0, 659, 204, 3825, 3, 500, 399, 0, 0, 0), 1);
    }

    @Test
    public void test15() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(892, 0, 1, 2009, 40, 1011, 1, 641, 740, 1, 1, 0), 0);
    }

    @Test
    public void test16() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(911, 1, 1, 4194, 242, 4667, 1, 401, 399, 1, 1, 1), 0);
    }

    @Test
    public void test17() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(929, 0, 1, 1072, 134, 1036, 1, 741, 639, 1, 1, 0), 0);
    }

    @Test
    public void test18() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(588, 1, 0, 4341, 336, 2774, 2, 740, 400, 1, 0, 1), 0);
    }

    @Test
    public void test19() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(963, 0, 0, 5985, 377, 994, 3, 400, 499, 0, 1, 1), 0);
    }

    @Test
    public void test20() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(699, 1, 1, 619, 432, 912, 2, 740, 639, 0, 1, 0), 1);
    }

    @Test
    public void test21() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(818, 0, 1, 1876, 318, 793, 1, 499, 501, 1, 0, 0), 0);
    }

    @Test
    public void test22() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(926, 1, 0, 1694, 263, 651, 2, 501, 499, 1, 0, 0), 0);
    }

    @Test
    public void test23() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(579, 0, 1, 882, 101, 5381, 0, 639, 499, 0, 1, 0), 0);
    }

    @Test
    public void test24() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(878, 0, 0, 1063, 86, 4714, 1, 499, 400, 0, 0, 0), 0);
    }

    @Test
    public void test25() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(822, 0, 1, 1469, 234, 4419, 1, 399, 399, 1, 1, 1), 0);
    }

    @Test
    public void test26() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(653, 1, 0, 432, 67, 203, 0, 401, 401, 1, 0, 0), 2);
    }

    @Test
    public void test27() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(601, 1, 1, 777, 424, 309, 1, 641, 401, 0, 1, 1), 0);
    }

    @Test
    public void test28() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(764, 0, 1, 2969, 491, 2466, 0, 639, 501, 0, 1, 1), 0);
    }

    @Test
    public void test29() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(594, 1, 1, 2484, 121, 1193, 2, 500, 740, 0, 0, 1), 0);
    }

    @Test
    public void test30() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(992, 1, 0, 1793, 517, 254, 0, 739, 500, 1, 1, 1), 0);
    }

    @Test
    public void test31() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(832, 1, 1, 4454, 148, 4683, 3, 501, 640, 0, 1, 1), 0);
    }

    @Test
    public void test32() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(882, 0, 1, 674, 444, 191, 3, 741, 740, 1, 0, 0), 0);
    }

    @Test
    public void test33() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(753, 1, 0, 3203, 448, 1667, 0, 501, 641, 0, 0, 0), 2);
    }

    @Test
    public void test34() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(953, 1, 1, 682, 24, 2477, 2, 739, 399, 1, 1, 0), 0);
    }

    @Test
    public void test35() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(588, 1, 0, 3362, 93, 1315, 3, 741, 639, 1, 0, 1), 0);
    }

    @Test
    public void test36() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(965, 0, 0, 2078, 76, 303, 1, 401, 640, 0, 1, 1), 0);
    }

    @Test
    public void test37() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(612, 0, 0, 5073, 510, 1151, 1, 501, 500, 1, 0, 0), 0);
    }

    @Test
    public void test38() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(783, 1, 0, 4006, 586, 1219, 0, 501, 740, 0, 1, 1), 0);
    }

    @Test
    public void test39() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(903, 0, 1, 4075, 608, 5049, 1, 399, 741, 0, 1, 1), 0);
    }

    @Test
    public void test40() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(888, 0, 0, 2521, 241, 647, 1, 741, 639, 1, 0, 0), 0);
    }

    @Test
    public void test41() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(971, 0, 1, 183, 524, 747, 2, 400, 401, 1, 1, 1), 0);
    }

    @Test
    public void test42() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(668, 0, 0, 4507, 418, 4267, 2, 740, 640, 0, 1, 1), 0);
    }

    @Test
    public void test43() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(731, 0, 0, 2686, 128, 674, 2, 499, 740, 0, 0, 0), 0);
    }

    @Test
    public void test44() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(935, 0, 0, 121, 179, 2414, 0, 501, 639, 1, 0, 1), 0);
    }

    @Test
    public void test45() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(952, 1, 1, 802, 26, 3803, 1, 400, 740, 1, 1, 0), 0);
    }

    @Test
    public void test46() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(673, 1, 0, 2913, 18, 2294, 3, 400, 641, 0, 1, 0), 0);
    }

    @Test
    public void test47() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(832, 0, 1, 934, 9, 1145, 2, 399, 401, 0, 1, 1), 0);
    }

    @Test
    public void test48() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(547, 1, 1, 1723, 236, 2963, 0, 739, 501, 1, 1, 1), 0);
    }

    @Test
    public void test49() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(799, 0, 1, 5588, 485, 211, 0, 399, 499, 0, 0, 1), 0);
    }

    @Test
    public void test50() {
        jtcas newtcas = new jtcas();
    }

    @Test
    public void test51() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(987, 0, 0, 813, 318, 888, 3, 641, 400, 1, 0, 0), 0);
    }

    @Test
    public void test52() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(821, 0, 1, 138, 79, 356, 2, 399, 640, 0, 1, 1), 0);
    }

    @Test
    public void test53() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(528, 1, 0, 5170, 22, 500, 1, 740, 639, 1, 1, 1), 0);
    }

    @Test
    public void test54() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(896, 1, 1, 5784, 557, 585, 2, 739, 641, 1, 0, 0), 0);
    }

    @Test
    public void test55() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(546, 0, 1, 1900, 507, 4846, 1, 501, 641, 0, 1, 1), 0);
    }

    @Test
    public void test56() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(822, 0, 0, 447, 353, 1740, 2, 399, 639, 0, 0, 1), 0);
    }

    @Test
    public void test57() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(796, 0, 1, 108, 59, 134, 3, 640, 740, 1, 1, 0), 0);
    }

    @Test
    public void test58() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(775, 1, 1, 2961, 373, 5279, 3, 640, 499, 0, 1, 0), 1);
    }

    @Test
    public void test59() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(763, 1, 1, 2635, 387, 4709, 3, 641, 741, 0, 0, 1), 0);
    }

    @Test
    public void test60() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(568, 1, 1, 3423, 52, 3011, 3, 499, 640, 0, 1, 1), 0);
    }

    @Test
    public void test61() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(972, 0, 1, 4644, 495, 4090, 1, 640, 500, 0, 0, 1), 0);
    }

    @Test
    public void test62() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(562, 0, 0, 1642, 19, 895, 2, 400, 739, 0, 0, 1), 0);
    }

    @Test
    public void test63() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(804, 0, 1, 3945, 71, 376, 2, 501, 739, 0, 0, 0), 0);
    }

    @Test
    public void test64() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(610, 0, 1, 282, 158, 14, 3, 500, 499, 1, 1, 0), 0);
    }

    @Test
    public void test65() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(743, 1, 0, 773, 436, 860, 2, 501, 740, 1, 0, 1), 0);
    }

    @Test
    public void test66() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(947, 1, 0, 1660, 606, 2279, 3, 739, 500, 1, 0, 0), 0);
    }

    @Test
    public void test67() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(919, 0, 1, 904, 185, 2680, 0, 641, 401, 0, 0, 0), 0);
    }

    @Test
    public void test68() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(529, 0, 1, 2376, 616, 4702, 3, 501, 739, 0, 0, 0), 0);
    }

    @Test
    public void test69() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(632, 0, 1, 1479, 544, 2213, 1, 499, 641, 1, 0, 0), 0);
    }

    @Test
    public void test70() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(871, 0, 1, 4564, 133, 362, 1, 499, 400, 0, 0, 0), 0);
    }

    @Test
    public void test71() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(562, 1, 1, 2836, 195, 5909, 2, 499, 741, 0, 1, 1), 0);
    }

    @Test
    public void test72() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(610, 0, 1, 135, 539, 5537, 1, 739, 639, 1, 0, 0), 0);
    }

    @Test
    public void test73() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(867, 1, 1, 1874, 201, 4704, 0, 499, 499, 1, 0, 1), 0);
    }

    @Test
    public void test74() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(845, 1, 0, 647, 226, 4212, 2, 501, 499, 0, 0, 1), 1);
    }

    @Test
    public void test75() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(822, 1, 0, 5034, 541, 2582, 2, 740, 740, 0, 1, 0), 0);
    }

    @Test
    public void test76() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(769, 0, 1, 903, 91, 233, 3, 399, 740, 1, 1, 0), 0);
    }

    @Test
    public void test77() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(667, 0, 0, 4200, 562, 645, 3, 640, 739, 1, 0, 1), 0);
    }

    @Test
    public void test78() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(597, 0, 0, 5459, 555, 2985, 3, 741, 401, 1, 1, 0), 0);
    }

    @Test
    public void test79() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(959, 1, 1, 1600, 566, 3684, 1, 641, 740, 0, 0, 1), 0);
    }

    @Test
    public void test80() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(557, 0, 1, 1365, 369, 241, 0, 500, 401, 0, 0, 0), 0);
    }

    @Test
    public void test81() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(877, 0, 1, 3749, 566, 3439, 1, 641, 739, 0, 1, 0), 0);
    }

    @Test
    public void test82() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(637, 1, 1, 486, 588, 3732, 2, 399, 641, 1, 0, 1), 0);
    }

    @Test
    public void test83() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(950, 1, 1, 1309, 2, 5510, 3, 740, 639, 1, 0, 0), 1);
    }

    @Test
    public void test84() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(925, 0, 1, 508, 500, 1124, 3, 740, 740, 1, 0, 1), 0);
    }

    @Test
    public void test85() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(691, 0, 0, 1625, 534, 5258, 0, 400, 639, 1, 0, 0), 0);
    }

    @Test
    public void test86() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(833, 1, 1, 927, 145, 2642, 2, 641, 501, 1, 0, 1), 1);
    }

    @Test
    public void test87() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(804, 0, 1, 1933, 194, 1176, 0, 640, 639, 1, 0, 0), 0);
    }

    @Test
    public void test88() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(937, 0, 1, 2358, 298, 524, 1, 740, 741, 1, 1, 1), 0);
    }

    @Test
    public void test89() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(542, 0, 0, 96, 231, 2100, 2, 400, 741, 1, 0, 0), 0);
    }

    @Test
    public void test90() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(975, 0, 0, 1371, 238, 1272, 1, 400, 640, 1, 1, 1), 0);
    }

    @Test
    public void test91() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(690, 0, 0, 173, 231, 681, 1, 499, 741, 1, 1, 1), 0);
    }

    @Test
    public void test92() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(866, 1, 1, 5987, 18, 2595, 1, 639, 639, 0, 0, 0), 2);
    }

    @Test
    public void test93() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(915, 0, 0, 1855, 99, 3443, 2, 401, 740, 0, 0, 1), 0);
    }

    @Test
    public void test94() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(630, 1, 0, 3335, 578, 2359, 3, 401, 740, 1, 0, 1), 0);
    }

    @Test
    public void test95() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(843, 1, 1, 1806, 481, 1209, 3, 640, 500, 1, 1, 1), 0);
    }

    @Test
    public void test96() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(564, 1, 0, 389, 179, 377, 3, 741, 501, 0, 1, 0), 0);
    }

    @Test
    public void test97() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(685, 1, 1, 4828, 116, 410, 2, 501, 500, 1, 1, 0), 0);
    }

    @Test
    public void test98() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(716, 0, 0, 1318, 76, 54, 2, 400, 640, 1, 1, 1), 0);
    }

    @Test
    public void test99() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(624, 1, 0, 3575, 185, 2668, 2, 501, 639, 0, 1, 1), 0);
    }

    @Test
    public void test100() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(922, 0, 0, 5533, 587, 5628, 1, 640, 499, 0, 0, 0), 0);
    }

    @Test
    public void test101() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(651, 1, 0, 270, 517, 5308, 0, 739, 740, 0, 1, 1), 0);
    }

    @Test
    public void test102() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(931, 0, 0, 472, 619, 702, 3, 639, 740, 0, 0, 1), 0);
    }

    @Test
    public void test103() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(827, 0, 1, 1691, 437, 776, 1, 641, 399, 1, 0, 1), 0);
    }

    @Test
    public void test104() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(636, 0, 0, 4210, 340, 4046, 0, 741, 401, 0, 1, 1), 0);
    }

    @Test
    public void test105() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(838, 1, 0, 5179, 451, 3128, 2, 399, 740, 1, 0, 0), 0);
    }

    @Test
    public void test106() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(807, 1, 1, 3747, 344, 2226, 1, 641, 401, 0, 0, 1), 0);
    }

    @Test
    public void test107() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(953, 1, 1, 5194, 356, 2325, 3, 501, 401, 1, 1, 0), 0);
    }

    @Test
    public void test108() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(779, 1, 1, 5328, 619, 4294, 0, 501, 399, 0, 1, 1), 0);
    }

    @Test
    public void test109() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(932, 0, 1, 2219, 415, 189, 0, 641, 500, 1, 1, 0), 0);
    }

    @Test
    public void test110() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(969, 1, 0, 691, 510, 603, 1, 740, 399, 1, 1, 1), 0);
    }

    @Test
    public void test111() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(530, 0, 0, 515, 36, 368, 2, 740, 400, 1, 1, 1), 0);
    }

    @Test
    public void test112() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(940, 1, 1, 203, 198, 885, 0, 499, 500, 0, 0, 0), 1);
    }

    @Test
    public void test113() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(877, 0, 0, 996, 157, 2459, 1, 501, 740, 1, 1, 0), 0);
    }

    @Test
    public void test114() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(779, 1, 0, 4175, 94, 5280, 1, 739, 499, 0, 1, 1), 0);
    }

    @Test
    public void test115() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(753, 1, 0, 5017, 27, 1162, 3, 740, 640, 1, 0, 0), 0);
    }

    @Test
    public void test116() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(890, 0, 1, 4178, 598, 5835, 2, 741, 401, 1, 0, 1), 0);
    }

    @Test
    public void test117() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(969, 1, 1, 375, 228, 986, 0, 499, 499, 1, 1, 1), 0);
    }

    @Test
    public void test118() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(705, 0, 0, 3770, 607, 499, 1, 401, 399, 0, 0, 0), 0);
    }

    @Test
    public void test119() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(886, 1, 1, 1380, 305, 2806, 0, 641, 739, 0, 0, 0), 1);
    }

    @Test
    public void test120() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(833, 0, 0, 981, 545, 739, 0, 499, 399, 1, 0, 0), 0);
    }

    @Test
    public void test121() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(656, 0, 0, 892, 409, 4552, 1, 399, 639, 0, 1, 1), 0);
    }

    @Test
    public void test122() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(913, 0, 0, 58, 84, 1982, 1, 739, 500, 1, 1, 1), 0);
    }

    @Test
    public void test123() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(675, 1, 0, 300, 395, 2397, 2, 501, 639, 0, 1, 1), 0);
    }

    @Test
    public void test124() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(625, 1, 1, 3344, 560, 3343, 1, 501, 499, 1, 1, 0), 0);
    }

    @Test
    public void test125() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(750, 0, 0, 5769, 41, 906, 1, 401, 741, 0, 1, 1), 0);
    }

    @Test
    public void test126() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(817, 1, 0, 973, 245, 3280, 3, 740, 640, 1, 0, 1), 1);
    }

    @Test
    public void test127() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(651, 0, 1, 982, 211, 394, 3, 500, 741, 0, 0, 0), 0);
    }

    @Test
    public void test128() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(646, 0, 1, 1598, 269, 5991, 0, 400, 739, 0, 0, 0), 0);
    }

    @Test
    public void test129() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(670, 1, 1, 1329, 428, 5569, 1, 399, 740, 1, 1, 1), 0);
    }

    @Test
    public void test130() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(622, 1, 0, 4421, 180, 1996, 2, 639, 640, 0, 1, 0), 0);
    }

    @Test
    public void test131() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(548, 1, 1, 4416, 322, 1952, 0, 739, 500, 0, 0, 0), 0);
    }

    @Test
    public void test132() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(654, 1, 1, 2133, 113, 442, 3, 641, 741, 0, 0, 0), 0);
    }

    @Test
    public void test133() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(543, 0, 1, 2857, 188, 2979, 3, 401, 741, 0, 0, 0), 0);
    }

    @Test
    public void test134() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(845, 1, 0, 2624, 419, 4353, 1, 400, 641, 1, 1, 1), 0);
    }

    @Test
    public void test135() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(837, 1, 1, 3649, 52, 3911, 3, 640, 499, 0, 1, 0), 1);
    }

    @Test
    public void test136() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(812, 1, 0, 2155, 530, 1846, 2, 640, 739, 0, 1, 1), 0);
    }

    @Test
    public void test137() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(554, 1, 0, 4534, 6, 1975, 3, 399, 499, 1, 1, 1), 0);
    }

    @Test
    public void test138() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(888, 1, 0, 3648, 302, 215, 1, 501, 399, 1, 1, 0), 0);
    }

    @Test
    public void test139() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(702, 1, 1, 3653, 250, 423, 1, 401, 501, 0, 0, 0), 0);
    }

    @Test
    public void test140() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(774, 1, 1, 551, 433, 2572, 1, 740, 639, 0, 0, 1), 0);
    }

    @Test
    public void test141() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(594, 1, 1, 5449, 318, 4116, 1, 400, 501, 1, 1, 1), 0);
    }

    @Test
    public void test142() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(961, 0, 1, 902, 126, 3531, 1, 740, 500, 1, 0, 0), 0);
    }

    @Test
    public void test143() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(934, 1, 1, 2743, 366, 5463, 2, 739, 399, 0, 1, 1), 1);
    }

    @Test
    public void test144() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(533, 0, 0, 5750, 407, 4328, 2, 641, 400, 1, 1, 1), 0);
    }

    @Test
    public void test145() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(712, 1, 1, 2545, 341, 4146, 0, 641, 740, 1, 0, 0), 1);
    }

    @Test
    public void test146() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(780, 0, 0, 702, 12, 4837, 3, 740, 739, 1, 0, 0), 0);
    }

    @Test
    public void test147() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(861, 1, 1, 2982, 567, 3850, 3, 400, 401, 1, 0, 1), 1);
    }

    @Test
    public void test148() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(829, 1, 0, 4012, 389, 818, 1, 401, 400, 0, 1, 1), 0);
    }

    @Test
    public void test149() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(660, 0, 1, 3874, 28, 726, 1, 400, 401, 1, 1, 0), 0);
    }

    @Test
    public void test150() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(716, 1, 1, 2749, 240, 993, 3, 401, 739, 0, 1, 0), 0);
    }

    @Test
    public void test151() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(739, 1, 1, 609, 48, 1187, 1, 741, 639, 1, 1, 1), 0);
    }

    @Test
    public void test152() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(592, 1, 0, 1045, 226, 4721, 2, 640, 401, 0, 0, 1), 0);
    }

    @Test
    public void test153() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(833, 0, 0, 678, 405, 963, 2, 400, 739, 1, 0, 1), 0);
    }

    @Test
    public void test154() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(940, 0, 0, 651, 469, 3461, 2, 639, 400, 0, 1, 0), 0);
    }

    @Test
    public void test155() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(690, 0, 0, 404, 384, 908, 0, 500, 740, 0, 0, 1), 0);
    }

    @Test
    public void test156() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(757, 1, 1, 3234, 187, 2853, 3, 401, 500, 0, 1, 1), 0);
    }

    @Test
    public void test157() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(879, 0, 1, 553, 347, 2553, 1, 639, 400, 0, 0, 1), 0);
    }

    @Test
    public void test158() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(719, 1, 1, 5010, 438, 4880, 0, 741, 640, 1, 1, 1), 0);
    }

    @Test
    public void test159() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(690, 1, 1, 380, 577, 239, 0, 641, 640, 0, 1, 1), 0);
    }

    @Test
    public void test160() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(793, 0, 1, 176, 89, 4431, 0, 740, 399, 1, 0, 0), 0);
    }

    @Test
    public void test161() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(771, 0, 0, 1054, 289, 282, 3, 400, 641, 0, 0, 1), 0);
    }

    @Test
    public void test162() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(979, 0, 1, 931, 141, 79, 1, 639, 399, 0, 0, 0), 0);
    }

    @Test
    public void test163() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(858, 0, 1, 3222, 405, 349, 1, 740, 500, 0, 0, 0), 0);
    }

    @Test
    public void test164() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(918, 1, 0, 818, 542, 1868, 2, 639, 639, 0, 0, 1), 1);
    }

    @Test
    public void test165() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(741, 1, 1, 966, 413, 2508, 3, 741, 641, 1, 0, 0), 1);
    }

    @Test
    public void test166() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(990, 1, 1, 3490, 323, 281, 2, 640, 741, 0, 0, 1), 2);
    }

    @Test
    public void test167() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(536, 0, 1, 927, 423, 2757, 3, 399, 501, 1, 0, 1), 0);
    }

    @Test
    public void test168() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(927, 1, 0, 4902, 351, 2093, 0, 739, 740, 1, 0, 0), 2);
    }

    @Test
    public void test169() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(749, 0, 1, 1037, 384, 703, 3, 400, 740, 1, 1, 1), 0);
    }

    @Test
    public void test170() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(946, 1, 0, 2345, 180, 170, 2, 399, 400, 0, 1, 0), 0);
    }

    @Test
    public void test171() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(631, 1, 0, 1569, 330, 1984, 0, 740, 500, 1, 1, 1), 0);
    }

    @Test
    public void test172() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(550, 1, 1, 489, 113, 1317, 1, 640, 399, 1, 0, 1), 0);
    }

    @Test
    public void test173() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(641, 0, 1, 41, 422, 4244, 3, 740, 401, 0, 1, 1), 0);
    }

    @Test
    public void test174() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(700, 0, 1, 1300, 580, 3798, 2, 639, 741, 1, 1, 0), 0);
    }

    @Test
    public void test175() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(666, 1, 0, 201, 119, 3080, 2, 399, 640, 1, 0, 0), 0);
    }

    @Test
    public void test176() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(661, 0, 1, 3235, 287, 2268, 1, 640, 399, 0, 1, 1), 0);
    }

    @Test
    public void test177() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(826, 0, 0, 3619, 369, 2109, 1, 741, 639, 0, 1, 1), 0);
    }

    @Test
    public void test178() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(874, 0, 1, 771, 9, 4043, 1, 500, 639, 1, 1, 1), 0);
    }

    @Test
    public void test179() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(911, 1, 1, 3373, 346, 1773, 2, 400, 501, 1, 1, 1), 0);
    }

    @Test
    public void test180() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(749, 0, 1, 2307, 230, 1594, 1, 741, 740, 1, 0, 1), 0);
    }

    @Test
    public void test181() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(567, 1, 0, 5621, 399, 3514, 1, 500, 400, 0, 1, 0), 0);
    }

    @Test
    public void test182() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(635, 1, 0, 5854, 219, 617, 3, 399, 401, 1, 1, 0), 0);
    }

    @Test
    public void test183() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(897, 1, 1, 1701, 109, 3438, 1, 641, 401, 0, 1, 0), 1);
    }

    @Test
    public void test184() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(598, 0, 1, 2589, 130, 629, 3, 399, 500, 0, 0, 1), 0);
    }

    @Test
    public void test185() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(893, 0, 1, 5001, 301, 711, 2, 400, 739, 1, 0, 0), 0);
    }

    @Test
    public void test186() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(530, 0, 0, 1564, 583, 4042, 1, 400, 500, 1, 0, 1), 0);
    }

    @Test
    public void test187() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(854, 0, 0, 5295, 258, 895, 3, 639, 500, 1, 1, 1), 0);
    }

    @Test
    public void test188() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(550, 1, 0, 968, 10, 5679, 0, 500, 740, 0, 0, 0), 0);
    }

    @Test
    public void test189() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(828, 1, 0, 4580, 568, 2638, 0, 740, 639, 0, 1, 0), 0);
    }

    @Test
    public void test190() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(944, 1, 1, 4283, 251, 3431, 2, 639, 641, 1, 0, 1), 0);
    }

    @Test
    public void test191() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(768, 0, 0, 889, 193, 4424, 3, 740, 740, 1, 1, 0), 0);
    }

    @Test
    public void test192() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(857, 0, 1, 574, 409, 3712, 2, 501, 501, 1, 1, 0), 0);
    }

    @Test
    public void test193() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(659, 1, 0, 781, 18, 271, 3, 399, 499, 1, 0, 1), 0);
    }

    @Test
    public void test194() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(827, 1, 1, 1935, 339, 968, 0, 399, 740, 0, 1, 1), 0);
    }

    @Test
    public void test195() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(768, 1, 1, 2197, 496, 5257, 1, 639, 399, 0, 0, 0), 1);
    }

    @Test
    public void test196() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(684, 1, 1, 5744, 499, 870, 3, 741, 739, 1, 1, 1), 0);
    }

    @Test
    public void test197() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(722, 1, 0, 201, 343, 665, 1, 639, 499, 1, 1, 0), 0);
    }

    @Test
    public void test198() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(571, 1, 0, 397, 173, 2247, 2, 641, 499, 1, 0, 1), 0);
    }

    @Test
    public void test199() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(956, 0, 1, 3698, 70, 717, 3, 399, 499, 1, 0, 1), 0);
    }

    @Test
    public void test200() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(850, 1, 1, 4146, 473, 899, 1, 740, 500, 1, 0, 0), 0);
    }

    @Test
    public void test201() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(642, 1, 1, 3494, 125, 2158, 0, 500, 400, 1, 0, 1), 0);
    }

    @Test
    public void test202() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(628, 1, 0, 2784, 4, 3034, 3, 399, 399, 1, 0, 0), 0);
    }

    @Test
    public void test203() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(838, 0, 0, 5849, 266, 1016, 2, 401, 500, 0, 0, 0), 0);
    }

    @Test
    public void test204() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(824, 1, 1, 1917, 99, 850, 3, 739, 739, 0, 0, 1), 0);
    }

    @Test
    public void test205() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(686, 0, 0, 1705, 525, 5369, 1, 641, 401, 0, 1, 0), 0);
    }

    @Test
    public void test206() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(934, 0, 1, 372, 159, 1322, 1, 401, 639, 1, 1, 0), 0);
    }

    @Test
    public void test207() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(999, 0, 0, 3577, 27, 4795, 0, 641, 500, 1, 1, 0), 0);
    }

    @Test
    public void test208() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(738, 0, 1, 573, 548, 268, 3, 499, 741, 1, 1, 0), 0);
    }

    @Test
    public void test209() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(988, 1, 0, 5692, 580, 4270, 0, 639, 639, 1, 0, 1), 0);
    }

    @Test
    public void test210() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(762, 0, 0, 1874, 205, 4933, 3, 399, 641, 1, 0, 1), 0);
    }

    @Test
    public void test211() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(540, 1, 1, 122, 460, 5776, 2, 640, 740, 1, 0, 1), 0);
    }

    @Test
    public void test212() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(745, 1, 1, 5728, 191, 2829, 1, 401, 640, 0, 1, 0), 0);
    }

    @Test
    public void test213() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(000, 1, 0, 177, 288, 5884, 3, 401, 640, 0, 0, 1), 0);
    }

    @Test
    public void test214() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(638, 1, 0, 2578, 156, 3757, 0, 500, 399, 1, 0, 0), 1);
    }

    @Test
    public void test215() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(919, 0, 1, 131, 300, 3506, 0, 641, 501, 0, 0, 1), 0);
    }

    @Test
    public void test216() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(874, 0, 0, 5644, 103, 4207, 3, 399, 740, 1, 0, 0), 0);
    }

    @Test
    public void test217() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(848, 1, 1, 2141, 138, 2142, 1, 500, 399, 1, 1, 0), 0);
    }

    @Test
    public void test218() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(910, 1, 0, 427, 162, 2489, 2, 740, 741, 0, 0, 1), 0);
    }

    @Test
    public void test219() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(838, 1, 0, 2922, 557, 983, 1, 740, 640, 0, 0, 1), 0);
    }

    @Test
    public void test220() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(913, 0, 1, 452, 437, 263, 1, 741, 741, 1, 1, 1), 0);
    }

    @Test
    public void test221() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(776, 0, 1, 798, 308, 3693, 0, 400, 741, 0, 0, 0), 0);
    }

    @Test
    public void test222() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(556, 0, 0, 5915, 151, 482, 2, 400, 739, 1, 0, 0), 0);
    }

    @Test
    public void test223() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(974, 0, 1, 420, 156, 5924, 0, 741, 400, 0, 0, 1), 0);
    }

    @Test
    public void test224() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(781, 1, 0, 930, 207, 4163, 1, 639, 399, 0, 0, 0), 1);
    }

    @Test
    public void test225() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(916, 0, 1, 1828, 43, 3898, 3, 499, 640, 0, 1, 0), 0);
    }

    @Test
    public void test226() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(813, 0, 0, 1259, 55, 662, 1, 399, 501, 0, 1, 1), 0);
    }

    @Test
    public void test227() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(822, 0, 0, 1474, 38, 1377, 3, 641, 640, 1, 0, 0), 0);
    }

    @Test
    public void test228() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(538, 0, 0, 186, 548, 2387, 0, 739, 639, 0, 0, 0), 0);
    }

    @Test
    public void test229() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(983, 1, 1, 4732, 69, 1731, 2, 640, 739, 1, 0, 1), 0);
    }

    @Test
    public void test230() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(685, 1, 0, 117, 74, 5136, 0, 640, 639, 1, 1, 0), 0);
    }

    @Test
    public void test231() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(660, 1, 1, 4014, 407, 561, 3, 501, 400, 0, 1, 1), 0);
    }

    @Test
    public void test232() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(535, 0, 0, 1871, 69, 5220, 2, 500, 641, 0, 1, 1), 0);
    }

    @Test
    public void test233() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(651, 0, 1, 703, 399, 62, 3, 741, 641, 1, 1, 0), 0);
    }

    @Test
    public void test234() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(868, 0, 0, 2014, 577, 1420, 1, 740, 401, 1, 0, 0), 0);
    }

    @Test
    public void test235() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(760, 0, 0, 104, 113, 1610, 3, 741, 401, 1, 0, 1), 0);
    }

    @Test
    public void test236() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(856, 0, 1, 4927, 182, 3316, 0, 741, 740, 0, 0, 1), 0);
    }

    @Test
    public void test237() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(874, 0, 0, 3373, 525, 1643, 2, 399, 641, 1, 1, 0), 0);
    }

    @Test
    public void test238() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(844, 1, 1, 3839, 76, 2610, 1, 740, 640, 0, 1, 0), 0);
    }

    @Test
    public void test239() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(782, 1, 1, 263, 499, 1160, 0, 641, 740, 1, 1, 1), 0);
    }

    @Test
    public void test240() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(679, 0, 0, 279, 453, 454, 1, 641, 499, 0, 0, 1), 0);
    }

    @Test
    public void test241() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(898, 1, 0, 2193, 11, 2865, 2, 741, 641, 0, 1, 1), 0);
    }

    @Test
    public void test242() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(878, 1, 0, 2425, 103, 556, 1, 740, 739, 1, 0, 0), 0);
    }

    @Test
    public void test243() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(743, 1, 0, 1305, 269, 942, 1, 740, 501, 0, 0, 1), 0);
    }

    @Test
    public void test244() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(953, 0, 1, 2935, 224, 2070, 3, 499, 641, 0, 1, 0), 0);
    }

    @Test
    public void test245() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(897, 1, 1, 2226, 306, 3860, 3, 740, 641, 0, 0, 1), 1);
    }

    @Test
    public void test246() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(733, 0, 1, 367, 18, 1266, 1, 499, 399, 0, 0, 1), 0);
    }

    @Test
    public void test247() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(643, 1, 1, 5514, 362, 2288, 1, 400, 741, 1, 1, 0), 0);
    }

    @Test
    public void test248() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(541, 0, 1, 5231, 502, 1059, 1, 399, 639, 0, 0, 0), 0);
    }

    @Test
    public void test249() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(598, 0, 0, 3491, 413, 5933, 3, 741, 401, 0, 0, 0), 0);
    }

    @Test
    public void test250() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(750, 1, 1, 682, 313, 4253, 2, 499, 740, 0, 0, 1), 0);
    }

    @Test
    public void test251() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(563, 1, 1, 4688, 587, 773, 3, 640, 639, 0, 0, 0), 0);
    }

    @Test
    public void test252() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(544, 0, 0, 4467, 603, 5942, 1, 501, 640, 0, 0, 0), 0);
    }

    @Test
    public void test253() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(661, 1, 1, 1802, 117, 1355, 3, 400, 499, 0, 1, 0), 0);
    }

    @Test
    public void test254() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(880, 0, 1, 412, 407, 936, 1, 401, 739, 1, 0, 1), 0);
    }

    @Test
    public void test255() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(832, 0, 0, 375, 147, 2068, 0, 739, 741, 0, 1, 1), 0);
    }

    @Test
    public void test256() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(751, 1, 1, 1924, 408, 2617, 0, 639, 640, 1, 1, 1), 0);
    }

    @Test
    public void test257() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(698, 0, 0, 990, 464, 5856, 3, 640, 501, 1, 0, 0), 0);
    }

    @Test
    public void test258() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(858, 0, 1, 1894, 242, 772, 3, 400, 639, 0, 1, 0), 0);
    }

    @Test
    public void test259() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(798, 0, 1, 5229, 263, 1740, 0, 740, 401, 1, 1, 0), 0);
    }

    @Test
    public void test260() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(710, 1, 1, 5993, 315, 239, 1, 641, 401, 0, 1, 1), 0);
    }

    @Test
    public void test261() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(743, 1, 1, 3478, 260, 1672, 1, 400, 499, 1, 0, 0), 0);
    }

    @Test
    public void test262() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(745, 0, 0, 2069, 495, 3141, 3, 501, 501, 1, 1, 1), 0);
    }

    @Test
    public void test263() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(865, 0, 1, 796, 147, 444, 0, 499, 400, 1, 1, 1), 0);
    }

    @Test
    public void test264() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(554, 1, 1, 2815, 476, 1600, 3, 641, 401, 0, 1, 1), 0);
    }

    @Test
    public void test265() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(536, 0, 0, 3139, 164, 5669, 1, 399, 501, 0, 0, 1), 0);
    }

    @Test
    public void test266() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(849, 0, 1, 4435, 344, 969, 3, 399, 401, 0, 1, 0), 0);
    }

    @Test
    public void test267() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(715, 1, 1, 1085, 409, 1577, 3, 640, 740, 0, 1, 0), 0);
    }

    @Test
    public void test268() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(726, 1, 0, 1021, 340, 5644, 2, 641, 399, 0, 0, 0), 1);
    }

    @Test
    public void test269() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(974, 0, 0, 1091, 325, 69, 3, 501, 741, 1, 0, 0), 0);
    }

    @Test
    public void test270() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(584, 1, 0, 679, 53, 117, 1, 739, 401, 0, 1, 1), 0);
    }

    @Test
    public void test271() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(998, 1, 0, 2921, 563, 904, 1, 499, 641, 1, 0, 0), 0);
    }

    @Test
    public void test272() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(786, 1, 0, 383, 548, 5870, 0, 639, 399, 1, 0, 1), 1);
    }

    @Test
    public void test273() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(809, 0, 0, 108, 413, 343, 3, 401, 399, 1, 0, 1), 0);
    }

    @Test
    public void test274() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(873, 1, 0, 2763, 4, 208, 3, 741, 401, 0, 0, 1), 0);
    }

    @Test
    public void test275() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(523, 1, 0, 5002, 473, 909, 3, 499, 501, 0, 0, 0), 0);
    }

    @Test
    public void test276() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(982, 1, 1, 927, 524, 5556, 2, 500, 501, 1, 1, 1), 0);
    }

    @Test
    public void test277() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(921, 1, 0, 2049, 162, 1259, 3, 401, 641, 1, 0, 1), 0);
    }

    @Test
    public void test278() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(679, 1, 1, 3180, 297, 5750, 3, 739, 400, 0, 0, 0), 1);
    }

    @Test
    public void test279() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(755, 0, 0, 2949, 565, 2031, 0, 399, 741, 1, 1, 0), 0);
    }

    @Test
    public void test280() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(643, 0, 1, 1976, 129, 124, 1, 499, 641, 0, 0, 1), 0);
    }

    @Test
    public void test281() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(815, 0, 0, 836, 295, 1267, 3, 739, 499, 1, 0, 0), 0);
    }

    @Test
    public void test282() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(677, 1, 0, 4864, 257, 5470, 1, 501, 399, 0, 1, 0), 0);
    }

    @Test
    public void test283() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(986, 1, 1, 1534, 145, 2736, 3, 641, 401, 0, 0, 0), 1);
    }

    @Test
    public void test284() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(841, 1, 1, 670, 226, 4140, 1, 640, 740, 0, 1, 1), 1);
    }

    @Test
    public void test285() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(960, 0, 1, 5487, 575, 2958, 0, 400, 500, 1, 0, 1), 0);
    }

    @Test
    public void test286() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(945, 1, 1, 1426, 406, 555, 2, 401, 739, 1, 1, 0), 0);
    }

    @Test
    public void test287() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(587, 0, 0, 3575, 5, 815, 0, 639, 739, 1, 1, 0), 0);
    }

    @Test
    public void test288() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(816, 1, 1, 5118, 231, 4376, 1, 500, 499, 0, 1, 1), 0);
    }

    @Test
    public void test289() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(772, 1, 1, 2007, 377, 416, 1, 401, 639, 1, 0, 1), 0);
    }

    @Test
    public void test290() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(802, 0, 1, 3169, 150, 4244, 2, 739, 400, 0, 0, 1), 0);
    }

    @Test
    public void test291() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(745, 1, 0, 85, 144, 5206, 3, 401, 499, 1, 0, 0), 0);
    }

    @Test
    public void test292() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(944, 0, 0, 2065, 348, 818, 2, 640, 739, 0, 1, 0), 0);
    }

    @Test
    public void test293() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(937, 1, 1, 5273, 326, 878, 1, 640, 641, 1, 1, 1), 0);
    }

    @Test
    public void test294() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(594, 0, 1, 574, 103, 969, 2, 499, 399, 0, 0, 1), 0);
    }

    @Test
    public void test295() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(725, 1, 1, 2766, 354, 4811, 3, 641, 501, 1, 1, 0), 0);
    }

    @Test
    public void test296() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(523, 1, 1, 877, 601, 5608, 1, 639, 400, 0, 0, 0), 0);
    }

    @Test
    public void test297() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(931, 1, 0, 5113, 72, 3242, 3, 400, 639, 1, 1, 0), 0);
    }

    @Test
    public void test298() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(716, 1, 0, 5046, 323, 3839, 1, 639, 500, 0, 1, 0), 0);
    }

    @Test
    public void test299() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(893, 1, 0, 5078, 256, 3944, 1, 500, 641, 0, 0, 1), 2);
    }

    @Test
    public void test300() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(819, 0, 0, 3878, 331, 5704, 3, 740, 499, 1, 1, 0), 0);
    }

    @Test
    public void test301() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(611, 0, 0, 1509, 98, 667, 3, 739, 399, 1, 1, 1), 0);
    }

    @Test
    public void test302() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(574, 0, 1, 2060, 111, 2572, 3, 500, 641, 0, 0, 0), 0);
    }

    @Test
    public void test303() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(989, 1, 0, 1208, 55, 4201, 2, 499, 400, 1, 1, 1), 0);
    }

    @Test
    public void test304() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(895, 1, 1, 985, 483, 3388, 2, 501, 400, 1, 0, 0), 1);
    }

    @Test
    public void test305() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(724, 0, 1, 1495, 597, 5243, 0, 640, 500, 1, 1, 0), 0);
    }

    @Test
    public void test306() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(932, 1, 1, 3456, 557, 571, 2, 640, 400, 0, 0, 0), 0);
    }

    @Test
    public void test307() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(521, 1, 0, 1907, 348, 2633, 0, 499, 501, 0, 1, 0), 0);
    }

    @Test
    public void test308() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(608, 1, 1, 674, 216, 442, 0, 741, 400, 0, 0, 0), 0);
    }

    @Test
    public void test309() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(589, 0, 1, 3817, 593, 223, 3, 400, 641, 1, 1, 1), 0);
    }

    @Test
    public void test310() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(841, 0, 1, 3618, 311, 1559, 1, 400, 739, 1, 0, 1), 0);
    }

    @Test
    public void test311() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(746, 1, 0, 121, 246, 362, 1, 401, 640, 1, 1, 0), 0);
    }

    @Test
    public void test312() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(628, 1, 0, 5645, 573, 1477, 2, 501, 399, 1, 1, 0), 0);
    }

    @Test
    public void test313() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(845, 1, 0, 805, 521, 374, 3, 499, 740, 1, 0, 1), 0);
    }

    @Test
    public void test314() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(690, 0, 1, 4135, 106, 3520, 1, 499, 639, 1, 0, 1), 0);
    }

    @Test
    public void test315() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(548, 1, 1, 2625, 249, 1679, 0, 641, 501, 1, 1, 1), 0);
    }

    @Test
    public void test316() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(763, 0, 0, 907, 444, 1881, 0, 741, 399, 0, 0, 1), 0);
    }

    @Test
    public void test317() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(750, 1, 1, 1730, 298, 60, 0, 640, 500, 0, 0, 0), 0);
    }

    @Test
    public void test318() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(653, 1, 0, 1707, 280, 3904, 3, 501, 740, 0, 0, 1), 0);
    }

    @Test
    public void test319() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(697, 0, 0, 539, 241, 2597, 3, 640, 741, 0, 1, 0), 0);
    }

    @Test
    public void test320() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(556, 1, 1, 351, 9, 281, 3, 741, 639, 0, 0, 1), 0);
    }

    @Test
    public void test321() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(789, 0, 0, 3283, 354, 1116, 2, 640, 400, 0, 0, 0), 0);
    }

    @Test
    public void test322() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(717, 0, 0, 3436, 374, 1439, 2, 640, 740, 1, 1, 0), 0);
    }

    @Test
    public void test323() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(596, 0, 0, 5238, 574, 857, 3, 739, 501, 1, 1, 0), 0);
    }

    @Test
    public void test324() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(767, 0, 1, 2316, 399, 3575, 0, 499, 501, 0, 1, 1), 0);
    }

    @Test
    public void test325() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(806, 1, 0, 2197, 495, 5711, 0, 401, 739, 0, 0, 1), 1);
    }

    @Test
    public void test326() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(593, 0, 1, 765, 481, 3711, 0, 500, 641, 1, 0, 1), 0);
    }

    @Test
    public void test327() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(955, 0, 1, 1836, 542, 3698, 3, 500, 401, 1, 0, 0), 0);
    }

    @Test
    public void test328() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(622, 1, 1, 3661, 13, 223, 1, 499, 739, 0, 1, 0), 0);
    }

    @Test
    public void test329() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(719, 0, 0, 5273, 196, 3585, 1, 740, 740, 1, 1, 1), 0);
    }

    @Test
    public void test330() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(772, 0, 1, 3773, 87, 4375, 1, 639, 400, 1, 0, 1), 0);
    }

    @Test
    public void test331() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(612, 1, 0, 4829, 4, 200, 1, 399, 500, 1, 1, 1), 0);
    }

    @Test
    public void test332() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(694, 1, 1, 3238, 81, 1642, 1, 500, 739, 0, 0, 0), 2);
    }

    @Test
    public void test333() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(564, 0, 0, 417, 556, 3138, 0, 741, 639, 1, 0, 0), 0);
    }

    @Test
    public void test334() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(994, 0, 0, 3682, 579, 39, 0, 400, 740, 1, 1, 1), 0);
    }

    @Test
    public void test335() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(689, 1, 0, 5258, 331, 1464, 2, 640, 501, 0, 1, 1), 0);
    }

    @Test
    public void test336() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(971, 1, 0, 383, 189, 4986, 3, 739, 501, 0, 0, 0), 1);
    }

    @Test
    public void test337() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(775, 0, 1, 865, 102, 2303, 3, 401, 401, 1, 1, 1), 0);
    }

    @Test
    public void test338() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(612, 0, 1, 3691, 242, 485, 1, 401, 500, 1, 0, 0), 0);
    }

    @Test
    public void test339() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(980, 1, 1, 904, 214, 2419, 1, 400, 641, 1, 0, 1), 0);
    }

    @Test
    public void test340() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(785, 1, 0, 2740, 421, 162, 3, 741, 741, 1, 0, 0), 2);
    }

    @Test
    public void test341() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(546, 0, 0, 2569, 544, 2947, 0, 399, 640, 1, 0, 1), 0);
    }

    @Test
    public void test342() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(886, 0, 0, 2059, 459, 274, 1, 401, 641, 1, 1, 1), 0);
    }

    @Test
    public void test343() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(889, 0, 0, 3799, 100, 4302, 1, 499, 640, 1, 0, 1), 0);
    }

    @Test
    public void test344() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(698, 1, 1, 4165, 477, 5526, 2, 641, 500, 1, 1, 0), 0);
    }

    @Test
    public void test345() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(644, 0, 1, 2518, 298, 896, 2, 401, 500, 1, 0, 1), 0);
    }

    @Test
    public void test346() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(843, 0, 1, 1935, 2, 4489, 0, 499, 401, 0, 0, 0), 0);
    }

    @Test
    public void test347() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(577, 1, 1, 2046, 389, 495, 0, 740, 501, 0, 1, 1), 0);
    }

    @Test
    public void test348() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(856, 1, 1, 2716, 320, 1742, 2, 641, 401, 1, 1, 0), 0);
    }

    @Test
    public void test349() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(900, 1, 0, 3346, 507, 663, 2, 640, 639, 0, 0, 1), 0);
    }

    @Test
    public void test350() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(995, 0, 1, 3499, 70, 1262, 1, 640, 399, 0, 0, 0), 0);
    }

    @Test
    public void test351() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(656, 0, 1, 4956, 595, 2307, 2, 501, 741, 0, 0, 1), 0);
    }

    @Test
    public void test352() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(878, 0, 1, 4939, 250, 1842, 2, 640, 400, 1, 0, 0), 0);
    }

    @Test
    public void test353() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(591, 1, 1, 1124, 287, 2790, 2, 640, 501, 1, 1, 1), 0);
    }

    @Test
    public void test354() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(785, 0, 1, 2802, 447, 2187, 1, 400, 740, 1, 1, 1), 0);
    }

    @Test
    public void test355() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(904, 1, 1, 2361, 527, 419, 2, 401, 400, 1, 1, 1), 0);
    }

    @Test
    public void test356() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(619, 1, 0, 197, 287, 4568, 2, 500, 499, 0, 0, 1), 1);
    }

    @Test
    public void test357() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(928, 1, 1, 380, 232, 5117, 1, 740, 499, 0, 0, 0), 1);
    }

    @Test
    public void test358() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(860, 1, 1, 602, 331, 5657, 3, 639, 740, 1, 1, 0), 0);
    }

    @Test
    public void test359() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(661, 0, 0, 767, 26, 5316, 3, 640, 399, 0, 1, 1), 0);
    }

    @Test
    public void test360() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(534, 1, 0, 5360, 149, 1528, 3, 740, 499, 1, 1, 0), 0);
    }

    @Test
    public void test361() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(774, 1, 1, 1231, 234, 61, 2, 400, 500, 1, 1, 1), 0);
    }

    @Test
    public void test362() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(804, 0, 1, 3514, 152, 1152, 1, 740, 501, 1, 1, 1), 0);
    }

    @Test
    public void test363() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(887, 0, 0, 1725, 477, 2346, 2, 741, 739, 1, 0, 0), 0);
    }

    @Test
    public void test364() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(808, 1, 1, 946, 546, 661, 1, 400, 640, 0, 1, 0), 0);
    }

    @Test
    public void test365() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(800, 1, 0, 2067, 586, 284, 3, 740, 499, 0, 0, 1), 0);
    }

    @Test
    public void test366() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(811, 0, 0, 2117, 222, 3074, 3, 501, 399, 1, 0, 1), 0);
    }

    @Test
    public void test367() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(661, 0, 0, 963, 177, 5207, 3, 499, 400, 1, 0, 0), 0);
    }

    @Test
    public void test368() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(995, 0, 0, 2133, 218, 905, 1, 501, 501, 0, 0, 1), 0);
    }

    @Test
    public void test369() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(788, 0, 0, 113, 177, 2105, 2, 501, 741, 0, 1, 1), 0);
    }

    @Test
    public void test370() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(906, 0, 0, 4284, 439, 111, 2, 740, 740, 0, 1, 1), 0);
    }

    @Test
    public void test371() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(537, 0, 1, 1397, 427, 1241, 1, 739, 740, 0, 1, 0), 0);
    }

    @Test
    public void test372() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(876, 1, 1, 508, 401, 271, 0, 401, 400, 1, 0, 0), 0);
    }

    @Test
    public void test373() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(548, 1, 0, 2001, 399, 523, 0, 741, 739, 0, 0, 0), 0);
    }

    @Test
    public void test374() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(801, 0, 1, 5536, 450, 504, 2, 741, 740, 0, 0, 1), 0);
    }

    @Test
    public void test375() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(921, 0, 1, 2166, 315, 3826, 0, 739, 500, 1, 1, 1), 0);
    }

    @Test
    public void test376() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(958, 0, 0, 1971, 138, 4932, 2, 400, 640, 0, 0, 1), 0);
    }

    @Test
    public void test377() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(661, 1, 1, 23, 469, 2852, 1, 400, 500, 1, 1, 1), 0);
    }

    @Test
    public void test378() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(878, 0, 1, 5906, 588, 3803, 2, 499, 399, 0, 0, 1), 0);
    }

    @Test
    public void test379() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(664, 1, 0, 3757, 24, 2579, 1, 499, 739, 0, 1, 1), 0);
    }

    @Test
    public void test380() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(564, 1, 0, 463, 166, 199, 2, 500, 640, 1, 1, 0), 0);
    }

    @Test
    public void test381() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(787, 0, 1, 3296, 306, 326, 3, 741, 639, 1, 1, 0), 0);
    }

    @Test
    public void test382() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(843, 0, 1, 154, 327, 2365, 0, 640, 499, 0, 0, 0), 0);
    }

    @Test
    public void test383() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(669, 1, 0, 287, 436, 2803, 3, 740, 400, 1, 1, 1), 0);
    }

    @Test
    public void test384() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(734, 0, 0, 2049, 280, 5472, 0, 399, 499, 0, 0, 0), 0);
    }

    @Test
    public void test385() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(578, 1, 0, 1170, 526, 4785, 1, 399, 741, 1, 0, 1), 0);
    }

    @Test
    public void test386() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(541, 1, 0, 3553, 365, 687, 0, 400, 741, 1, 1, 0), 0);
    }

    @Test
    public void test387() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(530, 0, 1, 129, 519, 1555, 1, 501, 640, 0, 1, 0), 0);
    }

    @Test
    public void test388() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(847, 0, 1, 2379, 193, 4481, 0, 641, 741, 0, 0, 0), 0);
    }

    @Test
    public void test389() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(867, 1, 1, 1211, 581, 153, 2, 640, 641, 1, 1, 1), 0);
    }

    @Test
    public void test390() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(607, 1, 1, 4250, 14, 4883, 2, 399, 641, 1, 0, 0), 0);
    }

    @Test
    public void test391() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(558, 0, 1, 84, 275, 4457, 1, 501, 401, 1, 0, 1), 0);
    }

    @Test
    public void test392() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(526, 0, 1, 751, 595, 2071, 3, 400, 641, 1, 0, 0), 0);
    }

    @Test
    public void test393() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(745, 0, 1, 730, 516, 245, 1, 641, 399, 1, 1, 0), 0);
    }

    @Test
    public void test394() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(812, 1, 0, 4165, 80, 690, 0, 741, 401, 0, 1, 1), 0);
    }

    @Test
    public void test395() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(785, 0, 1, 4931, 240, 554, 2, 499, 400, 0, 1, 1), 0);
    }

    @Test
    public void test396() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(540, 1, 0, 672, 233, 7, 0, 641, 399, 1, 0, 0), 0);
    }

    @Test
    public void test397() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(756, 0, 1, 562, 415, 3339, 2, 640, 640, 0, 0, 0), 0);
    }

    @Test
    public void test398() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(695, 0, 1, 55, 100, 2038, 1, 499, 401, 0, 0, 0), 0);
    }

    @Test
    public void test399() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(559, 1, 1, 1883, 613, 4507, 2, 640, 500, 1, 1, 1), 0);
    }

    @Test
    public void test400() {
        jtcas newtcas = new jtcas();
        assertEquals(newtcas.begin(676, 1, 0, 566, 287, 5295, 2, 399, 500, 1, 1, 1), 0);
    }

//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(571, 0, 0, 3403, 576, 850, 1, 741, 500, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(831, 0, 1, 468, 108, 3882, 1, 500, 399, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(794, 1, 1, 562, 577, 2901, 2, 499, 401, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(680, 0, 0, 505, 44, 186, 1, 739, 741, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(924, 0, 0, 1568, 86, 533, 0, 739, 499, 1, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(833, 1, 0, 4117, 424, 2255, 1, 501, 401, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(759, 0, 0, 1552, 265, 4793, 0, 641, 640, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(973, 0, 0, 1209, 444, 4409, 2, 399, 641, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(739, 1, 1, 5287, 252, 632, 1, 740, 639, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(912, 0, 0, 2658, 192, 3449, 3, 399, 401, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(750, 0, 0, 5376, 523, 2611, 2, 500, 639, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(953, 0, 1, 1508, 132, 672, 3, 499, 499, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(782, 1, 1, 513, 224, 5295, 0, 641, 639, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(722, 1, 1, 1415, 245, 316, 0, 401, 739, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(836, 1, 0, 4086, 407, 308, 2, 499, 400, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(994, 0, 1, 3194, 242, 687, 1, 501, 741, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(644, 1, 1, 1986, 596, 2448, 0, 741, 400, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(935, 1, 1, 792, 272, 3451, 3, 401, 740, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(690, 1, 1, 4560, 148, 43, 2, 741, 500, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(596, 1, 0, 4634, 393, 376, 1, 640, 501, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(538, 0, 1, 404, 384, 4237, 2, 640, 499, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(799, 0, 1, 386, 380, 351, 1, 639, 639, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(640, 0, 1, 2175, 485, 1271, 3, 639, 499, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(884, 0, 1, 754, 323, 2052, 3, 399, 640, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(635, 1, 0, 1142, 511, 4704, 1, 740, 500, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(781, 1, 0, 1855, 408, 3758, 3, 741, 741, 1, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(757, 1, 1, 319, 51, 300, 1, 401, 741, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(526, 1, 1, 5505, 562, 2174, 2, 639, 399, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(867, 0, 0, 4266, 161, 5389, 1, 640, 741, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(693, 1, 1, 4557, 254, 482, 3, 740, 739, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(671, 0, 1, 5327, 132, 902, 2, 400, 500, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(818, 0, 1, 100, 562, 4914, 0, 739, 401, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(780, 1, 0, 5331, 10, 1209, 3, 399, 640, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(706, 1, 0, 4170, 207, 133, 3, 499, 400, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(714, 1, 1, 1027, 537, 387, 3, 739, 400, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(946, 0, 0, 693, 550, 4173, 2, 399, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(630, 1, 0, 2188, 209, 2525, 0, 639, 739, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(914, 1, 1, 4924, 384, 5869, 3, 740, 741, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(721, 1, 0, 4129, 379, 2370, 3, 500, 741, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(831, 1, 0, 4955, 8, 4715, 0, 500, 399, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(905, 1, 0, 1171, 158, 385, 0, 739, 499, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(899, 0, 1, 4998, 2, 4230, 0, 500, 501, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(924, 0, 1, 1780, 437, 998, 2, 501, 639, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(574, 1, 0, 317, 311, 2079, 1, 400, 400, 1, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(623, 0, 1, 4856, 546, 420, 3, 500, 501, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(699, 0, 0, 4483, 280, 358, 1, 499, 639, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(942, 1, 1, 2938, 179, 534, 0, 740, 641, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(571, 0, 1, 379, 114, 2328, 2, 400, 401, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(965, 0, 0, 5560, 431, 1871, 0, 741, 399, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(974, 0, 1, 1279, 110, 1990, 3, 400, 501, 1, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(559, 1, 1, 2851, 413, 4323, 2, 501, 740, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(655, 1, 1, 4095, 265, 3490, 2, 739, 499, 1, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(860, 1, 1, 2944, 139, 5412, 0, 399, 641, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(924, 1, 0, 1981, 336, 3860, 2, 500, 501, 1, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(848, 1, 0, 2408, 180, 525, 0, 740, 401, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(921, 0, 1, 1788, 125, 516, 3, 399, 739, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(852, 1, 1, 1399, 347, 1245, 1, 400, 641, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(897, 0, 0, 2622, 326, 3725, 2, 401, 400, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(933, 0, 1, 567, 407, 1839, 0, 641, 640, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(776, 1, 0, 954, 72, 2987, 3, 399, 741, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(748, 1, 0, 508, 81, 1372, 0, 740, 739, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(624, 0, 1, 3277, 264, 5028, 3, 640, 400, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(570, 1, 1, 5125, 85, 4371, 0, 400, 499, 1, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(546, 0, 1, 4364, 90, 4988, 3, 739, 640, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(732, 0, 0, 2558, 599, 3531, 0, 399, 739, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(795, 0, 0, 3378, 59, 440, 0, 399, 740, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(574, 0, 0, 321, 131, 1814, 0, 639, 641, 1, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(997, 1, 0, 4466, 100, 4610, 1, 639, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(740, 1, 1, 972, 312, 3512, 3, 501, 740, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(869, 0, 0, 5624, 18, 702, 2, 500, 641, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(955, 0, 1, 1567, 366, 363, 0, 401, 639, 1, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(735, 1, 0, 2792, 119, 224, 3, 739, 739, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(912, 1, 0, 4251, 133, 545, 1, 739, 399, 1, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(607, 1, 0, 5014, 531, 310, 1, 739, 501, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(733, 1, 0, 1785, 585, 343, 3, 741, 499, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(811, 1, 1, 4100, 193, 5500, 3, 641, 500, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(715, 0, 0, 1768, 391, 1782, 2, 740, 399, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(797, 0, 0, 4454, 508, 288, 2, 741, 401, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(578, 0, 0, 4590, 303, 220, 0, 499, 501, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(621, 0, 1, 675, 520, 3199, 3, 641, 400, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(841, 0, 1, 427, 9, 4967, 2, 740, 501, 1, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(524, 0, 0, 2495, 396, 506, 3, 740, 640, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(848, 0, 0, 2494, 271, 2583, 1, 501, 641, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(966, 0, 0, 5272, 252, 451, 3, 499, 740, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(820, 0, 0, 1557, 524, 1163, 0, 499, 499, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(679, 1, 1, 541, 338, 5123, 0, 641, 641, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(565, 0, 0, 4233, 97, 5531, 1, 739, 641, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(793, 0, 0, 5989, 606, 3063, 3, 500, 641, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(609, 0, 0, 259, 8, 3583, 0, 641, 741, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(962, 0, 0, 3810, 528, 1326, 2, 641, 400, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(587, 1, 0, 4426, 303, 1022, 0, 499, 741, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(607, 0, 0, 3707, 320, 5543, 0, 639, 639, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(584, 1, 1, 1289, 401, 4395, 1, 501, 639, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(564, 1, 1, 4996, 391, 1494, 3, 640, 500, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(952, 0, 1, 2813, 121, 3907, 0, 501, 401, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(817, 0, 1, 4129, 65, 3077, 0, 739, 401, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(726, 0, 0, 3176, 519, 2689, 1, 400, 641, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(895, 0, 1, 5104, 338, 372, 3, 500, 639, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(928, 1, 1, 3716, 536, 1907, 2, 501, 639, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(608, 1, 1, 3093, 528, 5892, 1, 400, 400, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(627, 1, 0, 151, 446, 1983, 3, 401, 500, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(597, -1, 0, -1, 577, 0, 0, 605, 931, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(53, 1, -1, 740, -1, 702, -1, 0, -1, 2, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(0, 0, 0, 0, 609, -1, 1, 582, 89, 4, 0, -1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1, 1, 0, 9343, 0, 127, 3, -100, 0, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(40, 0, 0, 569, 400, 586, 1, 1012, 1037, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(174, 1, 0, 586, 373, 559, 2, 259, 351, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(84, 1, 1, 522, 426, 478, 0, 848, 496, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(016, 1, 1, 628, 0, 614, 0, 0, 746, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(13, 0, 1, 722, 520, 657, 2, 714, 822, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(0, 1, 1, 0, 409, 648, 2, 601, 657, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(95, 0, 1, 647, 357, 695, 1, 536, 593, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(25, 1, 1, 557, 349, 608, 3, 994, 880, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(108, 1, 1, 583, 449, 601, 1, 712, 725, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(81, 1, 0, 614, 482, 0, 0, 707, 757, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(81, 1, 0, 675, 428, 638, 0, 917, 920, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(52, 1, 1, 638, 609, 620, 1, 726, 0, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(93, 1, 1, 0, 580, 750, 1, 678, 447, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(59, 1, 0, 632, 355, 662, 2, 379, 97, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(9, 1, 1, 4523, 547, 657, 3, 743, 743, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(94, 1, 0, 631, 485, 642, 9, 442, 418, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(47, 1, 1, 570, 505, 615, 1, 341, 392, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(10, 1, 0, 686, 458, 122, 3, 1017, 980, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(66, 1, 1, 0, 380, 744, 0, 370, 369, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(60, 1, 1, 618, 329, 574, 4, 893, 914, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(54, 1, 1, 912, 496, 465, 0, 587, 495, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(60, 1, 1, 753, 595, 619, 0, 679, 630, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(149, 1, 0, 562, 485, 272, 1, 670, 633, 2, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(87, 1, 0, 550, 587, 819, 2, 929, 955, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(07, 1, 0, 560, 342, 601, 3, 961, 399, 2, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(207, 1, 1, 591, 996, 658, 1, 556, 0, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1, 1, 0, 631, 370, 661, 2, 820, 825, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(75, 1, 1, 0, 506, 596, 0, 906, 685, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 1, 3177, 325, 624, 3, 1026, 1017, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(68, 1, 1, 731, 361, 699, 1, 672, 690, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(95, 1, 1, -1, 403, 718, 2, 694, 708, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(37, 1, 1, 711, 452, 726, 2, 593, 506, 2, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(87, 1, 1, 591, 589, -100, 2, 424, 457, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(027, 1, 1, -100, 369, 599, 1, 737, 708, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(89, 1, 0, 657, 557, 644, 3, 0, 999, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(144, 1, 1, 590, 490, 646, 3, 457, 0, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(46, 1, 1, 630, 310, 615, 2, 318, 314, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(168, 1, 1, 0, 590, 673, 0, 387, 377, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(48, 1, 0, 0, 584, 616, 3, 566, 523, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(37, 1, 0, 691, 396, 0, 0, 949, 942, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(54, 1, 1, 703, 502, 730, 1, 0, 617, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(172, 1, 1, 0, 590, 732, 3, 745, 765, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(46, 1, 0, 0, 391, 601, 3, 837, 957, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(97, 1, 1, 3257, 470, 707, 2, 744, 693, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(89, 0, 1, 584, 798, 567, 2, 957, 925, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(97, 0, 0, 726, 322, 725, 3, 638, 650, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(87, 1, 1, 0, 293, 597, 0, 726, 686, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(66, 0, 1, 657, 464, 43, 2, 403, 424, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(54, 1, 0, 687, 426, 684, 1, 623, 744, 3, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(016, 1, 0, 658, 359, 644, 1, 391, 442, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(05, 0, 1, 699, 436, 742, 1, 372, 331, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(92, 0, 1, 762, 445, 157, 2, 442, 440, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(005, 1, 1, 601, 394, 601, 1, 717, 0, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 5216, 458, 972, 1, 539, 464, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(184, 1, 1, 4983, 523, 689, 0, 653, 938, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(146, 1, 0, 656, 392, 691, 0, 860, 0, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(66, 1, 1, 577, 342, 558, 2, 193, 1016, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(59, 0, 0, 640, 380, 580, 0, 748, 692, 2, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 603, 333, 552, 0, 410, 439, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(47, 1, 1, 677, 237, 681, 2, 594, 352, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(55, 1, 1, 628, 348, 861, 2, 455, 0, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(137, 1, 1, 687, 292, 572, 2, 0, 372, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(12, 1, 0, 663, 336, 587, 0, 518, 20, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(022, 1, 1, 554, 320, 598, 2, 914, 494, 2, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(61, 1, 0, 608, 527, 596, 0, 663, 632, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(0, 0, 1, 60, 432, 738, 3, 863, 852, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(8, 1, 0, 581, 492, 448, 2, 452, 0, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(45, 1, 1, 667, 661, 683, 1, 446, 404, 2, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(15, 1, 0, 625, 419, 657, 0, 0, 887, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(56, 1, 1, 586, 341, 824, 3, 417, 361, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(40, 1, 0, 654, 438, 0, 1, 0, 415, 2, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(118, 1, 1, 712, 261, 735, 1, 423, 450, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(073, 1, 1, 2223, 379, 752, 0, 435, 438, 2, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(63, 1, 1, 6514, 0, 643, 3, 816, 756, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(064, 1, 1, 674, 401, 663, 9, 560, 900, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(92, 1, 1, 701, 532, 688, 3, 396, 372, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(037, 1, 0, 610, 504, 623, 3, 0, 877, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(95, 1, -1, 538, 325, 601, 2, 702, 634, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(9, 1, 1, 686, 483, 672, 1, 465, 475, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(47, 1, 1, 1325, 360, 668, 2, 817, 803, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(82, 1, 0, 729, 462, 0, 1, 449, 818, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(64, 1, 1, 2672, 326, 714, 2, 18, 609, 2, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(96, 1, 1, 0, 535, 627, 1, 329, 0, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(58, 1, 0, 707, 0, 703, 0, 901, 906, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(32, 1, 1, 654, 413, 710, 2, 306, 375, -1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(122, 1, 1, 705, 374, 716, 1, 0, 547, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(022, 1, 0, 716, 503, -1, 1, 629, 815, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(109, 1, 1, 557, 344, 639, 0, 370, -100, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(64, -1, 0, 561, 530, 592, 1, 593, 619, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(56, 1, 1, 546, 603, 603, 0, 0, 796, 2, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(11, 1, 0, 691, 350, 0, 0, 619, 0, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(149, 1, 1, 606, 399, 602, 1, 441, 369, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(96, 1, 0, 714, 496, 682, 1, 944, 908, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(39, 0, 1, 1310, 948, 653, 0, 0, 922, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(06, 1, 0, 744, 0, 349, 2, 839, -100, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(032, 1, 0, 707, 389, 727, 1, 297, 0, 2, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(54, 1, 1, 4049, 773, 654, 2, 595, 625, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(159, 0, 1, 672, 298, 178, 2, 468, 0, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(52, 1, 1, 733, 398, 746, 3, 328, 0, 0, 2, 9), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(143, 0, 0, 604, 365, 0, 1, 451, 458, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1, 1, 1, 604, 607, 622, 0, 0, 0, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(43, 1, 1, 668, 833, 956, 2, 588, 556, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(175, 1, 0, 619, 491, 684, 1, 693, 60, 2, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(84, 1, 1, 566, 870, 578, 2, 969, 694, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(8, 1, 1, 871, 369, 712, 3, 427, 478, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(62, 1, 0, 587, 577, 110, 0, 647, 962, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(074, 1, 0, 0, 305, 666, 3, 306, 356, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(00, 1, 0, 735, 323, 724, 2, 233, 584, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(78, 1, 0, 673, 311, 692, 2, 551, 490, 2, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(13, 1, 1, 711, 538, 0, 1, 363, 398, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(60, 1, 0, -1, 485, 422, 0, 330, 273, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(15, 1, 1, 767, 616, 0, 1, 751, 673, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(0, 1, 0, 692, 465, 646, 3, 872, 825, 2, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(92, 0, 0, 625, 409, 541, 2, 381, 403, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1, 0, 1, 593, 447, 655, 1, 366, 314, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(113, 1, 0, 7965, 430, 596, 1, 820, 876, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(99, 1, 0, 0, 447, 610, 1, 511, 464, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 1, 634, 344, 699, 1, -100, 600, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(74, 0, 1, 651, 539, 671, 1, 955, 997, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(016, 1, 0, 712, 426, 0, 0, 361, 745, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(051, 1, 0, 618, 294, 236, 1, 230, 872, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(32, 1, 1, 583, 513, 601, 0, 0, 928, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(61, 0, 0, 544, 598, 0, 1, 573, 566, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(84, 1, 0, 0, 365, 732, 0, 611, 624, 2, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(95, 0, 0, 593, 451, 568, 2, 981, 0, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(112, 1, 1, 601, 400, 663, 1, 298, 0, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(76, -1, 1, 745, 375, 892, 1, 930, 930, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(063, 1, 0, 662, 0, 592, 3, 416, 346, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(71, 1, 1, 697, 633, 691, 3, 890, 868, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(208, 1, 0, 544, -1, 605, 1, 797, 801, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(185, 1, -1, 710, 378, 674, 3, 604, 554, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(206, 1, 0, 5140, 355, 730, 2, 980, 693, 2, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(155, 1, 0, 603, 349, 514, 3, 816, 863, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(0, 0, 0, 648, 427, 687, 0, 961, 947, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 672, 0, 660, 3, 577, 545, 0, 2, 3), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(48, 1, 0, 680, 511, 428, 3, 0, 314, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(74, 1, 1, 0, 433, 239, 0, -1, 390, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(9, 1, 0, 575, 444, -100, 1, 523, 981, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(80, 0, 1, 669, 562, 387, 1, 0, 951, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(97, 1, 0, 728, 614, 725, 1, 173, 131, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(0, 1, 1, 752, 563, 695, 1, 602, 656, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(004, 1, 0, 0, 393, 597, 1, 450, 743, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(49, 1, 1, 734, 651, 0, 2, 571, 565, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(77, 1, 0, 6281, 379, 700, 0, 594, 0, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(169, 1, 0, 616, 922, 690, 3, 0, 784, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(90, 1, 0, 762, 308, 713, 1, 774, 759, 1, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(170, 1, 1, 605, 569, 629, 2, 662, 665, 0, 2, 9), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(81, 1, 1, 459, 317, 590, 2, 533, 544, 2, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(158, 0, 0, 608, 441, 601, 0, 671, 812, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(0, 1, 0, 1049, 563, 594, 3, 401, 372, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(105, 1, 1, -100, 430, 529, 3, 842, 74, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(80, 1, 1, 3803, 981, 581, 3, 769, 812, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(165, 1, 0, 690, 19, 871, 0, 293, 346, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(0, 1, 0, 570, 620, 611, 0, 992, 1023, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(105, 0, 0, 584, 450, 293, 1, 755, 638, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(66, -1, 1, 3658, 196, 660, 1, 0, 452, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(39, 1, 0, 8459, 370, 678, 1, 737, 810, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(36, 1, 0, 637, -1, 0, 0, 984, 1003, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(03, 1, 1, 684, 368, 661, 0, 725, 0, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(8, 0, 0, 613, 38, 564, 1, 775, 835, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(196, 0, -1, 688, 398, 663, 0, 485, 434, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(055, 1, 0, 9520, 512, 686, 3, 0, 368, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, -1, 1, 737, 0, 708, 1, 907, 371, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(25, 1, 1, 783, 329, 499, 3, 931, 914, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(69, 1, 0, 719, 330, 690, 1, 932, -1, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(072, 1, 1, 0, 457, 603, 0, 481, 759, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(101, 1, 1, 713, 422, 0, 3, 785, 778, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(119, 1, 1, 586, 386, 221, 2, 830, 979, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(32, 1, -1, 82, 314, 0, 2, 0, 806, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(67, 1, 1, 726, 767, 714, 2, 0, 798, 2, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(188, 1, 1, 590, 758, 610, 1, 691, 669, 2, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(030, 1, 1, 743, 536, 737, 3, 597, 754, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1, 1, 0, 5409, 534, 551, 0, 175, 764, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(80, 1, 1, 651, 496, 696, 2, 716, 283, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(56, 1, 1, 612, 513, 543, 1, 0, 285, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(90, 1, 1, 9671, 622, 173, 2, 0, 766, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(100, 1, 1, 650, 497, 655, 3, 806, 764, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(59, 1, 0, 5966, 544, 494, 2, 965, 955, -1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(36, 1, 0, 637, 352, 716, 1, 335, -100, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(22, 1, 0, 583, 576, 558, 1, 435, 474, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(67, 1, 0, 2215, 354, 582, 0, 999, 0, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(37, 1, 0, 605, 0, 554, 0, 633, 622, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(94, 1, 1, 770, 455, 751, 0, 610, -1, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(057, 1, 0, 0, 379, 614, 0, 812, 799, 0, 2, -1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(36, 0, 1, 7870, 571, 700, 3, 469, 438, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(90, 1, 0, 626, 252, 676, 3, 366, 611, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(58, 1, 0, 4251, 551, 721, 1, 617, 588, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(95, 1, 1, 1372, 334, 686, 3, 559, 381, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(42, 0, 0, 631, 599, 623, 3, 910, 875, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(02, 1, 0, 695, 889, 0, 0, 412, 469, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(81, 1, 0, 1904, 340, 904, 3, 344, 360, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(45, 1, 0, 720, 292, 692, 1, 890, 888, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(96, 1, 0, 592, 405, 882, 1, 466, 549, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(32, 1, 0, 9715, 387, 665, 1, 899, 800, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(51, 1, 0, -1, 571, 599, 2, 41, 514, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(98, 1, 1, 664, 607, 0, -1, 580, 162, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(0, 1, 0, 713, 334, 670, 2, 353, 328, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(03, -1, 0, 654, 507, 11, 3, 611, 600, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(48, 1, 0, 645, 519, 579, 9, 512, 970, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(9, 0, 0, 4907, 421, 657, 1, 665, 0, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(72, 1, 0, 0, 311, 599, 2, 978, 891, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(13, 1, 0, 0, 413, 696, 3, 794, 743, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(92, 1, 1, 2461, 931, 0, 2, 647, 715, 2, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1, 1, 0, 655, 565, 658, 0, 858, 870, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(106, 0, 0, 521, 0, 592, 2, 220, 0, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(46, 1, 0, 653, 345, 667, 3, 386, 153, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(83, 1, 1, 8310, 300, 0, 1, 0, 0, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(100, 0, 0, 636, 630, 0, 0, 467, 507, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(69, 1, 1, 579, 703, 109, 3, 432, 500, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(17, 1, -1, 641, 433, 500, 2, 145, 0, 2, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(99, 1, 0, -1, 311, 0, 1, 705, 854, 2, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1, 1, 1, 685, 442, -1, 2, 338, 364, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(44, 1, 0, 683, 0, 663, 2, 361, 725, 2, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(33, 1, 0, 696, 228, 704, 3, 693, 638, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(33, 0, 0, 730, 717, 747, 1, 767, 288, 2, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(53, 1, 0, 605, 619, 554, 3, 913, 601, 2, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(115, 1, 1, 739, 422, 739, 2, 528, 534, 3, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(26, 1, 0, 590, 50, 532, 3, 957, 922, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(75, -1, 0, 656, 506, 655, 0, 564, 590, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(179, 1, 0, 697, 805, 691, 0, 594, 213, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(166, 1, 1, 0, 352, 748, 3, 297, 318, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(32, 1, 1, 564, 333, 0, 1, 862, 601, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(0, 1, 0, 743, 318, 747, 2, 694, 726, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(29, 1, 0, 0, 464, 314, 3, 784, 809, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(195, 1, 0, 0, 460, 666, 3, 509, 492, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(90, 1, 1, 719, 436, 697, 1, 681, 417, 2, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(78, 1, 0, 681, 131, 650, 1, 855, 816, 2, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(0, 1, 0, 634, 577, 673, 2, 527, 635, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1, 1, 1, 513, 194, 552, 0, 0, 331, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(16, 0, 1, 752, 604, 702, 0, 459, 857, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(129, 1, 0, 665, 586, 225, 2, 785, 973, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(017, 1, 0, 666, 369, 646, 3, -1, 772, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(124, 1, 0, 605, 233, 507, 1, 0, 409, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(8, 1, 1, 685, 588, 718, 3, 17, 883, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(83, 1, 1, 0, 636, 741, 2, 460, 275, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 728, 533, 660, 2, 481, 496, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(11, 1, 0, 660, 667, 0, 1, 936, 924, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(036, 0, 0, 586, 585, 304, 0, 505, 578, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(81, 1, -1, 740, 521, 722, 3, 311, 958, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(173, 1, 0, 5952, 576, 657, 0, 292, 741, 2, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(30, 1, 0, 642, 311, 0, 3, 0, 699, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(108, 1, 0, 772, 879, 723, 0, 286, 340, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(0, 1, 0, 592, 607, 626, 1, 586, 642, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(0, 1, 1, 771, 401, 503, 2, 513, 822, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(19, 0, 1, 6630, 400, 631, 0, 416, 384, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1, 1, 0, -100, 606, 721, 3, 927, 947, 2, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(15, 0, 0, 721, 613, 784, 2, 330, 356, 2, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(16, 1, 0, 706, 496, 737, 1, 917, 908, -1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(150, 1, 1, 594, -100, 533, 2, 494, 548, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(0, 1, 0, 767, 593, 798, 2, 657, 678, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(33, 0, 1, 648, 385, 621, 0, 446, 0, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(91, 0, 0, 6052, 411, 45, 0, 1028, 977, 2, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(58, -1, 0, 643, 495, 661, 0, 1001, 978, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(93, 0, 1, 639, 352, 609, 1, 470, 793, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(25, 1, 1, 625, 491, 584, 0, 421, 592, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(10, 1, 0, 0, 296, 50, 1, 446, -1, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(55, 1, 0, 4592, 49, 290, 0, 627, 617, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 638, 378, 0, 2, 0, 842, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(73, 1, 0, 667, 0, 623, 0, 651, 671, 1, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(134, 0, 0, 559, 587, 0, 0, 1003, 0, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(17, 1, 0, 566, 402, 603, 2, 348, 760, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(10, 0, 0, 0, 587, 665, 3, 673, 722, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1, 1, 0, 631, 461, 0, 0, 645, 604, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(046, 1, -1, 565, 505, 553, 1, -100, 975, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(32, 1, 0, 562, 347, 788, 0, 0, 785, 2, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(21, 1, 1, 6021, 353, 718, 1, 320, 561, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(89, -1, 0, 707, 518, 636, 3, 137, 0, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(49, 0, 0, 645, 347, 702, 1, 502, 76, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(57, 1, 0, 666, 0, 613, 0, 840, 976, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(88, 0, 0, 0, 561, 594, 0, 713, 675, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(12, 1, 0, 555, 479, 560, 4, 0, 651, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(046, 0, 0, 8338, 578, 663, 3, 936, 892, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(153, 1, 1, 745, 861, 0, 1, 748, 566, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(24, 1, 0, 0, 519, 426, 1, 357, 694, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(15, 1, 0, 582, 0, 543, 0, 906, 897, 2, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(188, 1, 0, 592, 426, 979, 1, 911, -1, 2, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(0, 0, 1, 6241, 380, 757, 3, 0, 890, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(132, 1, 0, 0, 607, 565, 1, 351, 593, 2, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(13, 1, 1, 694, 381, 722, 0, 357, 0, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(075, 1, 1, 515, 0, 611, 1, 830, 0, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(140, 1, 1, 9266, 412, 763, 0, 344, 384, 2, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(33, 0, 0, 636, 533, 661, 0, 573, 553, 2, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(000, 0, 0, -100, 566, 687, 1, 477, 241, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(022, 1, 0, 647, 988, 694, 1, 0, 0, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(07, 1, 0, 603, 447, 688, -1, 787, 829, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1, 1, 0, 538, 409, 0, 2, 474, 479, 2, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(27, 0, 0, 697, 398, 828, -1, 915, 919, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(92, 1, 1, 1424, 630, 0, 3, 550, 586, 0, 2, 3), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(64, 1, 0, 9447, 619, 0, 3, 747, 769, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(64, 0, 1, 693, 536, 655, 1, -100, 0, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(101, 0, 1, 4426, 372, 625, 1, 518, 566, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(90, 1, 0, 3344, 502, 537, 1, 417, 578, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(54, 1, 0, 642, 514, 661, 2, 999, 0, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(74, 0, 0, 0, 623, 664, 0, 817, 807, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(41, 1, 0, 5872, 449, 649, 2, 0, -1, 2, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(39, 1, 0, 7, 609, 597, 3, 0, 343, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(81, -1, 1, 9974, 308, 564, 2, 391, 396, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(89, 1, 1, 635, 557, 720, 4, 694, 0, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(9, 1, 1, 606, 320, 530, 2, 0, 0, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(8, 1, 0, 531, 628, 547, 3, -1, 482, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(200, 0, 1, 626, 534, 642, 0, 758, 744, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(181, 0, 0, 714, 351, 781, 0, 419, 0, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(0, 1, 0, 734, 330, 755, 3, 831, 892, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(94, 0, 1, 7341, 364, 742, 0, 606, 659, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(86, 0, 1, 790, 79, 0, 0, 689, 677, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1, 1, 0, 1231, 543, 671, 2, 545, 545, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(90, 1, 0, 0, 577, 622, 0, 0, 284, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(95, 1, 0, 560, 0, 578, 3, 807, 988, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(7, 1, 1, 685, 497, 668, 3, 812, 817, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(157, 0, 0, 766, 480, 432, 3, 0, 0, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(59, 1, 0, 0, 865, 578, 3, 452, 538, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(046, 1, 0, 531, 505, 557, 2, 261, 0, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(24, 0, 1, 662, 0, 0, 0, 762, 728, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(89, 1, 1, 714, 693, 746, 2, 960, 903, 0, 2, 9), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(77, 0, 0, 5169, 412, 572, 3, 801, 797, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(19, 1, 0, 0, 480, 0, 0, 928, 0, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(79, 1, 1, 793, 310, -1, 2, 622, 593, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(35, 1, 0, 585, -1, 0, 1, 0, 971, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(0, 0, 0, 621, 413, 714, 2, 416, 360, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1, 1, 0, 770, 600, 0, 0, 401, 359, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(74, 1, 0, 679, 472, 655, 3, 523, -1, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(041, 1, -1, 0, 494, 660, 3, 68, 546, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(136, 1, 0, 600, 151, 0, 2, 699, 867, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1, 1, 1, 679, 532, 628, 3, 0, 360, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(90, 1, 1, 0, 523, 931, 1, 880, 866, 2, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(70, 1, 1, 620, 469, 126, 0, 0, 0, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(195, 1, 1, 622, 378, 621, 2, 520, 0, 2, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 0, 0, 573, 887, 599, 1, 0, 874, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(29, 0, 1, 615, 603, 663, 0, 897, 874, -1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(145, 1, 0, 718, 520, 628, 0, 639, 0, 3, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(23, -1, 0, 683, 461, 732, 3, 634, 671, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(74, 0, 0, 654, 427, 636, 1, 0, 0, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(53, 1, 1, 688, 592, 709, 3, 883, 849, 0, 1, -1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(87, 0, 1, 740, 67, 735, 3, 330, 326, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(52, 1, 0, 694, 586, 708, 1, -100, 621, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(47, 1, 0, 626, 888, 580, 1, 0, 172, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(99, 1, 1, 670, 349, 680, 3, 729, 789, 2, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(41, 1, 0, 0, 351, 719, 3, 485, 0, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(29, 0, 0, 0, 408, 754, 0, 211, 941, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(91, 0, 0, 0, 548, 737, 1, 410, 364, 1, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(0, 0, 1, 604, 473, 650, 3, 536, 0, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(002, 1, 0, 706, 306, 668, 2, 0, -100, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(19, 1, 1, 9386, 518, 775, 1, 707, 726, 2, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(077, 1, -1, 593, 324, 636, 2, 0, 448, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(22, 1, 1, 701, 453, 872, 2, 851, 849, 0, 2, 9), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(25, 1, -1, 650, 432, 655, 0, 859, 891, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(162, 1, 1, 1025, 344, 631, 3, 453, 466, 0, 2, 4), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(78, 1, 0, 581, 567, 655, 3, 637, 906, 2, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(77, 1, 0, 646, 616, 628, 2, 904, 0, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(82, 1, 0, 0, 418, 610, 1, 0, 618, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(84, 1, 1, 995, 501, 604, 2, 0, 482, -1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(013, 1, 0, 643, 373, 706, 3, 0, 808, 2, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1, 1, 0, 706, 291, 643, 1, 644, 564, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(0, 1, 0, 552, 382, 612, 1, 0, 754, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(33, 1, 1, 590, 341, 589, 3, 534, 620, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(06, 1, 1, 4649, 316, 935, 3, 605, 850, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(0, 1, 1, 2311, 594, 715, 3, 906, 926, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(95, 1, 1, 756, 419, 339, 0, 0, 540, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(50, 1, 0, 187, 443, 542, 0, 410, 407, 4, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(78, 1, 1, 0, 321, 0, 2, 550, 596, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(146, 0, 0, 0, 550, 530, 2, 899, 857, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(62, 1, 0, 0, 383, 0, 2, 474, 721, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(57, 1, 1, 692, 581, 640, 1, 840, 841, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(92, 0, 0, 0, 439, 655, 3, 852, 539, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(165, 1, 0, 592, -1, 605, 0, 0, 596, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(60, 1, -1, 0, 314, 0, 3, 452, 423, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(48, 0, 1, 584, 415, 574, 3, 665, 642, 2, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(100, 0, 0, 1879, 547, 626, 0, 854, 875, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(15, 0, 0, 2299, 456, 549, 0, 748, 0, 2, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(117, 0, 1, 0, 569, 0, 2, 716, 741, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 1, 563, 554, 999, 1, 0, 615, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(80, 1, 0, 6500, 579, -1, 1, 730, 683, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(63, 1, 1, 0, 387, 590, 1, 907, 867, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(90, 1, 1, 0, 325, 0, 0, 727, 665, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(52, 1, 0, 588, 0, 774, 0, 593, 639, -1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(19, 1, 0, 4248, 0, 551, 2, 544, 550, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(74, 1, 0, 611, 978, 521, 3, 0, 962, 2, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1, 1, 1, 576, 500, 0, 0, 641, 883, 4, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(68, 1, 1, 729, 501, 740, 3, 1017, 0, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(84, 1, 1, 704, 538, 707, 2, 0, -1, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(35, 1, 0, 4528, 388, 0, 0, 853, 956, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(58, 1, 1, 365, 560, 652, 1, 0, 682, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(032, 1, 1, 7944, 330, 0, 1, 361, 0, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(87, 1, 0, 642, 606, 0, 0, 413, 0, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(94, 1, 0, 647, 755, 410, 0, 564, 548, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(11, 1, 0, 527, 516, 541, 0, 0, 465, 2, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(54, 1, 0, 0, 335, 604, 3, 531, 453, 3, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(56, 0, 1, 5631, 380, 590, 0, 961, 695, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(6, 0, 0, 622, 340, 620, 1, 0, 423, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(16, 1, 1, 618, 341, 767, 1, 0, 0, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(53, 1, 1, 620, 583, 650, 1, 826, 779, 2, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(72, 1, 1, 0, 669, 561, 1, 955, 931, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(119, 0, 0, 749, 332, 696, 1, 533, 526, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(032, 1, 0, 5936, 652, 0, 2, 893, 920, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(03, 1, 1, 577, 396, -100, 2, 314, 515, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(130, 1, 1, 8164, 493, 665, 2, 421, 424, 0, 2, -1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1, 1, 1, 9836, 458, 698, 2, 530, 552, 2, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(141, 0, 1, 687, 434, 690, 0, 0, 438, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(92, 0, 1, 650, 353, 2, 3, 408, 435, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(14, -1, 1, 652, 309, 705, 2, 716, 687, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(22, 1, 0, 693, 573, 674, 1, 862, 822, 0, 2, 3), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(89, 1, 0, 0, 587, 0, 0, 449, -100, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(86, 1, 1, 535, 478, 521, 2, 934, 874, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(9, 1, 1, 8407, 595, 583, 2, 560, 485, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(98, 1, 0, 688, 0, 741, 1, 703, 44, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(154, 1, 1, 552, 433, 593, 4, 727, 829, 0, 2, 9), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(56, 1, 1, 574, -100, 515, 3, 941, 674, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(034, 1, 0, 642, 397, 581, 1, 445, -1, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(40, 1, 1, 0, 515, 573, 0, 0, 54, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(57, 1, 0, 0, 527, 205, 3, 698, 750, 2, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(97, 1, 1, 685, 603, 656, 2, 501, 991, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(93, 1, 1, 8753, 425, 622, 1, 744, 0, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(84, 1, 0, 58, 197, 731, 2, 547, 984, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(156, 1, 1, 9408, 599, 0, 0, 904, 902, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(21, 1, 0, 690, 438, 613, 2, 0, 991, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(0, 1, 0, 709, 851, 776, 3, 214, 588, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(100, 1, 1, 753, 474, 747, 1, 920, 420, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(33, 1, 1, 611, 507, 0, 2, 801, 860, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(88, 1, 1, -1, 312, 655, 2, 749, 734, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(171, 0, 1, 718, 630, 688, 3, 252, 769, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(065, 1, 0, -1, 597, 582, 3, 840, 881, 2, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(19, 1, -1, 746, 349, 961, 0, 0, 868, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(11, 1, 0, -1, 549, -100, 3, 396, 383, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(001, 1, 1, 737, -100, 741, 1, 828, 0, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(90, 1, 0, 610, 325, 417, 1, 578, 287, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(062, 1, 1, 1941, 575, 682, 3, 872, 880, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(04, 1, 0, 652, 354, 0, 2, 371, 323, 2, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(130, 0, 0, 581, 426, 657, 0, 848, 0, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(24, 0, 0, 770, 424, 756, 2, 0, 0, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(129, 1, 1, 2950, 208, 669, 1, 724, 512, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(99, 1, 1, 654, 522, 0, 0, 659, 399, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(54, 1, 0, 672, 625, 744, 2, 732, 810, 2, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(72, 1, 1, 460, 299, 688, 1, 440, 0, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(0, 1, 1, 522, 555, 530, 1, 933, 914, 2, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 782, 524, 0, 3, 381, 435, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(0, 0, 0, 598, 440, 637, 2, 437, 455, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(17, 0, 1, 0, 364, 15, 0, 886, 851, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(157, 1, 1, 0, 563, 797, 2, 459, 58, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(151, 1, 0, 578, 611, 0, 0, 331, 378, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(149, 1, 1, 0, 527, 607, 3, 818, 860, 2, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(79, 1, 0, 613, 397, 0, 3, 524, 477, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(49, 1, 0, 648, 515, 619, 2, 0, 825, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(78, 1, 0, 589, 605, 584, 1, -1, 323, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(03, 0, 1, 660, 612, 703, 1, 867, 883, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(159, 1, 0, 730, 910, 738, 0, 740, 747, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(156, 1, 0, 693, 104, 674, 2, 499, 883, 2, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(86, 0, 0, 5515, 447, 700, 3, 478, 597, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(107, 1, 1, 665, 853, 701, 0, 653, 892, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(55, 1, 0, 749, 487, 139, 2, 477, 850, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(184, -1, 0, 0, 391, 534, 3, 491, 476, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(79, 0, 0, 0, -100, 728, 0, 517, 507, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(26, 1, 0, 655, 326, 577, 0, 0, 425, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(23, 1, 0, 4964, 498, 697, 3, 780, 810, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(84, 1, 1, 703, 387, 726, 3, 384, 0, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(88, 1, 0, 622, 496, 613, 1, 379, 404, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(39, -1, 1, 630, 618, 0, 3, 0, 801, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(185, 1, 1, 595, 0, 534, 1, 560, 0, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(00, 1, 0, 575, 415, -1, 0, 795, 796, 2, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 1, 585, 445, 533, 0, 209, 848, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(20, 1, 1, 561, 0, 599, 2, 993, 817, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(189, 1, 1, 753, 620, 761, 2, 0, 185, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(10, 1, 1, 722, 601, 707, 3, 0, 0, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(86, 1, 1, 618, 321, 595, 1, 0, 418, 0, 1, 4), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(79, 1, 1, 631, 547, 663, 2, 401, 314, 4, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(04, 1, 0, 707, 601, 741, 1, 695, 652, 2, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(97, 0, 0, 8545, 149, 589, 3, 278, 280, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(100, 1, 0, 1362, 527, 922, 2, 437, 358, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 1, 7468, 524, 693, 1, 830, 0, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(0, 1, 0, 7119, 153, 556, 2, 836, 841, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(006, 0, -1, 8234, 374, 598, 1, 811, 514, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(30, 1, 0, -1, 473, 631, 3, 22, 0, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(04, 1, 0, 530, 438, 0, 2, 951, 0, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(38, 0, 1, 545, 325, 589, 1, 900, 798, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(0, 1, -1, 0, 388, 737, 3, 0, 470, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(053, 1, 0, 6178, 547, 127, 0, 518, 489, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(10, 1, 1, 611, 0, 616, 1, 541, 578, 9, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(99, 1, 1, -100, 601, 571, 3, 618, 595, 4, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(85, 1, 1, 1017, 510, 614, 0, 595, 614, 2, 2, 4), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(50, 1, 1, 0, 197, 701, 0, 682, 711, 0, 2, -1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(015, 0, 1, 600, 526, 629, 1, 569, 0, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(100, 0, 1, 3803, 419, 630, 3, -1, 437, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(98, 0, 0, 639, 0, 327, 1, 411, 374, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(118, 0, 1, 725, 0, 756, 2, 860, 846, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(52, 1, 0, -100, 478, 779, 0, 356, 371, -1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(98, 1, 0, 3071, 59, 307, 0, 849, 904, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 615, -100, 591, 2, 889, -1, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(28, 1, 0, 706, 1, 976, 0, 417, 652, 2, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(13, 1, 1, 661, -100, 255, 3, 0, 668, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 0, 1, 754, 390, 215, 0, 250, 830, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(17, 0, 1, 640, 441, 662, 1, 677, 528, 4, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(66, 1, 0, 719, 300, 700, 3, 406, 378, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(19, 1, 0, 715, 292, 212, 0, 322, 341, 0, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(39, 1, 1, 532, 534, -100, 2, 335, 971, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(90, 1, 1, 724, 567, 715, 1, 1011, 1021, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(100, 1, 1, 680, 602, 702, 0, 831, 860, 2, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(85, 1, 0, 586, 0, 601, 1, 646, 701, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(679, 1, 1, 541, 338, 5123, 0, 641, 641, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(644, 1, 1, 1886, 596, 2348, 0, 741, 400, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(722, 1, 1, 1415, 245, 316, 0, 401, 739, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(722, 1, 1, 1415, 275, 316, 0, 401, 799, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(782, 1, 1, 513, 224, 5295, 0, 641, 639, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(782, 1, 1, 413, 224, 4295, 0, 641, 639, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(786, 1, 1, 383, 548, 5870, 0, 639, 399, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(786, 1, 1, 383, 448, 4870, 0, 639, 399, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(638, 1, 0, 2578, 156, 3757, 0, 400, 399, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(638, 1, 0, 2278, 156, 3757, 0, 650, 399, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(727, 1, 1, 1935, 339, 968, 0, 399, 740, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(927, 1, 1, 4902, 351, 2093, 0, 739, 740, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(927, 1, 1, 4702, 251, 1093, 0, 739, 740, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(867, 1, 1, 1774, 101, 2204, 0, 499, 499, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(867, 1, 1, 1674, 101, 2104, 0, 499, 499, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(653, 1, 0, 3203, 448, 1267, 0, 541, 641, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(653, 1, 0, 3203, 448, 1267, 0, 541, 641, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(653, 1, 0, 632, 167, 203, 0, 401, 401, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(958, 1, 1, 2297, 574, 4253, 0, 399, 400, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(958, 1, 1, 2297, 574, 4253, 0, 399, 300, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(958, 1, 1, 2297, 574, 4253, 0, 399, 300, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(635, 1, 0, 1142, 411, 4704, 1, 740, 500, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(635, 1, 0, 1142, 511, 2704, 1, 740, 500, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(635, 1, 0, 1142, 511, 2704, 1, 740, 500, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(635, 1, 0, 1142, 511, 1704, 1, 740, 500, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(635, 1, 0, 1142, 411, 1704, 1, 740, 500, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(675, 1, 0, 1142, 411, 1704, 1, 740, 500, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(675, 1, 0, 1142, 411, 1704, 1, 640, 500, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(675, 1, 1, 1142, 411, 1704, 1, 640, 500, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(775, 1, 1, 1142, 411, 1704, 1, 640, 500, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(775, 1, 1, 1142, 411, 1704, 1, 540, 500, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(775, 1, 1, 1142, 411, 1504, 1, 540, 500, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(775, 1, 1, 1042, 411, 1504, 1, 540, 500, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(775, 1, 1, 942, 411, 1504, 1, 540, 500, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(775, 1, 1, 942, 311, 1504, 1, 540, 500, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(775, 1, 1, 942, 211, 1504, 1, 540, 500, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(775, 1, 1, 942, 211, 1204, 1, 540, 500, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(644, 1, 1, 1986, 596, 2448, 0, 741, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(644, 1, 0, 1986, 596, 2448, 0, 741, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(644, 1, 0, 1786, 596, 2448, 0, 741, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(644, 1, 0, 1786, 596, 2248, 0, 741, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(644, 1, 0, 1786, 596, 2248, 0, 721, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(624, 1, 0, 1786, 596, 2248, 0, 721, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(624, 1, 0, 1786, 496, 2248, 0, 721, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(624, 1, 0, 1286, 496, 2248, 0, 721, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(624, 1, 0, 1086, 496, 2248, 0, 721, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(604, 1, 0, 1086, 496, 2248, 0, 721, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(604, 1, 0, 1086, 496, 1248, 0, 721, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(604, 1, 0, 1086, 396, 1248, 0, 721, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(958, 1, 0, 2597, 574, 4253, 0, 399, 400, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(958, 1, 0, 2597, 574, 4253, 0, 379, 400, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(958, 1, 0, 2597, 574, 4253, 0, 379, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(958, 1, 0, 2597, 574, 3253, 0, 379, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(958, 1, 0, 2597, 474, 3253, 0, 379, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(958, 1, 0, 2597, 474, 3253, 0, 379, 400, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(958, 1, 1, 2597, 574, 4253, 0, 399, 400, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(939, 1, 1, 532, 434, -100, 2, 335, 971, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(939, 1, 1, 532, 434, 0, 2, 335, 971, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(939, 1, 0, 532, 434, 0, 2, 335, 971, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(839, 1, 0, 532, 434, 0, 2, 335, 971, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(839, 1, 0, 532, 234, 0, 2, 335, 971, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(839, 1, 0, 532, 234, 0, 2, 325, 971, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(820, 1, 1, 561, 0, 599, 2, 993, 817, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(820, 1, 0, 561, 0, 599, 2, 993, 817, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(820, 1, 0, 561, 0, 599, 2, 893, 817, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(720, 1, 0, 561, 0, 599, 2, 893, 817, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(720, 1, 0, 461, 0, 599, 2, 893, 817, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(655, 1, 0, 749, 487, 139, 2, 477, 850, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(655, 1, 0, 749, 487, 139, 2, 477, 850, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(655, 1, 1, 749, 487, 139, 2, 477, 850, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(655, 1, 0, 749, 387, 139, 2, 477, 850, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(755, 1, 0, 749, 387, 139, 2, 477, 850, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(755, 1, 0, 649, 387, 139, 2, 477, 850, 1, 2, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(698, 1, 0, 3071, 59, 307, 0, 849, 904, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(698, 1, 0, 2071, 59, 307, 0, 849, 904, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(698, 1, 0, 2071, 49, 307, 0, 849, 904, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(798, 1, 0, 2071, 49, 307, 0, 849, 904, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(798, 1, 1, 2071, 49, 307, 0, 849, 904, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(700, 1, 0, 575, 415, 1, 0, 795, 796, 2, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(700, 1, 1, 575, 415, 1, 0, 795, 796, 2, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(700, 1, 1, 575, 415, 1, 0, 795, 796, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(700, 1, 1, 275, 415, 1, 0, 795, 796, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(700, 1, 1, 275, 415, 1, 0, 695, 796, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(800, 1, 1, 275, 415, 1, 0, 695, 796, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1062, 1, 0, 1941, 575, 682, 3, 872, 880, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1062, 1, 0, 1941, 545, 582, 3, 872, 880, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1062, 1, 0, 1941, 545, 582, 2, 872, 880, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1062, 1, 0, 1941, 545, 582, 2, 772, 880, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1062, 1, 0, 1941, 545, 582, 2, 772, 780, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1062, 1, 1, 1941, 545, 582, 2, 772, 780, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1062, 1, 0, 1941, 445, 582, 2, 772, 780, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1062, 1, 0, 1241, 445, 582, 2, 772, 780, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1062, 1, 0, 1241, 445, 582, 2, 712, 780, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(935, 1, 0, 3528, 388, 0, 0, 853, 956, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(935, 1, 0, 3528, 288, 0, 0, 853, 956, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(935, 1, 1, 3528, 288, 0, 0, 853, 956, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(935, 1, 1, 3528, 288, 0, 0, 853, 956, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(935, 1, 1, 2528, 288, 0, 0, 853, 956, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(757, 1, 0, 692, 581, 640, 1, 840, 841, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(757, 1, 0, 692, 581, 640, 1, 840, 841, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(757, 1, 1, 692, 481, 640, 1, 840, 841, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(757, 1, 1, 692, 481, 640, 2, 840, 841, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(757, 1, 1, 692, 481, 640, 2, 840, 891, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(913, 1, 0, 661, -100, 255, 3, 0, 668, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(913, 1, 0, 661, 0, 255, 3, 0, 668, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(913, 1, 0, 661, 0, 255, 3, 0, 368, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(913, 1, 0, 661, 0, 255, 3, 1, 368, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(913, 1, 0, 661, 0, 255, 3, 100, 368, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(713, 1, 0, 661, 0, 255, 3, 100, 368, 0, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(713, 1, 0, 661, 0, 255, 3, 100, 368, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(713, 1, 0, 661, 0, 255, 3, 100, 228, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(613, 1, 0, 661, 0, 255, 3, 100, 228, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(613, 1, 0, 661, 0, 155, 3, 100, 228, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(613, 1, 0, 561, 0, 155, 3, 100, 228, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(613, 1, 0, 461, 0, 155, 3, 100, 228, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(613, 1, 0, 461, 0, 55, 3, 100, 228, 1, 2, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(758, 1, 1, 2597, 574, 4253, 0, 399, 400, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1058, 1, 1, 2597, 574, 4253, 0, 399, 400, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1058, 1, 1, 2597, 574, 3253, 0, 399, 400, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1058, 1, 1, 2597, 274, 3253, 0, 399, 400, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1058, 1, 0, 2597, 274, 3253, 0, 399, 400, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1058, 1, 0, 2597, 174, 3253, 0, 399, 400, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1058, 1, 0, 1597, 174, 3253, 0, 399, 400, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1058, 1, 0, 1597, 174, 4253, 0, 399, 400, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(1058, 1, 0, 1597, 174, 7253, 0, 399, 400, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(775, 1, 1, 942, 211, 5204, 1, 540, 500, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(775, 1, 1, 642, 211, 5204, 1, 540, 500, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(775, 1, 0, 642, 211, 5204, 1, 540, 500, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(605, 1, 0, 1142, 511, 4704, 1, 740, 500, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(611, 1, 1, 1142, 511, 4704, 1, 740, 500, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(611, 1, 1, 1142, 511, 4704, 1, 740, 500, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(604, 1, 0, 1086, 496, 8248, 0, 721, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(604, 1, 0, 1086, 196, 8248, 0, 721, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(604, 1, 0, 1111, 196, 8248, 0, 721, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(604, 1, 0, 1111, 196, 8248, 0, 721, 400, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(604, 1, 0, 911, 196, 8248, 0, 721, 400, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(604, 1, 0, 911, 96, 8248, 0, 721, 400, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(604, 1, 1, 911, 96, 8248, 0, 721, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(58, 1, 0, 1597, 174, 3253, 0, 399, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(58, 1, 0, 597, 174, 3253, 0, 399, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(58, 1, 0, 597, 174, 3253, 0, 399, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(58, 1, 0, 597, 64, 3253, 0, 399, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(58, 1, 0, 497, 64, 3253, 0, 399, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(58, 1, 0, 497, 64, 3253, 0, 399, 200, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(58, 1, 0, 797, 64, 3253, 0, 399, 200, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(58, 1, 0, 797, 64, 3253, 0, 399, 100, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(58, 1, 0, 997, 64, 3253, 0, 399, 120, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 0, 917, 64, 2253, 0, 399, 120, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 0, 917, 64, 2153, 0, 299, 126, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 0, 917, 64, 1153, 0, 299, 126, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 0, 917, 64, 1153, 0, 299, 126, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 0, 717, 64, 1153, 0, 299, 126, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 0, 717, 34, 1153, 0, 299, 126, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 0, 717, 34, 1153, 0, 229, 126, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 0, 717, 334, 1153, 0, 229, 126, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(58, 1, 0, 997, 174, 7253, 0, 399, 400, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(58, 1, 0, 997, 174, 7253, 0, 329, 400, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(258, 1, 0, 897, 174, 7253, 1, 629, 500, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(558, 1, 0, 897, 174, 7253, 2, 729, 640, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(558, 1, 0, 697, 174, 7253, 2, 729, 640, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(558, 1, 0, 697, 174, 7253, 2, 729, 640, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(558, 1, 1, 697, 174, 7253, 2, 729, 640, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(558, 1, 1, 697, 174, 7253, 2, 929, 640, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(558, 1, 1, 697, 174, 7253, 3, 929, 740, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(558, 1, 1, 697, 174, 7253, 3, 741, 740, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 697, 174, 7253, 3, 741, 740, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 697, 174, 753, 3, 741, 740, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 697, 174, 753, 3, 749, 740, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 343, 30, 545, 0, 565, 321, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 343, 30, 545, 0, 565, 21, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 533, 30, 545, 0, 565, 21, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 533, 30, 545, 1, 565, 21, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 533, 30, 545, 2, 565, 21, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 533, 30, 545, 3, 565, 21, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 533, 30, 545, 3, 565, 421, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 533, 30, 545, 3, 765, 621, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 0, 0, 533, 30, 545, 3, 765, 621, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 533, 730, 545, 3, 765, 621, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(4, 1, 0, 533, 30, 545, 3, 765, 621, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 533, 30, 545, 3, 765, 621, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 533, 30, 545, 3, 765, 621, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 343, 30, 545, 0, 265, 321, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 343, 30, 545, 0, 5, 121, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 533, 30, 545, 0, 65, 421, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 533, 30, 545, 1, 65, 165, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 533, 30, 545, 2, 565, 721, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 533, 30, 545, 3, 565, 621, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 533, 30, 545, 3, 365, 421, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 533, 30, 545, 3, 365, 365, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(58, 1, 0, 997, 174, 7253, 0, 399, 200, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(58, 1, 0, 997, 174, 7253, 0, 329, 100, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(258, 1, 0, 897, 174, 7253, 1, 629, 650, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(558, 1, 0, 897, 174, 7253, 2, 729, 840, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 533, 30, 545, 1, 65, 165, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 533, 30, 545, 1, 65, 165, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 533, 30, 545, 1, 65, 165, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 533, 30, 545, 2, 65, 165, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 533, 30, 545, 3, 65, 165, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 533, 300, 545, 3, 65, 465, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 533, 400, 645, 3, 265, 465, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(034, 1, 0, 533, 400, 645, 3, 265, 465, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(034, 1, 0, 533, 400, 645, 3, 265, 465, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(034, 1, 0, 533, 400, 645, 0, 265, 465, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(034, 1, 0, 433, 400, 645, 0, 265, 465, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 533, 30, 545, 2, 65, 165, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 533, 300, 545, 2, 65, 465, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 533, 400, 645, 2, 265, 465, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(034, 1, 0, 533, 400, 645, 2, 265, 465, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(034, 1, 0, 533, 400, 645, 2, 265, 465, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(034, 1, 0, 533, 400, 645, 2, 265, 465, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(58, 1, 0, 497, 64, 3253, 2, 399, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(58, 1, 0, 497, 64, 3253, 2, 399, 200, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(58, 1, 0, 797, 64, 3253, 2, 399, 200, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(58, 1, 0, 797, 64, 3253, 2, 399, 100, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(58, 1, 0, 997, 64, 3253, 2, 399, 120, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 0, 917, 64, 2253, 2, 399, 120, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 0, 917, 64, 2153, 2, 299, 126, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 0, 917, 64, 1153, 2, 299, 126, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 0, 917, 64, 1153, 2, 299, 126, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 0, 717, 64, 1153, 2, 299, 126, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 0, 717, 34, 1153, 2, 299, 126, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 0, 717, 34, 1153, 2, 229, 126, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 0, 717, 334, 1153, 2, 229, 126, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(034, 1, 0, 433, 200, 245, 0, 565, 765, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(034, 1, 0, 433, 200, 245, 0, 565, 665, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(034, 1, 0, 433, 200, 245, 0, 565, 665, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(034, 1, 0, 433, 200, 245, 1, 565, 665, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 433, 200, 245, 1, 565, 795, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 433, 200, 245, 1, 565, 795, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 433, 200, 245, 1, 565, 795, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 633, 200, 535, 1, 565, 795, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 633, 200, 535, 2, 665, 795, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 633, 200, 535, 2, 665, 795, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 633, 200, 535, 1, 565, 795, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 633, 200, 535, 0, 565, 795, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 633, 200, 535, 2, 665, 795, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 633, 200, 535, 3, 765, 795, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 633, 200, 535, 3, 765, 995, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 533, 30, 545, 3, 65, 165, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 533, 300, 545, 3, 65, 465, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 533, 400, 645, 3, 265, 465, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(034, 1, 0, 533, 400, 645, 3, 265, 465, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(034, 1, 0, 533, 400, 645, 3, 265, 465, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(034, 1, 0, 533, 400, 645, 3, 265, 465, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(58, 1, 0, 497, 64, 3253, 3, 399, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(58, 1, 0, 497, 64, 3253, 3, 399, 200, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(58, 1, 0, 797, 64, 3253, 3, 399, 200, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(58, 1, 0, 797, 64, 3253, 3, 399, 100, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(58, 1, 0, 997, 64, 3253, 3, 399, 120, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 0, 917, 64, 2253, 3, 399, 120, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 0, 917, 64, 2153, 3, 299, 126, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 0, 917, 64, 1153, 3, 299, 126, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 0, 917, 64, 1153, 3, 299, 126, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 0, 717, 64, 1153, 3, 299, 126, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 0, 717, 34, 1153, 3, 299, 126, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 0, 717, 34, 1153, 3, 229, 126, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 0, 717, 334, 1153, 3, 229, 126, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 633, 200, 535, 0, 565, 795, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 633, 200, 535, 0, 265, 795, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 633, 300, 535, 0, 265, 795, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 633, 300, 535, 0, 665, 795, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 633, 300, 535, 0, 665, 795, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 633, 100, 535, 0, 665, 795, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 633, 100, 535, 0, 665, 795, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 633, 100, 535, 0, 665, 795, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 633, 500, 535, 0, 665, 795, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 633, 500, 335, 0, 665, 795, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 233, 500, 335, 3, 845, 740, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 233, 500, 335, 3, 845, 740, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 233, 500, 335, 3, 845, 740, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 233, 500, 335, 2, 845, 640, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 233, 500, 335, 1, 845, 500, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 233, 500, 335, 0, 845, 400, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 233, 100, 335, 0, 845, 400, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 233, 100, 335, 0, 845, 400, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 233, 100, 335, 0, 445, 400, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 233, 400, 335, 0, 445, 400, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 233, 400, 235, 0, 445, 400, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 233, 400, 234, 0, 445, 400, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 233, 500, 335, 0, 845, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 233, 100, 335, 0, 845, 400, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 233, 100, 335, 0, 845, 400, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 233, 100, 335, 0, 445, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 233, 400, 335, 0, 445, 400, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 233, 400, 235, 0, 445, 400, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 233, 400, 234, 0, 445, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 433, 400, 634, 0, 345, 500, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 433, 400, 634, 0, 345, 500, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 433, 200, 634, 0, 345, 500, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 433, 200, 634, 0, 345, 500, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 433, 200, 634, 0, 345, 500, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 433, 300, 634, 0, 345, 450, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(934, 1, 0, 433, 300, 634, 0, 345, 450, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 633, 200, 535, 2, 565, 795, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 633, 200, 535, 2, 265, 795, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 633, 300, 535, 2, 265, 795, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 633, 300, 535, 2, 665, 795, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 633, 300, 535, 2, 665, 795, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 633, 100, 535, 2, 665, 795, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 633, 100, 535, 2, 665, 795, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 633, 100, 535, 2, 665, 795, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 633, 500, 535, 2, 665, 795, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 633, 500, 335, 2, 665, 795, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 433, 400, 234, 0, 445, 550, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 433, 400, 234, 0, 445, 550, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 433, 400, 234, 0, 445, 550, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 433, 500, 234, 0, 445, 550, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 433, 500, 234, 0, 445, 550, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 433, 500, 334, 0, 445, 550, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 633, 200, 535, 3, 565, 795, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 633, 200, 535, 3, 265, 795, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 633, 300, 535, 3, 265, 795, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 633, 300, 535, 3, 665, 795, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 633, 300, 535, 3, 665, 795, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 633, 100, 535, 3, 665, 795, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 633, 100, 535, 3, 665, 795, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 633, 100, 535, 3, 665, 795, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 633, 500, 535, 3, 665, 795, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 633, 500, 335, 3, 665, 795, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 433, 500, 334, 0, 445, 350, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 433, 500, 334, 0, 445, 350, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 433, 500, 334, 0, 445, 350, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 433, 300, 433, 0, 445, 350, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 433, 400, 433, 0, 445, 350, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 433, 400, 433, 1, 445, 350, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 433, 400, 433, 2, 445, 350, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 433, 400, 433, 3, 445, 350, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 433, 400, 433, 3, 445, 350, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 433, 400, 433, 3, 445, 350, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 433, 500, 433, 3, 445, 350, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 433, 100, 433, 3, 445, 350, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 633, 200, 535, 1, 565, 795, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 633, 200, 535, 1, 265, 795, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 633, 300, 535, 1, 265, 795, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 633, 300, 535, 1, 665, 795, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 633, 300, 535, 1, 665, 795, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 633, 100, 535, 1, 665, 795, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 633, 100, 535, 1, 665, 795, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 633, 100, 535, 1, 665, 795, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 633, 500, 535, 1, 665, 795, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 633, 500, 335, 1, 665, 795, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 433, 400, 234, 0, 445, 550, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 433, 200, 234, 0, 445, 550, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 433, 200, 234, 0, 445, 550, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 502, 100, 602, 0, 500, 400, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 502, 200, 602, 0, 599, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 502, 200, 602, 0, 599, 400, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 502, 200, 602, 0, 599, 400, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 502, 200, 602, 0, 599, 400, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 502, 200, 503, 0, 401, 400, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 502, 200, 503, 0, 401, 400, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 502, 200, 503, 1, 401, 500, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 502, 200, 503, 1, 401, 500, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 502, 200, 650, 2, 701, 640, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 502, 200, 650, 2, 701, 640, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 502, 200, 650, 3, 801, 740, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 502, 200, 650, 3, 801, 740, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 502, 200, 503, 1, 401, 500, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 502, 200, 503, 1, 401, 500, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 502, 200, 650, 2, 701, 640, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 502, 200, 650, 2, 701, 640, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 502, 200, 650, 3, 801, 740, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 502, 200, 650, 3, 801, 740, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(99, 0, 0, 400, 100, 300, 0, 800, 400, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 0, 0, 400, 100, 300, 0, 800, 400, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(99, 1, 0, 400, 601, 300, 0, 800, 400, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(02, 1, 0, 400, 601, 300, 0, 800, 400, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(02, 1, 0, 400, 601, 300, 0, 800, 400, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(02, 1, 0, 400, 601, 300, 0, 800, 400, 1, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(02, 1, 0, 400, 601, 300, 0, 800, 400, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(02, 1, 1, 400, 601, 300, 0, 800, 400, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(02, 1, 1, 400, 601, 300, 3, 800, 400, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(02, 1, 1, 400, 601, 300, 3, 800, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(02, 1, 1, 400, 601, 300, 3, 800, 400, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(02, 0, 1, 400, 601, 300, 3, 800, 400, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(02, 0, 1, 400, 601, 300, 3, 800, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(02, 0, 1, 400, 601, 300, 3, 800, 400, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(02, 0, 1, 400, 601, 300, 3, 800, 400, 1, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 502, 100, 602, 0, 300, 400, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 502, 200, 602, 0, 299, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 502, 200, 602, 0, 299, 400, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 502, 200, 602, 0, 299, 400, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 502, 200, 602, 0, 299, 400, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 502, 200, 503, 0, 301, 400, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 502, 200, 503, 0, 301, 400, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 502, 200, 503, 1, 201, 500, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 502, 200, 503, 1, 201, 500, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 502, 200, 650, 2, 501, 640, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 502, 200, 650, 2, 301, 640, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 502, 200, 650, 3, 401, 740, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 502, 200, 650, 3, 201, 740, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 502, 200, 503, 1, 101, 500, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 502, 200, 503, 1, 401, 500, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 502, 200, 650, 2, 301, 640, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 502, 200, 650, 2, 201, 640, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 502, 200, 650, 3, 401, 740, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 502, 200, 650, 3, 601, 740, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 502, 100, 402, 0, 500, 400, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 502, 200, 402, 0, 599, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 502, 200, 502, 0, 599, 400, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 502, 200, 402, 0, 599, 400, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 502, 200, 302, 0, 599, 400, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 502, 200, 403, 0, 401, 400, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 502, 200, 403, 0, 401, 400, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 502, 200, 303, 1, 401, 500, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 502, 200, 203, 1, 401, 500, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 502, 200, 450, 2, 701, 640, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 502, 200, 450, 2, 701, 640, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 502, 200, 450, 3, 801, 740, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 502, 200, 350, 3, 801, 740, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 502, 200, 403, 1, 401, 500, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 502, 200, 303, 1, 401, 500, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 502, 200, 450, 2, 701, 640, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 502, 200, 350, 2, 701, 640, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 502, 200, 450, 3, 801, 740, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 502, 200, 350, 3, 801, 740, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(75, 1, 0, 300, 599, 424, 0, 500, 400, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(75, 1, 0, 300, 599, 424, 0, 400, 400, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(75, 1, 0, 300, 599, 424, 1, 500, 500, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(75, 1, 1, 300, 0, 424, 1, 500, 500, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(75, 1, 1, 300, 0, 424, 1, 600, 500, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(75, 1, 1, 300, 0, 424, 1, 600, 500, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(75, 1, 0, 300, 599, 424, 2, 700, 640, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(75, 1, 0, 300, 599, 424, 2, 800, 640, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(75, 1, 0, 300, 599, 424, 3, 900, 740, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(75, 1, 1, 300, 0, 424, 3, 900, 740, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(75, 1, 1, 300, 0, 424, 3, 900, 740, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(75, 1, 1, 300, 0, 424, 3, 900, 740, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(75, 0, 0, 300, 0, 424, 5, 600, 500, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(75, 1, 0, 300, 0, 424, 1, 600, 500, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(75, 1, 0, 300, 0, 424, 5, 600, 500, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(75, 1, 0, 300, 0, 424, 5, 600, 500, 1, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(75, 1, 0, 300, 0, 424, 5, 600, 500, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(75, 0, 0, 300, 0, 424, 5, 600, 500, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(5, 0, 0, 300, 0, 424, 5, 600, 500, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(5, 0, 1, 300, 0, 424, 5, 600, 500, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(5, 0, 1, 300, 0, 424, 5, 600, 500, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(5, 0, 1, 300, 700, 424, 5, 600, 500, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(5, 0, 1, 300, 700, 424, 5, 600, 500, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 300, 400, 424, 5, 400, 500, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 300, 400, 424, 5, 400, 500, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 300, 400, 424, 5, 400, 500, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 300, 400, 424, 2, 400, 500, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 300, 400, 424, 3, 400, 500, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 300, 400, 424, 4, 400, 500, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 300, 400, 424, 4, 400, 500, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 300, 400, 424, 4, 400, 500, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 300, 500, 424, 3, 400, 500, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 300, 600, 424, 3, 400, 500, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 0, 717, 34, 1153, 0, 229, 126, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 0, 717, 34, 1153, 0, 229, 126, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 1, 717, 34, 1153, 0, 229, 126, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 1, 717, 34, 1153, 1, 229, 126, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 1, 717, 34, 1153, 2, 229, 126, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 1, 717, 34, 1153, 3, 229, 126, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 1, 717, 34, 1153, 1, 229, 226, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 0, 717, 34, 1153, 1, 429, 326, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 0, 717, 34, 1153, 2, 429, 326, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 717, 534, 1153, 2, 429, 326, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 500, 400, 424, 5, 400, 500, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 500, 400, 424, 5, 400, 500, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 500, 400, 424, 5, 400, 500, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 500, 400, 424, 2, 400, 500, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 500, 400, 424, 3, 400, 500, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(75, 1, 0, 300, 0, 424, 1, 600, 500, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(75, 1, 0, 300, 0, 424, 3, 600, 500, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(75, 1, 0, 300, 599, 424, 2, 600, 500, 1, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(75, 1, 0, 300, 0, 424, 0, 600, 500, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(75, 0, 0, 300, 0, 424, 1, 600, 500, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(5, 0, 0, 300, 0, 424, 2, 600, 500, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(5, 0, 1, 300, 0, 424, 3, 600, 500, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(0, 0, 1, 300, 0, 424, 2, 600, 500, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(5, 0, 1, 300, 700, 424, 1, 600, 500, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(5, 0, 1, 300, 700, 424, 2, 600, 500, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 300, 300, 424, 0, 400, 500, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 300, 100, 424, 2, 400, 500, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 300, 0, 424, 1, 400, 500, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 300, 40, 424, 2, 400, 500, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 300, 400, 424, 3, 400, 500, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 500, 400, 424, 3, 600, 800, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 500, 400, 424, 3, 600, 800, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 500, 400, 424, 3, 600, 800, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 500, 400, 424, 3, 600, 800, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 500, 500, 624, 3, 600, 800, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 600, 500, 524, 3, 600, 800, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 500, 400, 424, 5, 600, 500, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 500, 400, 424, 5, 600, 500, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 500, 400, 424, 5, 600, 500, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 500, 400, 424, 2, 600, 500, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 500, 400, 424, 3, 600, 500, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(00, 1, 1, 400, 200, 500, 1, 100, 200, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(00, 1, 1, 400, 200, 600, 1, 100, 500, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(00, 1, 1, 400, 300, 600, 3, 100, 500, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(00, 1, 0, 400, 300, 600, 3, 100, 500, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(00, 1, 0, 400, 300, 600, 3, 100, 500, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(00, 1, 0, 400, 300, 600, 3, 100, 500, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(00, 1, 0, 400, 400, 600, 2, 100, 500, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(00, 1, 0, 400, 400, 600, 2, 100, 500, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(00, 1, 0, 400, 400, 600, 2, 100, 500, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(00, 1, 0, 400, 200, 600, 0, 100, 500, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(00, 1, 1, 400, 200, 600, 0, 100, 500, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(00, 1, 1, 400, 300, 600, 2, 100, 500, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(00, 1, 1, 400, 300, 600, 2, 100, 300, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(00, 1, 1, 400, 300, 600, 2, 100, 300, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(00, 1, 1, 400, 300, 600, 3, 100, 300, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(00, 1, 0, 400, 300, 600, 3, 100, 800, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(00, 1, 0, 400, 200, 600, 0, 100, 300, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(00, 1, 1, 400, 200, 600, 1, 100, 500, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(00, 1, 0, 400, 400, 600, 2, 100, 500, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(00, 1, 0, 400, 400, 600, 2, 100, 600, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(00, 1, 1, 400, 300, 600, 2, 100, 500, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(10, 1, 0, 400, 400, 200, 2, 300, 400, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(10, 1, 0, 400, 400, 200, 3, 300, 400, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(10, 1, 0, 400, 400, 200, 3, 300, 400, 1, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(10, 1, 0, 400, 400, 200, 3, 300, 400, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(10, 1, 0, 400, 0, 200, 0, 300, 400, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(10, 1, 0, 400, 0, 200, 1, 300, 400, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(10, 1, 0, 400, 0, 200, 1, 300, 400, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(10, 1, 0, 400, 0, 200, 1, 300, 800, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 500, 500, 624, 2, 600, 800, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 500, 500, 624, 2, 600, 800, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 500, 500, 624, 3, 600, 800, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 500, 500, 624, 3, 600, 600, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 500, 500, 624, 2, 600, 600, 1, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 1, 500, 500, 624, 2, 600, 600, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 1, 500, 500, 624, 3, 600, 600, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 1, 500, 200, 624, 3, 600, 600, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 1, 300, 200, 624, 3, 600, 600, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 500, 400, 424, 2, 600, 500, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 500, 400, 424, 2, 600, 500, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 0, 500, 400, 424, 3, 600, 500, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 1, 500, 400, 424, 3, 600, 500, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 1, 500, 400, 424, 0, 600, 500, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 1, 600, 400, 524, 0, 600, 500, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(65, 1, 1, 600, 400, 524, 2, 600, 500, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 502, 200, 450, 3, 801, 740, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 0, 502, 200, 450, 2, 801, 740, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 502, 200, 450, 1, 801, 740, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 502, 200, 450, 1, 801, 740, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 502, 200, 450, 1, 801, 740, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(01, 1, 1, 502, 200, 450, 0, 801, 740, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(75, 1, 0, 300, 0, 424, 1, 600, 500, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(75, 1, 0, 300, 0, 424, 2, 600, 500, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(75, 1, 1, 300, 0, 424, 2, 600, 500, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(75, 1, 1, 300, 0, 424, 3, 600, 500, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(75, 1, 1, 300, 0, 424, 0, 600, 500, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(75, 1, 1, 300, 0, 424, 0, 600, 300, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(75, 1, 1, 300, 0, 424, 0, 600, 300, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(11, 1, 1, 1142, 511, 4704, 1, 740, 500, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(11, 1, 1, 1142, 511, 4704, 1, 740, 500, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(11, 1, 0, 1142, 511, 4704, 1, 740, 500, 1, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(11, 1, 0, 1142, 511, 4704, 2, 740, 500, 1, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(11, 1, 0, 1142, 511, 4704, 3, 740, 500, 1, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(11, 1, 0, 1142, 511, 4704, 0, 740, 500, 1, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(11, 1, 0, 1142, 511, 4704, 0, 740, 500, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(11, 1, 0, 1142, 511, 4704, 0, 740, 500, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(11, 1, 0, 1142, 511, 4704, 2, 740, 500, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 0, 717, 34, 1153, 2, 429, 326, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(18, 1, 0, 717, 34, 1153, 3, 429, 326, 0, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 633, 500, 335, 1, 665, 795, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 0, 633, 500, 335, 2, 665, 795, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 633, 500, 335, 2, 665, 795, 1, 0, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 633, 500, 335, 2, 665, 795, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 633, 500, 335, 3, 665, 795, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 633, 500, 335, 0, 665, 795, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(34, 1, 1, 733, 500, 335, 0, 665, 795, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(00, 0, 1, 300, 0, 424, 2, 600, 500, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(00, 0, 1, 300, 0, 424, 2, 600, 500, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(00, 0, 0, 300, 0, 424, 2, 600, 500, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(00, 0, 1, 300, 80, 424, 2, 600, 500, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(00, 0, 1, 300, 80, 424, 2, 600, 500, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(00, 0, 1, 300, 0, 424, 2, 600, 500, 0, 0, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(00, 0, 1, 300, 0, 424, 2, 600, 500, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(00, 0, 0, 300, 0, 424, 2, 600, 500, 1, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(78, 1, 0, 581, 567, 655, 3, 637, 906, 1, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(78, 1, 1, 581, 567, 655, 3, 637, 906, 0, 1, 0), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(78, 1, 1, 581, 567, 655, 3, 637, 906, 0, 1, 1), 0);
//    }
//
//    @Test
//    public void test() {
//        jtcas newtcas = new jtcas();
//        assertEquals(newtcas.begin(78, 1, 1, 581, 567, 655, 0, 637, 906, 0, 1, 1), 0);
//    }  
}
