package lesson5;

public class Main {
    public static void main(String[] args) {

        Bowl bowl = new Bowl();
        bowl.setVolume(20);

        Animal animal1 = new Animal("Animal1");
        Animal animal2 = new Animal("Animal2");
        animal1.printCountAnimal();

        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Cat1");
        cats[1] = new Cat("Cat2");
        cats[2] = new Cat("Cat3");
        cats[3] = new Cat("Cat4");
        cats[4] = new Cat("Cat5");
        for(Cat cat:cats){
            cat.eat(bowl);
            System.out.println(cat);
        }

        cats[1].printCountCat();
        animal1.printCountAnimal();
        System.out.println(bowl.getVolume());
    }
}
