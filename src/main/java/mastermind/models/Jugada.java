package mastermind.models;

import java.util.Arrays;

import mastermind.clases.SecuenciaCodificadora;
import mastermind.clases.SecuenciaDecodificadora;

public class Jugada {

    public int deads;

    public int injureds;

    public Jugada() {
        deads = 0;
        injureds = 0;
    }

    public int getDeads() {
        return this.deads;
    }

    public int getInjureds() {
        return this.injureds;
    }

    public void addDead() {
        this.deads = this.deads + 1;
    }

    public void addInjured() {
        this.injureds = this.injureds + 1;
    }

    public Jugada getSummary(SecuenciaDecodificadora secuenciaDecodificadora, SecuenciaCodificadora secuenciaCodificadora) {
        assert secuenciaDecodificadora != null;
        assert secuenciaCodificadora != null;
        SecuenciaCodificadora copyCode = secuenciaCodificadora.generateCopy();

        for (int i = 0; i <= secuenciaDecodificadora.TAMANO_SECUENCIA; i++) {

            if (copyCode.getNumber(i) == secuenciaDecodificadora.getNumber(i)) {
                this.addDead();
                copyCode.setNumber(-1, i);
                secuenciaDecodificadora.setNumber(-1, i);

            }
        }

        for (int i = 0; i <= secuenciaDecodificadora.TAMANO_SECUENCIA; i++) {

            if (secuenciaDecodificadora.getNumber(i) != -1) {
                for (int j = 0; j <= secuenciaDecodificadora.TAMANO_SECUENCIA; j++) {
                    if (copyCode.getNumber(j) != -1) {
                        if (copyCode.getNumber(j) == secuenciaDecodificadora.getNumber(i)) {
                            this.addInjured();
                            copyCode.setNumber(-1, j);
                            secuenciaDecodificadora.setNumber(-1, i);

                        }
                    }
                }

            }
        }

        copyCode = null;
        secuenciaDecodificadora = null;
        return this;

    }

}
