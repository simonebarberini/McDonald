class Ordine() {

    Utente utente;
    Menu menu;
    Tavolo tavolo;

    public void stampaOrdine() {

        String username = getUsername();
        int numTav = getNumTav();
        double budget = getBudget();
        int numPers = getPersone();
        System.out.println("Ordine tavolo " + numTav + " per " + username + ", " +  numPers + " persone, budget" + budget + ":");
        for(String i: prodotti) {
            System.out.println(i);
        }
    }
}   