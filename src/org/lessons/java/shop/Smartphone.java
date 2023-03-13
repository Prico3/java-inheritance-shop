package org.lessons.java.shop;

public class Smartphone extends Prodotto{

    //ATTRIBUTI
    private int codiceIMEI;
    private int memoria;

    //COSTRUTTORE

    public Smartphone(int codiceIMEI, int memoria) {
        this.codiceIMEI = codiceIMEI;
        this.memoria = memoria;
    }

    //GETTER E SETTER

    public int getCodiceIMEI() {
        return codiceIMEI;
    }

    public void setCodiceIMEI(int codiceIMEI) {
        this.codiceIMEI = codiceIMEI;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    //METODI


}
