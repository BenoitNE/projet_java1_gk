package com.anjobe.entities;

import java.time.LocalDate;

public class CompteBancaire {
    private int numCompte;
    private String proprietaire;
    private double solde;
    private LocalDate dateCreation;
    private int idBanque;

    public CompteBancaire() {
        Banque.nbreTotalCompte++;
    }

    public CompteBancaire(int numCompte, String proprietaire, double solde, LocalDate dateCreation, int idBanque) {
        this.idBanque = idBanque;
        this.numCompte = numCompte;
        this.proprietaire = proprietaire;
        this.solde = solde;
        this.dateCreation = dateCreation;

        Banque.nbreTotalCompte++;
        Banque.soldeTotalComptes += solde;
    }

    public int getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(int numCompte) {
        this.numCompte = numCompte;
    }

    public String getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public int getIdBanque() {
        return idBanque;
    }

    public void setIdBanque(int idBanque) {
        this.idBanque = idBanque;
    }

    @Override
    public String toString() {
        return "CompteBancaire{" +
                "idBanque=" + idBanque +
                ", numCompte=" + numCompte +
                ", proprietaire='" + proprietaire.toUpperCase() + '\'' +
                ", solde=" + solde +
                ", dateCreation=" + dateCreation +
                '}';
    }

    public double crediter(double montant) {
        if (montant > 1 && montant < 1000) {
            this.solde += montant;
            Banque.soldeTotalComptes += montant;
            return this.solde;
        } else {
            System.out.println("ERREUR: Le montant n'est pas correct.");
            return this.solde;
        }

    }

    public double debiter(double montant) {
        if (montant <= this.solde) {
            this.solde -= montant;
            Banque.soldeTotalComptes -= montant;
            return this.solde;
        } else {
            System.out.println("ERREUR: Le montant est supérieur à votre solde.");
            return this.solde;
        }

    }
}
