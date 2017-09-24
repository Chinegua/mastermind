package mastermind.clases;

import mastermind.models.Jugada;

public class MasterMind {

    private Tablero tablero;

    private Jugada jugada;

    private IO io;

    public static final int NUMERO_RONDAS = 9;

    public MasterMind() {
        tablero = new Tablero();
        io = new IO();
    }

    public void playWithIA() {

        SecuenciaCodificadora secuenciaCodificada = tablero.generateCombinacion();
        for (int i = 0; i <= NUMERO_RONDAS; i++) {
            jugada = new Jugada();
            jugada = jugada.getSummary(tablero.preguntarCombinacion(), secuenciaCodificada);
            if (jugada.getDeads() == 4) {
                io.outputWin();
                break;
            }
            io.summary(jugada.getDeads(), jugada.getInjureds());

        }

    }

    public void playWihDemo() {

        SecuenciaCodificadora secuenciaCodificada = tablero.generateCombinacion();

        for (int i = 0; i <= NUMERO_RONDAS; i++) {
            SecuenciaDecodificadora secuenciaDecodificadora = tablero.generateDemo();
            jugada = new Jugada();
            jugada = jugada.getSummary(secuenciaDecodificadora, secuenciaCodificada);
            if (jugada.getDeads() == 4) {
                io.outputWin();
                break;
            }
            io.summary(jugada.getDeads(), jugada.getInjureds());

        }

    }

    public void play() {

    }

    public static void main(String[] args) {
        IO io = new IO();
        MasterMind masterMind;
        masterMind = new MasterMind();
        int mode = io.inMode();
        while (mode != 0) {
            switch (mode) {
            case 1:
                masterMind.playWithIA();
                mode = io.inMode();
            case 2:
                masterMind.playWihDemo();
                mode = io.inMode();

            }
        }

    }

}
