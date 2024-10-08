public class Animal
{
    String  family;
    String name;
    int age;
    boolean ismammal;

    public Animal(String family, String name, int age, boolean ismammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.ismammal = ismammal;
    }
    public void afficher()
    {
        System.out.println(family + " " + name + " " + age + " " + ismammal);

    }

    public String toString()
    {
        return family + " " + name + " " + age + " " + ismammal;
    }


}