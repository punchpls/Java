class Person{
    String fullName;
    int age;

    public void move(){
        System.out.println(this.fullName + " is moving");
    }

    public void talk(){
        System.out.println(this.fullName + " is talking");
    }

    Person(){}

    Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

}


public class Exercise2 {
    public static void main(String[] args) {
        Person P1 = new Person();
        Person P2 = new Person("Sergey", 27);

        P1.move();
        P1.talk();

        P2.move();
        P2.talk();
    }
}
