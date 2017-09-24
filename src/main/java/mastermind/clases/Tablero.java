package mastermind.clases;

import mastermind.controllers.GenerarCombinacionController;
import mastermind.controllers.DemoController;
import mastermind.controllers.PreguntarCombinacionController;

public class Tablero {

    public SecuenciaCodificadora secuenciaCodificada;

    public SecuenciaDecodificadora secuenciaDecodificada;

    public PreguntarCombinacionController preguntarCombinacionController;

    public GenerarCombinacionController generarCombinacionController;

    public DemoController generarDemoController;

    public Tablero() {
        secuenciaCodificada = new SecuenciaCodificadora();
        secuenciaDecodificada = new SecuenciaDecodificadora();

    }

    public SecuenciaCodificadora getSecuenciaCodificadora() {
        return this.secuenciaCodificada;
    }

    public SecuenciaDecodificadora getSecuenciaDecodificadora() {
        return this.secuenciaDecodificada;
    }

    public SecuenciaCodificadora generateCombinacion() {
        generarCombinacionController = new GenerarCombinacionController(secuenciaCodificada);
        return secuenciaCodificada;
    }

    public SecuenciaDecodificadora preguntarCombinacion() {
        preguntarCombinacionController = new PreguntarCombinacionController(secuenciaDecodificada);
        return secuenciaDecodificada;
    }

    public SecuenciaDecodificadora generateDemo() {

        generarDemoController = new DemoController(secuenciaDecodificada);
        return secuenciaDecodificada;
    }

}
