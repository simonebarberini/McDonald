import java.util.ArrayList;

public class Menu {

private ArrayList<String> prodotti;
private double prezzo;

public Menu(double prezzo){

    prodotti = new ArrayList<>();
    this.prezzo = prezzo;
}

// Getter
public double getPrezzo() {
    return prezzo;
}

// Setter
public void setPrezzo(double prezzo) {
    this.prezzo = prezzo;
}

// Getter
public ArrayList<String> getProdotti() {
    return prodotti;
}

// Setter
//public void setProdotti(ArrayList<String> prodotti) {
////        this.prodotti = prodotti;
//}

public void addProdotto(String prodotto) {
    prodotti.add(prodotto);
}
    
}
