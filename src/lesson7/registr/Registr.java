package lesson7.registr;

import java.util.ArrayList;

public class Registr {
    public static ArrayList<Docs> registr;

    public Registr() {
        registr = new ArrayList<>(10);
    }

    public static void saveDoc(Docs doc) {
        registr.add(doc);
    }

    public static void displayDocument(Class cl) {
        for (int a = 0; a < 10; a++) {
            if (registr.get(a).getClass().equals(cl))
                System.out.println(registr.get(a));
        }
    }

    public static void displayDocument(int numDoc) {
        registr.get(numDoc).displayDoc();
       // System.out.println(registr.get(numDoc));
    }

    public static void findDoc(String numDoc) {
        boolean flag = false;
        for (int a = 0; a < 10; a++) {
            if (registr.get(a).getNumOfDoc().equals(numDoc)) {
                //System.out.println(registr.get(a));
                registr.get(a).displayDoc();
                flag = true;
            }
        }
        if (!flag) System.out.println("There is NO document with this number");
    }

    public static ArrayList<Docs> getDocuments() {
        return registr;
    }

    public void setDocuments(ArrayList<Docs> documents) {
        registr = documents;
    }
}
