public class Bird extends Animal{
    private int wingSpan;
    public Bird(String name, int age,int wingSpan) {
        super(name, age);
        this.wingSpan = wingSpan;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }
    public void speak(){
        System.out.println("Птица поет");
    }
}
