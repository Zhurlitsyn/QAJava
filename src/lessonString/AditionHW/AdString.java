package lessonString.AditionHW;

public class AdString {
    private String str;
    private int length;

    public AdString(String str) {
        this.str = str;
        this.length = str.length();
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return str;
    }
}

