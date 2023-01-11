package lesson7.registr;

import java.util.ArrayList;

public class Registr {
    public  ArrayList<Docs> registr;

    public Registr() {
        registr = new ArrayList<>(10);
    }

    public void saveDoc(Docs doc) {
        registr.add(doc);
    }

    public void printDoc(String numDoc) {
        ArrayList<Docs> registerT = registr;
        boolean fund = false;
        for (int a = 0; a < registerT.size(); a++) {
            if (registerT.get(a).getNumOfDoc().equals(numDoc) && registerT.get(a).getNumOfDoc() != null) {
                registerT.get(a).displayDoc();
                fund = true;
            }
        }
        if (!fund) System.out.println("There is NO document with this number");
    }

    public ArrayList<Docs> getDocuments() {
        return registr;
    }

    public void setDocuments(ArrayList<Docs> documents) {
        registr = documents;
    }
}
