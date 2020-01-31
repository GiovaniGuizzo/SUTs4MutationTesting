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

/**
 * Calcula o valor central dos três valores a b c
 *
 * @author Jackson Antonio do Prado Lima <jacksonpradolima at gmail.com>
 * @version 1.0
 */
public class Mid {

    protected int mA, mB, mC, mMiddle;

    public Mid() {
    }

    public void setA(int a) {
        mA = a;
    }

    public void setB(int b) {
        mB = b;
    }

    public void setC(int c) {
        mC = c;
    }

    public int getMid() {
        int menor = menor(mA, mB, mC), mayor = mayor(mA, mB, mC);
        if (mA > menor && mA < mayor) {
            mMiddle = mA;
            return mA;
        }
        if (mB > menor && mB < mayor) {
            mMiddle = mB;
            return mB;
        }
        mMiddle = mC;
        return mMiddle;
    }

    protected int mayor(int x, int y, int z) {
        return mayor(x, mayor(y, z));
    }

    protected int mayor(int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }

    protected int menor(int x, int y, int z) {
        return menor(x, menor(y, z));
    }

    protected int menor(int x, int y) {
        if (x < y) {
            return x;
        }
        return y;
    }
}
