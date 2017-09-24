package mastermind.clases;

public class IO {
    private mastermind.utils.IO io;
    
    public IO(){
        io = new mastermind.utils.IO();
    }
    
    public int inMode(){
        return io.readInt("¿En que modo quieres jugar?:"
                + "1- Contra la maquina"
                + "2- Modo Ejemplo ");
    }
    
    public int inUser(){
        return io.readInt("Introduce un numero [0-9]: ");
    }
    
    public void outputWin(){
        io.writeln("¡HAS GANADO!");
    }
    
    public void summary(int deads,int injureds){
        assert deads >= 0;
        assert injureds >= 0;
        io.writeln("Tienes " + deads + " muertes y " + injureds + " heridos");

    }
}
