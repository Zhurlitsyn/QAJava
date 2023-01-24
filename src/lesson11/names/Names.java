package lesson11.names;

import java.util.ArrayList;
import java.util.Random;
import java.util.SortedMap;

public enum Names {
    MAX("Max"),
    DANIIL("Danik"),
    NATALI("Natali"),
    ROBERT("Robert"),
    KATE("Kate"),
    LORAIN("Lorain");

    public String value;

    Names(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }


    public static void countOfNames(int count) {
        ArrayList<String> countNames = new ArrayList<>();
        Names[] naName = Names.values();

        Random rnd = new Random();
        for (int i = 0; i < count; i++) {
            // random Names value
            String tempName = naName[(int) (Math.random() * (naName.length))].getValue();
            countNames.add(i, tempName);
            System.out.print(countNames.get(i) + " ");
        }
// counting entry of names
        while (!countNames.isEmpty()) {
            if (countNames.size() == 1) {
                System.out.println("\n" + countNames.get(0) + " entry only one time.");
                break;
            }
            int counter = 1;
            String firstName = countNames.get(0);
            System.out.print("\n" + firstName + " entry ");
            for (int i = 1; i < countNames.size(); i++) {
                if (firstName == countNames.get(i)) {
                    counter++;
                    countNames.remove(i);
                    i--;
                }
            }
            if (counter == 1) {
                System.out.print(" entry only one time.");
                countNames.remove(0);
            } else {
                System.out.print(" " + counter + " times.");
                countNames.remove(0);
            }

        }
    }

}
