package mastermind.clases;

import java.util.Arrays;



public class SecuenciaDecodificadora extends Secuencia implements Cloneable {


    public SecuenciaDecodificadora() {
        super();
        super.io = new IO();
    }

    public void generateSecuencia() {

        for (int i = 0; i <= TAMANO_SECUENCIA; i++) {
            int number = super.io.inUser();
            super.setNumber(number, i);
        }
    }
    
    public void generateDemo(){
        for (int i = 0; i <= TAMANO_SECUENCIA; i++) {
            super.setNumber((int) (Math.random() * NUMERO_POSIBILIDADES), i);

        }
        System.out.print(Arrays.toString(super.secuencia));

    }
   
 

}
