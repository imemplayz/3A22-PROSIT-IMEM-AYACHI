package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbcages = 25;
    private int nbAnimals = 0;

    public Zoo(String name, int nbcages, String city) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Zoo name cannot be empty.");
        }
        animals = new Animal[nbcages];
        this.name = name;
        this.city = city;
    }

    public boolean addAnimal(Animal animal) {
        if (this.isZooFull()) {
            System.out.println("Cannot add animal. The zoo is full.");
            return false;
        }
        for (int i = 0; i < nbAnimals; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                System.out.println("This animal is already in the zoo.");
                return false;
            }
        }
        animals[nbAnimals] = animal;
        nbAnimals++;
        return true;
    }

    public boolean isZooFull() {
        return nbAnimals >= nbcages;
    }

    public int getNbAnimals() {
        return nbAnimals;
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbAnimals; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                return i;  // Renvoie l'index de l'animal trouvé
            }
        }
        return -1;  // Renvoie -1 si l'animal n'est pas trouvé
    }

    // Ajout de la méthode removeAnimal()
    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < nbAnimals; i++) {
            if (animals[i].getName().equals(animal.getName())) {
                // Retirer l'animal et décaler les éléments restants
                for (int j = i; j < nbAnimals - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[nbAnimals - 1] = null; // Supprimer le dernier élément
                nbAnimals--; // Réduire le nombre total d'animaux
                return true;  // L'animal a été supprimé avec succès
            }
        }
        return false; // L'animal n'a pas été trouvé
    }

    public void showArray() {
        if (nbAnimals == 0) {
            System.out.println("No animals in the zoo.");
        } else {
            for (int i = 0; i < nbAnimals; i++) {
                animals[i].afficher();  // Appel de la méthode afficher() de la classe Animal
            }
        }
    }

    public void afficher() {
        System.out.println("Zoo name: " + name);
        System.out.println("Number of cages: " + nbcages);
        System.out.println("City: " + city);
    }

    public String tostring() {
        return "Zoo{name='" + name + "', city='" + city + "', nbCages=" + nbcages + "}";
    }
}
