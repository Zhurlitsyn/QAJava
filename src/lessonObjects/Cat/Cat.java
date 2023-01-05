package lessonObjects.Cat;

public class Cat {
    String catName;
    double catAge;
    static boolean fedCat;

    public Cat() {
    }

    public Cat(String catName, double catAge, boolean fedCat) {
        this.catName = catName;
        this.catAge = catAge;
        this.fedCat = fedCat;
    }

    public void setFedCat(boolean fedCat) {
        this.fedCat = fedCat;
    }
}
