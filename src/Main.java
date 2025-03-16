//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Степа", 10, "Такса");
        Dog dog2 = new Dog("Сигма", 3, "Овчарка");
        Cat cat = new Cat("Серый", 5, "Красный");
        Bird bird = new Bird("Чик-чирик", 13, 10);
        Animal.getAnimalCount();
        dog1.speak();
        dog2.speak();
        cat.speak();
        bird.speak();
        dog1.info();
        dog2.info(42);
        cat.info("Домик");
        bird.info("Спальня");
    }
}