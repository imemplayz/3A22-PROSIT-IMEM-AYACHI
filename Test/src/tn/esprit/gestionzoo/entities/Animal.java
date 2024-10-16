package tn.esprit.gestionzoo.entities;

public class Animal {

    private final String family;
    private String name;
    private int age;
    private final boolean ismammal;

    public Animal(String family, String name, int age, boolean ismammal) {
        this.family = family;
        setName(name);  // Vérification dans le setter
        setAge(age);    // Vérification dans le setter
        this.ismammal = ismammal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // Vérification si le nom est vide
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Animal name cannot be empty.");
        }
        this.name = name;
    }

    public void setAge(int age) {
        // Vérification si l'âge est négatif
        if (age <= 0) {
            throw new IllegalArgumentException("Animal age must be positive.");
        }
        this.age = age;
    }

    public void afficher() {
        System.out.println("Family: " + family + ", Name: " + name + ", Age: " + age + ", Is Mammal: " + ismammal);
    }
}
