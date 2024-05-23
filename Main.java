import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Utente utente1 = new Utente("Flavio", "flavio7", 25, 1);
        Utente utente2 = new Utente("Andra", "andra18", 90, 3);
        Utente utente3 = new Utente("Elisabetta", "andra18", 90, 3);

        Menu menuBase = new Menu(25);
        menuBase.addProdotto("Panino");
        menuBase.addProdotto("Patatina");
        menuBase.addProdotto("Bevanda");

        Tavolo tavolo1 = new Tavolo(false, 1);
        Tavolo tavolo2 = new Tavolo(false, 2);
        Tavolo tavolo3 = new Tavolo(false, 3);
        Tavolo tavolo4 = new Tavolo(false,4);
        Tavolo tavolo5= new Tavolo(false, 5);
        Tavolo tavolo6 = new Tavolo(false, 6);
        ArrayList<Tavolo> listaTavoli = new ArrayList<>();
        listaTavoli.add(tavolo1);
        listaTavoli.add(tavolo2);
        listaTavoli.add(tavolo3);
        listaTavoli.add(tavolo4);
        listaTavoli.add(tavolo5);
        listaTavoli.add(tavolo6);
        //login restituisce true se sei loggato all'interno di un if e successivamente scorre i tavoli
        boolean verifica = false;
        for(Tavolo tavolo : listaTavoli){
            if(!(tavolo.getOccupato())){
                tavolo.setOccupato(true);
                creaOrdine(utente1,tavolo);
                verifica = true;
            }
        }
        if(!verifica){
            System.out.println("Nessun tavolo trovato.");
        }

    }

    static void creaOrdine(Utente utente, Tavolo tavolo) {
        Ordine ordine = new Ordine(utente, null,tavolo);

        ordine.stampaOrdine();
    }
}
