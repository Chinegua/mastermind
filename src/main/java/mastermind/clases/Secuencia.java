package mastermind.clases;

import java.util.Arrays;

public class Secuencia {

    public final int TAMANO_SECUENCIA = 3;
    public final int NUMERO_POSIBILIDADES = 10;

    int[] secuencia;

    public IO io;

    public Secuencia() {
        this.secuencia = new int[TAMANO_SECUENCIA + 1];
    }

    public void setNumber(int number, int position) {

        this.secuencia[position] = number;

    }

    public int getNumber(int i) {
        assert i <= TAMANO_SECUENCIA;
        return secuencia[i];
    }

}
