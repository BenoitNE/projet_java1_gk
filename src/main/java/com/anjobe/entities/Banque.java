package com.anjobe.entities;

public class Banque implements Comparable <Banque> {
    public static double soldeTotalComptes;
    public static int nbreTotalCompte;
    private int idBanque;
    private String nomBanque;
    private String adresseBanque;
    private double capitalBanque;

    public Banque() {
    }

    public Banque(int idBanque, String nomBanque, String adresseBanque, double capitalBanque) {
        this.idBanque = idBanque;
        this.nomBanque = nomBanque;
        this.adresseBanque = adresseBanque;
        this.capitalBanque = capitalBanque;
    }

    public int getIdBanque() {
        return idBanque;
    }

    public void setIdBanque(int idBanque) {
        this.idBanque = idBanque;
    }

    public String getNomBanque() {
        return nomBanque;
    }

    public void setNomBanque(String nomBanque) {
        this.nomBanque = nomBanque;
    }

    public String getAdresseBanque() {
        return adresseBanque;
    }

    public void setAdresseBanque(String adresseBanque) {
        this.adresseBanque = adresseBanque;
    }

    public double getCapitalBanque() {
        return capitalBanque;
    }

    public void setCapitalBanque(double capitalBanque) {
        this.capitalBanque = capitalBanque;
    }

    @Override
    public String toString() {
        return "Banque{" +
                "idBanque=" + idBanque +
                ", nomBanque='" + nomBanque + '\'' +
                ", adresseBanque='" + adresseBanque + '\'' +
                ", capitalBanque=" + capitalBanque +
                '}';
    }


    @Override
    public int compareTo(Banque other) {
        return Double.compare(this.capitalBanque, other.capitalBanque);
    }
}
