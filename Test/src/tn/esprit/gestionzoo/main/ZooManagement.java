package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {

    int nbcages = 20;
    String zooName = "myzoo";

    public static void main(String[] args) {
        // Instructions déjà implémentées (instructions 1 et 2)
        /*
        System.out.println("type in the values you want to change ");
        Scanner scanfvariable = new Scanner(System.in);
        ZooManagement zm1 = new ZooManagement();
        do {
            zm1.nbcages = scanfvariable.nextInt();   //to read whatever integer i will be typing in
            zm1.zooName = scanfvariable.next();   //to read whatever string i will be typing in
        } while ((zm1.nbcages == 0) || (zm1.zooName == null));
        System.out.println("changed values : ");
        System.out.println(zm1.zooName);
        System.out.println(zm1.nbcages);
        */

        // Instruction 10 : Ajout d'un animal et affichage
        Zoo newZoo = new Zoo("Belveder", 25, "Tunis");
        Animal newAnimal = new Animal("feline", "lion", 8, true);
        newZoo.addAnimal(newAnimal);
        newZoo.showArray();

        // Test de la recherche d'un animal
        int index = newZoo.searchAnimal(newAnimal);
        if (index != -1) {
            System.out.println("Animal found at index: " + index);
        } else {
            System.out.println("Animal not found.");
        }

        // Test de la suppression d'un animal
        boolean isRemoved = newZoo.removeAnimal(newAnimal);
        if (isRemoved) {
            System.out.println("Animal removed successfully.");
        } else {
            System.out.println("Animal could not be removed.");
        }

        // Afficher le zoo complet (instruction 12)
        // Afficher les animaux du zoo
        newZoo.showArray();

    }
}
