public class Parrot extends Animal implements IPet, IBird{
    public void repeat (String text) {
        System.out.println(text);
    }
    public void playWith() {
        System.out.println("Playing with parrot");
    }

    public void fly() {
        System.out.println("Flying with bird");
    }
}
