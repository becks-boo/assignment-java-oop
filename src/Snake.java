public class Snake extends Reptile {
    public Snake(String name, String mainColor, String bodySurface, int sizeInCm, int lifeExpectancyInMonths, BioSex bioSex) {
        super(name, mainColor, bodySurface, sizeInCm, lifeExpectancyInMonths, bioSex);
    }

    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }

    @Override
    public void move() {
        System.out.println("Crawling.");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void breathe() {

    }

    @Override
    public void excrete() {

    }
}
