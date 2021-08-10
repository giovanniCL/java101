package objects_example;
class Human {
    private String name;
    private int age;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void speak(){
        System.out.println("Hi, my name is "+ name + " and I am " + age + " years old.");
    }

    public void pet(Animal animal){
        System.out.println(this.name + " petted " + animal.getName() + ".");
    }
}