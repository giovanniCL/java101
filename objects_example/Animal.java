package objects_example;

abstract class Animal {
    private String name;
    private String sound;
    private static int number_of_animals;

    //Constructor
    public Animal(String name, String sound){
        this.name = name;
        this.sound = sound;
        number_of_animals++;
    }

    //Getters
    public String getName(){
        return this.name;
    }

    public static int getNumberOfAnimals(){
        return number_of_animals;
    }

    //Methods
    public void make_sound(){
        System.out.println(sound + " My name is " + name);
    }

}
