package edu.uclm.esi.iso5.juegos.monopoly.dominio;

import java.util.Random;

public class Dados {

    public static boolean debug = false;

    protected static int[] result = new int[2];
    protected static int maximo = 6;

    public static int[] tirarDados() {
        if (debug) {
            //result[0]=0; result[1]=0;
            result[0] += 1;
            result[1] += 2;
            if (result[0] == 7) {
                result[0] = 1;
            }
            if (result[1] == 7) {
                result[1] = 2;
            } else if (result[1] == 8) {
                result[1] = 3;
            }
        } else {

            result[0] = 0;
            result[1] = 0;
            result[0] = (new Random()).nextInt(maximo) + 1;
            result[1] = (new Random()).nextInt(maximo) + 1;
        }
        return result;
    }

    public static int suma() {
        return result[0] + result[1];
    }
}
