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
 * Calcula a raíz quadrada de N usando o método de bisetriz.
 * Original code: http://www.inf-cr.uclm.es/www/mpolo/stvr/
 *
 * @author Jackson Antonio do Prado Lima <jacksonpradolima at gmail.com>
 * @version 1.0
 */
public class Bisect {
 
    double mEpsilon, mNumber, mResult;

    public Bisect() {
    }

    public void setEpsilon(double epsilon) {
        this.mEpsilon = epsilon;
    }

    public double sqrt(double N) {
        double x = N;
        double M = N, m = 1;
        double r = x;
        double diff = x * x - N;
        while (Math.abs(diff) > mEpsilon) {
            if (diff < 0) {
                m = x;
                x = (M + x) / 2;
            } else {
                if (diff > 0) {
                    M = x;
                    x = (m + x) / 2;
                }
            }
            diff = x * x - N;
        }
        r = x;
        mResult = r;
        return r;
    }
}
