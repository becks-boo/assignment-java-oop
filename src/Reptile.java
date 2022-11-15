public abstract class Reptile extends Animal {
    String bodySurface = "scale";

    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }

    public abstract void move();

    @Override
    public void procreate() {
        System.out.println("Laying eggs.");
    }
}
