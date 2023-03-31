package vehicle;

import csv.FieldsEnum;
import outputmessage.OutputMessage;

public class Vehicle {
    private String marca;
    private String modello;
    private int prezzo;
    private String targa;
    private int numeroRuote;

    public Vehicle(String marca, String modello, int prezzo, String targa, int numeroRuote) {
        this.marca = marca;
        this.modello = modello;
        this.prezzo = prezzo;
        this.targa = targa;
        this.numeroRuote = numeroRuote;
    }

    public String getTipologia() {
        if (numeroRuote == 4) {
            return "Auto";
        } else {
            return "Moto";
        }
    }

    public String toString() {
        return " - marca: " + marca +
                " - modello: " + modello +
                " - prezzo: " + prezzo +
                " - targa: " + targa +
                " - numero ruote: " + numeroRuote +
                " - tipologia: " + getTipologia();
    }

    public String getField(FieldsEnum fieldInput) {

        switch (fieldInput) {
            case MARCA:
                return this.marca;
            case MODELLO:
                return this.modello;
            case PREZZO:
                return String.valueOf(this.prezzo);
            case TARGA:
                return this.targa;
            case NR_RUOTE:
                return String.valueOf(this.numeroRuote);
            case TIPOLOGIA:
                return this.getTipologia();
            default:
                System.out.println(OutputMessage.SCEGLI_VALORE_DA_MENU);
                break;
        }
        return null;
    }
}
