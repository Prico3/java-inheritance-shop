package org.lessons.java.shop;

public class Cuffie extends Prodotto{
    //ATTRIBUTI
    private String colore;
    private boolean wireless;

    //COSTRUTTORE

    public Cuffie(int codice, String nome, String descrizione, int prezzo, double iva, String colore, boolean wireless) {
        super(codice, nome, descrizione, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;
    }

    //GETTER E SETTER

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    //METODI

    @Override
    public String toString() {
        return "Cuffie{" +
                "colore='" + colore + '\'' +
                ", wireless=" + wireless +
                '}';
    }
}
