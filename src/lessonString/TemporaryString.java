package lessonString;

public class TemporaryString {
    private String str;
    private int lenght;

    public TemporaryString(String str) {
        this.str = str;
        this.lenght = str.length();
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public String toString() {
        return str;
    }
}
