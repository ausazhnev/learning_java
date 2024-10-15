class GoodDog {
    private int size;

    public int getSizw() {
        return size;
    }
    public void setSize(int s) {
        size = s;
    }

    void bark() {
        if (size > 60) {
            System.out.println("Гаф - Гаф!");
        } else if (size > 14) {
            System.out.println("Аф - Аф.");
        } else {
            System.out.println("Тяф-тяф....");
        }
    }
}

class GoodDogTest {
    public static void main(String[] args) {
        GoodDog firstDog = new GoodDog();
        firstDog.setSize(70);
        GoodDog secondDog = new GoodDog();
        secondDog.setSize(20);
        System.out.println("Размер первой собаки: " + firstDog.getSizw());
        firstDog.bark();
        System.out.println("Размер второй собаки: " + secondDog.getSizw());
        secondDog.bark();
    }
}