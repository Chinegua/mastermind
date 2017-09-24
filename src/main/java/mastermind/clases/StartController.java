package mastermind.clases;

import mastermind.models.Jugada;

public class StartController {
    
    private IO io;
    
    public Jugada jugada;


    public StartController(Tablero tablero,int NUMERO_RONDAS){
        for (int i = 0; i <= NUMERO_RONDAS; i++) {
            jugada = new Jugada();
            jugada.getSummary(tablero.preguntarCombinacion(), tablero.generateCombinacion());
            io.summary(jugada.deads, jugada.injureds);
            if (jugada.getDeads() == 4) {
                io.outputWin();
                break;
            }
            io.summary(jugada.deads, jugada.injureds);

        }
    }
    
}

