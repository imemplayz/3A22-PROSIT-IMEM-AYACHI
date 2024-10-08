public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal("felines", "lion", 14, true);
        Zoo myZoo = new Zoo("Zooname", 25, "tunis");
        //method 1 : standard method
        lion.afficher();
        myZoo.afficher();
        //method 2 : overriding toString
        //System.out.println(lion.toString());

        myZoo.addAnimal(lion);

        System.out.println(myZoo.searchAnimal(lion));

        myZoo.listAnimals();
    }
}