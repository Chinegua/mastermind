package mastermind.clases;

import java.util.Arrays;

public class SecuenciaCodificadora extends Secuencia {

    public SecuenciaCodificadora() {
        super();
    }

    public void generateSecuencia() {

        for (int i = 0; i <= TAMANO_SECUENCIA; i++) {
            super.setNumber((int) (Math.random() * NUMERO_POSIBILIDADES), i);

        }
        System.out.print(Arrays.toString(super.secuencia));

    }

    public SecuenciaCodificadora generateCopy() {
        SecuenciaCodificadora secuenciaCodificadora;
        secuenciaCodificadora = new SecuenciaCodificadora();

        for (int i = 0; i <= 3; i++) {
            secuenciaCodificadora.setNumber(this.getNumber(i), i);
        }
        return secuenciaCodificadora;
    }

}
