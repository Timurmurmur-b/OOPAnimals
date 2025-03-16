public class Animal {
    private String name;
    private int age;
    private static int animalCount;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        animalCount+=1;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void speak(){
        System.out.println("Животное издает звук.");
    }
    public void info(){
        System.out.println(name);
    }
    public void info(int weight){
        System.out.println(name + " " + weight);

    }
    public void info(String habitat){
        System.out.println(name +" "+ habitat);

    }
    public static void getAnimalCount(){
        System.out.println(animalCount);
    }
}
