package org.lessons.java.shop;

public class Televisori extends Prodotto{
    //ATTRIBUTI
    private int pollici;
    private boolean smart;
// COSTRUTTORE
    public Televisori(int codice, String nome, String descrizione, int prezzo, double iva, int pollici, boolean smart) {
        super(codice, nome, descrizione, prezzo, iva);
        this.pollici = pollici;
        this.smart = smart;
    }

    //GETTER E SETTER

    public int getPollici() {
        return pollici;
    }

    public void setPollici(int pollici) {
        this.pollici = pollici;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    //METODI

    @Override
    public String toString() {
        return "Televisori{" +
                "pollici=" + pollici +
                ", smart=" + smart +
                '}';
    }
}
