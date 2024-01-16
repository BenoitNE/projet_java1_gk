package com.anjobe.application;

import com.anjobe.entities.Banque;
import com.anjobe.entities.CompteBancaire;

import java.time.LocalDate;
import java.util.Scanner;

public class CreationService {

    public Banque creerBanque() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez Nom de la Banque:");
        String nom = scanner.nextLine();
        System.out.println("Entrez Adresse de la Banque:");
        String adresse = scanner.nextLine();
        System.out.println("Entrez Capital de la Banque:");
        double capital = scanner.nextDouble();
        System.out.println("Entrez ID Banque:");
        int idBanque = scanner.nextInt();

        return new Banque(idBanque, nom, adresse, capital);
    }

    public CompteBancaire creerCompteBancaire(int idBanque){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entrez le propriétaire du Compte: ");
        String proprietaire = scanner.nextLine();
        System.out.println("Entrez le solde: ");
        double solde = scanner.nextDouble();
        System.out.println("Entrez un numéro de Compte: ");
        int num = scanner.nextInt();

        return new CompteBancaire(num, proprietaire, solde, LocalDate.now(), idBanque);

    }


}
