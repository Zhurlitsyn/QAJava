package lessonObjects;

public class Hdd {
    String modelHdd;
    int volumeHdd;
    String typeHdd;

    public Hdd() {
        this.modelHdd = "Samsung";
        this.volumeHdd = 256;
        this.typeHdd = "internal";
    }

    public Hdd(String modelHdd, int volumeHdd, String typeHdd) {
        this.modelHdd = modelHdd;
        this.volumeHdd = volumeHdd;
        this.typeHdd = typeHdd;
    }

    @Override
    public String toString() {
        return "{" +
                "modelHdd='" + modelHdd + '\'' +
                ", volumeHdd=" + volumeHdd +
                ", typeHdd='" + typeHdd + '\'' +
                '}';
    }

    public void printHdd ()
    {
        System.out.println("Model RAM: " + this.modelHdd + " Volume RAM: " + this.volumeHdd);

    }
}
