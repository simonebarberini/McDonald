public class Tavolo {
    
    private boolean occupato;
    private int numeroTavolo;

    public Tavolo(boolean occupato, int numeroTavolo) {
        this.occupato = occupato;
        this.numeroTavolo = numeroTavolo;
    }

    //getter e setter numero tavolo
    public int getNumeroTavolo() {
        return numeroTavolo;
    }

    public void setNumeroTavolo(int numeroTavolo) {
        this.numeroTavolo = numeroTavolo;
    }
    
    //getter e setter occupato
    public boolean getOccupato() {
        return occupato;
    }

    public void setOccupato(boolean occupato) {
        this.occupato = occupato;
    }

    
    
}


