package exercise.examples;

public  class Dog extends Animal {
    public Dog(int x, int y) {
        super(x, y);
    }

    public void bite() {
        System.out.println("DOG: I bite.");
    }

    @Override
    public void go() {
        super.go();
        System.out.println("Dog: I go.");
    }

    @Override
    public void eat() {
        System.out.println("DOG: I eat.");
    }
}
