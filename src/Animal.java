import enums.Sex;

public abstract class Animal implements AnimalInterface {
    public String name;
    public String mainColor;
    public String bodySurface;
    public int sizeInCm;

    private int birthday;
    private int lifeExpectancyInMonths;
    private Sex sex;
}
