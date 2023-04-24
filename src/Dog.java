public class Dog extends Animal implements IPet {
    public void bark () {
        System.out.printf("Woof");
    }
    public void playWith() {
        System.out.println("Playing with dog");
    }
}
