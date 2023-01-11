package lessonObjects;

public class Ram {
    String modelRam;
    int volumeRam;

    public Ram() {
        this.modelRam = "Kingston";
        this.volumeRam = 16;
    }

    public Ram(String modelRam, int volumeRam) {
        this.modelRam = modelRam;
        this.volumeRam = volumeRam;
    }

    @Override
    public String toString() {
        return "{" +
                "modelRam='" + modelRam + '\'' +
                ", volumeRam=" + volumeRam +
                '}';
    }

    public void printRam ()
    {
        System.out.println("Model RAM: " + this.modelRam + " Volume RAM: " + this.volumeRam);
    }
}
