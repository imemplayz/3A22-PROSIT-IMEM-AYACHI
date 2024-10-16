package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class Main {
    public static void main(String[] args) {
        // Création des instances d'animaux et de zoos
        Animal lion = new Animal("Felines", "Lion", 14, true);
        Zoo myZoo = new Zoo("ZooName", 25, "Tunis");

        // Ajout et affichage des animaux
        myZoo.addAnimal(lion);
        myZoo.afficher();

        // Comparaison de zoos
        Zoo anotherZoo = new Zoo("Safari", 20, "Gafsa");
        Zoo largerZoo = comparerZoo(myZoo, anotherZoo);
        System.out.println("The zoo with more animals is: " + largerZoo.tostring());
    }

    // Méthode de comparaison de zoos
    public static Zoo comparerZoo(Zoo zoo1, Zoo zoo2) {
        return (zoo1.getNbAnimals() > zoo2.getNbAnimals()) ? zoo1 : zoo2;
    }
}
