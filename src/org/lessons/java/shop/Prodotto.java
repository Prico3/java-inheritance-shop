package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {

    //ATTRIBUTI
    private int codice;
    private String nome;
    private String descrizione;
    private int prezzo;
    private double iva;

    //COSTRUTTORE


    public Prodotto(int codice, String nome, String descrizione, int prezzo, double iva) {
        codice = generaCodice();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    public Prodotto() {
        codice = generaCodice();
    }

    // GETTER E SETTER

    public int getCodice() {
        return generaCodice();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    //METODI




    private int generaCodice() {
        Random random = new Random();
        return random.nextInt(1, 10000);
    }




    @Override
    public String toString() {
        return "Prodotto{" +
                "codice=" + codice +
                ", nome='" + nome + '\'' +
                ", descrizione='" + descrizione + '\'' +
                ", prezzo=" + prezzo +
                ", iva=" + iva +
                '}';
    }
}
