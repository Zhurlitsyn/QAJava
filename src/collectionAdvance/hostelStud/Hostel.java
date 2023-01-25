package collectionAdvance.hostelStud;

public class Hostel {
    private String hostelTitle;
    private String hostelAddress;

    public Hostel(String hostelTitle, String hostelAdress) {
        this.hostelTitle = hostelTitle;
        this.hostelAddress = hostelAdress;
    }

    public String getHostelTitle() {
        return hostelTitle;
    }

    public void setHostelTitle(String hostelTitle) {
        this.hostelTitle = hostelTitle;
    }

    public String getHostelAdress() {
        return hostelAddress;
    }

    public void setHostelAdress(String hostelAdress) {
        this.hostelAddress = hostelAdress;
    }

    @Override
    public String toString() {
        return "Hostel " + hostelTitle + ", Address " + hostelAddress;
    }
}
