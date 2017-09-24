package mastermind.controllers;

import mastermind.clases.SecuenciaDecodificadora;

public class DemoController {

    public DemoController(SecuenciaDecodificadora secuenciaDecodificada){
        secuenciaDecodificada.generateDemo();
    }
}
