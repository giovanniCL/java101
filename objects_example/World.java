package objects_example;
public class World {
    public static void main(String[] args){
        Human human1 = new Human("Juan", 30);
        human1.speak();
        Human human2 = new Human("Jose", 27);
        human2.speak();
        
        Human[] family = new Human[5];
        String[] names = {"Sergio", "Antonella", "Antonio", "Giovanni", "Alessandro"};
        int[] ages = {54, 52, 25, 22, 18};
        for(int i = 0; i < family.length; i ++){
            family[i] = new Human(names[i], ages[i]);
        }
        for(int i = 0; i < family.length; i ++){
            family[i].speak();
        }
        //Inheritance
        Dog toto = new Dog("Toto");
        toto.make_sound();

        Cat michi = new Cat("Michi");
        michi.make_sound();

        //Polymorphism
        Animal[] animals = new Animal[4];
        animals[0] = new Dog("Firulais");
        animals[1] = new Cat("Princesa");
        animals[2] = toto;
        animals[3] = michi;

        for(Animal animal : animals){
            animal.make_sound();
        }

        randomPetting(family, animals);
        randomPetting(family, animals);
        randomPetting(family, animals);
        randomPetting(family, animals);

    }

    public static void randomPetting(Human[] humans, Animal[] animals){
        int human_index = (int)(Math.random() * humans.length);
        int animal_index = (int)(Math.random() * animals.length);
        humans[human_index].pet(animals[animal_index]);


    }
   
}
