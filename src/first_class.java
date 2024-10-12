class Dog {
    int age;
    String breed;
    String name;
    void bark() {
        System.out.println("Аф - Гаф - Гаф!!"); // Мотив лая собаки как в Need for Speed: Underground
        }
    }
public class first_class {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Python";
        myDog.age = 3;
        myDog.bark();
    }
}
