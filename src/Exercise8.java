import java.util.Scanner;

class Animal{
    String food;
    String location;

    public void makeNoise(){
        System.out.println("The animal is making noise");
    }

    public void eat(){
        System.out.println("The animal is eating");
    }

    public void sleep(){
        System.out.println("The animal is sleeping");
    }
}

class Dog extends Animal{
    String breed;

    @Override
    public void makeNoise(){
        System.out.println("The dog is barking");
    }

    @Override
    public void eat(){
        System.out.println("The dog is eating canned foods");
    }
}

class Cat extends Animal{
    String fur;

    @Override
    public void makeNoise(){
        System.out.println("The cat is meowing");
    }

    @Override
    public void eat(){
        System.out.println("The cat is eating dry food");
    }
}

class Horse extends Animal{
    String sex;

    @Override
    public void makeNoise(){
        System.out.println("The horse is snorting");
    }

    @Override
    public void eat(){
        System.out.println("The horse is eating grass");
    }
}


class Vet{
    public void treatAnimal(Animal animal){
        System.out.println("Animal's food: " + animal.food);
        System.out.println("Animal's location: " + animal.location);
    }
}


public class Exercise8 {
    public static void main(String[] args){
        Vet Doctor = new Vet();
        Scanner in = new Scanner(System.in);
        System.out.println("Input amount of the animals");
        int amount = in.nextInt();
        Animal[] AnimalArray = new Animal[amount];
        for (int i = 0; i < amount; i++){
            if (i == 0){
                AnimalArray[i] = new Horse();
                AnimalArray[i].food = "Grass";
                AnimalArray[i].location = "Field";
            }
            else if (i % 2 == 0){
                AnimalArray[i] = new Cat();
                AnimalArray[i].food = "Dry food";
                AnimalArray[i].location = "Home";
            }
            else if (i % 2 != 0){
                AnimalArray[i] = new Dog();
                AnimalArray[i].food = "Canned food";
                AnimalArray[i].location = "Yard";
            }
        }
        for (int i = 0; i < amount; i++){
            Doctor.treatAnimal(AnimalArray[i]);
        }
        in.close();
    }
}
