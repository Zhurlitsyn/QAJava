package lessonObjects.Bankomat;

public class Notes {
    private static int hundred;
    private static int fifty;
    private static int twenty;
    //private static int sum;

    public Notes() {
        hundred = 0;
        fifty = 0;
        twenty = 0;
        //sum = 0;
    }

    /*public Notes(int n100, int n50, int n20) {
        hundred = n100;
        fifty = n50;
        twenty = n20;
    }*/

    public static int getHundred() {
        return hundred;
    }

    public static int getFifty() {
        return fifty;
    }

    public static int getTwenty() {
        return twenty;
    }

    static void addNotes(int n100, int n50, int n20) {
        hundred += n100;
        fifty += n50;
        twenty += n20;
    }
    static void issueNotes(int n100, int n50, int n20) {
        hundred -= n100;
        fifty -= n50;
        twenty -= n20;
    }

    static int sumNotes() {
        return hundred * 100 + fifty * 50 + twenty * 20;
    }

}
