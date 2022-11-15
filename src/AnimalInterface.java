public interface AnimalInterface {
    public abstract void eat();
    public abstract void drink();
    public abstract void move();
    public abstract void procreate();

    default void breathe() {
        System.out.println("Breathing.");
    }
}
