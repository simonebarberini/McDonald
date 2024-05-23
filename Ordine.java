public class Ordine {

    Utente utente;
    Menu menu;
    Tavolo tavolo;

    public Ordine(Utente utente, Menu menu, Tavolo tavolo) {
        this.utente = utente;
        this.menu = menu;
        this.tavolo = tavolo;
    }

    public void stampaOrdine() {

        // String username = utente.getUsername();
        // int numTav = tavolo.getNumeroTavolo();
        // double budget = utente.getBudget();
        // int numPers = utente.getPersone();
        // System.out.println(
        //         "Ordine tavolo " + numTav + " per " + username + ", " + numPers + " persone, budget" + budget + ":");
        
        // for(String i: menu.getProdotti()) {
        //     System.out.println(i);
        // }
    }
}   