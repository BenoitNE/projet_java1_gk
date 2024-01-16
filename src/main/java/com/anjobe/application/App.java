package com.anjobe.application;

import com.anjobe.entities.Banque;
import com.anjobe.entities.CompteBancaire;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class App {
    public static void main(String[] args) {
        Banque banque1 = new Banque(100, "GK_GestiBank1", "100 Av. Albert 1er, 92500 Rueil-Malmaison, France", 1000_000_000);

        /* Données de test
        Banque banque2 = new Banque(100, "GK_GestiBank2", "100 Av. Albert 1er, 92500 Rueil-Malmaison, France", 35634565645645655.66);
        Banque banque3 = new Banque(100, "GK_GestiBank3", "100 Av. Albert 1er, 92500 Rueil-Malmaison, France", 34456.8867);
        Banque banque4 = new Banque(100, "GK_GestiBank4", "100 Av. Albert 1er, 92500 Rueil-Malmaison, France", 567.4);
        */


        CompteBancaire compteBancaire1 = new CompteBancaire(10101010, "Mohamed Amine MEZGHICH", 2000, LocalDate.of(2024, 01, 15), 100);
        CompteBancaire compteBancaire2 = new CompteBancaire(20202020, "Jean PAUL", 3000, LocalDate.of(2024, 01, 10), 100);

        System.out.println(banque1);
        System.out.println(compteBancaire1);
        System.out.println(compteBancaire2);
        System.out.println("");

        CreationService creationService = new CreationService();
        Banque nvleBanque = creationService.creerBanque();
        System.out.println(nvleBanque);

        CompteBancaire compteBancaire = creationService.creerCompteBancaire(nvleBanque.getIdBanque());
        System.out.println(compteBancaire);

        Banque [] banques = {banque1, nvleBanque};
        System.out.println("");
        System.out.println("Quelle est la banque la plus prospère ? ");
        System.out.println(getBigBalanceBank(banques).getNomBanque());

    }

    private static Banque getBigBalanceBank(Banque [] banques){
        List<Banque> banqueList = new ArrayList<>();

        for (Banque banque : banques){
            banqueList.add(banque);
        }

        Collections.sort(banqueList, Collections.reverseOrder());
        return banqueList.get(0);
    }
}