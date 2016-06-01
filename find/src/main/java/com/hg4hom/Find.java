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
 * Divide um vetor em dois outros segundo um valor passado à partição
 *
 * @author Jackson Antonio do Prado Lima <jacksonpradolima at gmail.com>
 * @version 1.0
 */
public class Find {

    int[] A;
    int mF;
    int nElems;

    public Find(int size) {
        A = new int[size];
        nElems = 0;
    }

    public void addItem(int v) {
        A[nElems++] = v;
    }

    public int[] getVector() {
        return A;
    }

    public void partition(int f) {
        mF = f;
        int numPosicionesMayores = 0, numPosicionesMenores = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < A[f]) {
                numPosicionesMenores++;
            } else {
                if (A[i] > A[f]) {
                    numPosicionesMayores++;
                }
            }
        }
        int[] posicionesMenores = new int[numPosicionesMenores];
        int[] posicionesMayores = new int[numPosicionesMayores];
        int[] posicionesIguales = new int[A.length - numPosicionesMenores - numPosicionesMayores];
        int contPosMenores = 0, contPosMayores = 0, contPosIguales = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < A[f]) {
                posicionesMenores[contPosMenores++] = i;
            } else {
                if (A[i] > A[f]) {
                    posicionesMayores[contPosMayores++] = i;
                } else {
                    posicionesIguales[contPosIguales++] = i;
                }
            }
        }
        int[] aux = new int[A.length];
        int cont = 0;
        for (int i = 0; i < posicionesMenores.length; i++) {
            aux[cont++] = A[posicionesMenores[i]];
        }
        for (int i = 0; i < posicionesIguales.length; i++) {
            aux[cont++] = A[posicionesIguales[i]];
        }
        for (int i = 0; i < posicionesMayores.length; i++) {
            aux[cont++] = A[posicionesMayores[i]];
        }
        this.A = aux;
    }
}
