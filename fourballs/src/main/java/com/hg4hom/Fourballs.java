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

/**
 * Calcula o peso relativo de uma bola que se passa como parâmetro a relativeWeight
 *
 * @author Jackson Antonio do Prado Lima <jacksonpradolima at gmail.com>
 * @version 1.0
 */
public class Fourballs {

    double mA;
    double mB;
    double mC;
    double mD;

    public Fourballs(double a, double b, double c, double d) {
        mA = a;
        mB = b;
        mC = c;
        mD = d;
    }

    public double[] relativeWeight(int cual) {
        double[] r = new double[3];
        if (cual == 1) {
            r[0] = mA / mB;
            r[1] = mA / mC;
            r[2] = mA / mD;
        } else {
            if (cual == 2) {
                r[0] = mB / mA;
                r[1] = mB / mC;
                r[2] = mB / mD;
            } else {
                if (cual == 3) {
                    r[0] = mC / mA;
                    r[1] = mC / mB;
                    r[2] = mC / mD;
                } else {
                    r[0] = mD / mA;
                    r[1] = mD / mB;
                    r[2] = mD / mC;
                }
            }
        }
        return r;
    }
}
