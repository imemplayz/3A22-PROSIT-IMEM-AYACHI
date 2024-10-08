public class Zoo
{
    Animal [] animals ;
    String name;
    String city;
    int nbcages = 25;
    int nbAnimals = 0;

    public Zoo(String name, int nbcages, String city) {
        animals=new Animal[nbcages];
        this.name = name;
        this.city = city;
    }

    public void afficher()
    {
        System.out.println("Name: " + name);
        System.out.println("Nbcages: " + nbcages);
        System.out.println("City: " + city);
    }

    public String tostring (){   //we redefined it here so we can use it fel main
        return("name="+name+",nbcages="+nbcages+",city="+city);
    }

    public Boolean addAnimal(Animal newAnimal)
    {
        if (animals.length > nbcages) {
            return false;
        }
        animals[nbAnimals] = newAnimal;
        nbAnimals++;
        return true;
    }

    public void listAnimals() {
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println("Name: " + animal.name + ", Family: " + animal.family + ", Age: " + animal.age);
            }
        }
    }

    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

}