public abstract class Animal {
    public String name;
    public String mainColor;
    public int sizeInCm;
    private int lifeExpectancyInMonths;

    public abstract void eat();
    public abstract void drink();
    public abstract void procreate();

    public void breathe() {
        System.out.println("Breathing.");
    };
}
