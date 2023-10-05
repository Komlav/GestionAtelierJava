package com.komlavi.Services.Interfaces;

import java.util.ArrayList;

public interface ServicesInt<Classe> {
    // Méthode permettant d'ajouter un nouvel objet
    boolean insert(Classe objet);

    // Méthode permettant de retrouver un objet
    Classe find();

    // Méthode permettant de retrouver les objets
    ArrayList<Classe> findAll();

    // Méthode permettant la suppression d'un objet
    boolean delete(Classe objet);

    // Méthode permettant la suppression de plusieurs objets
    boolean delete(ArrayList<Integer> idList);

    // Méthode permettant la modification d'un objet
    boolean update(Classe objet);
}
