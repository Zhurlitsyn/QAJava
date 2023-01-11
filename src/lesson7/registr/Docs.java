package lesson7.registr;

import java.time.LocalDate;

public class Docs implements DisplayDoc{
    private LocalDate date;
    private String numOfDoc;

    public Docs() {
    }

    public Docs(LocalDate date, String numOfDoc) {
        this.date = date;
        this.numOfDoc = numOfDoc;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(int a, int b, int c) {
        this.date = LocalDate.of(a, b, c);
    }

    public String getNumOfDoc() {
        return numOfDoc;
    }

    public void setNumOfDoc(String numOfDoc) {
        this.numOfDoc = numOfDoc;
    }

    @Override
    public void displayDoc() {

    }

    @Override
    public String toString() {
        return "Docs{" +
                "date=" + date +
                ", numOfDoc='" + numOfDoc + '\'' +
                '}';
    }
}
