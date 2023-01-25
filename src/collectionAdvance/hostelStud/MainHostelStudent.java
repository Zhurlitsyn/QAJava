package collectionAdvance.hostelStud;

import java.util.Comparator;

import java.util.*;

public class MainHostelStudent {
    public static void main(String[] args) {

        ArrayList<Hostel> hostels = new ArrayList<>();
        Hostel h1 = new Hostel("Mariott", "Minsk, Dzerzhynski ave. 2");
        Hostel h2 = new Hostel("DoubleTree", "Minsk, Pobediteley ave. 10");
        Hostel h3 = new Hostel("Hampton", "Minsk, Tolstogo str. 6");
        hostels.add(h1);
        hostels.add(h2);
        hostels.add(h3);

        List<StudentInHostel> listStudents = List.of(
                new StudentInHostel("Peter", "M007", h1, "201"),
                new StudentInHostel("Mario", "N23", h1, "301"),
                new StudentInHostel("Danny", "O91", h1, "201"),
                new StudentInHostel("HannyBunny", "G20", h1, "201"),
                new StudentInHostel("ThePooh", "Q19", h1, "301"),
                new StudentInHostel("Naruto", "G20", h2, "101"),
                new StudentInHostel("Okinawa", "Q19", h2, "102"),
                new StudentInHostel("Kate", "M007", h2, "102"),
                new StudentInHostel("Smash", "P56", h3, "310"),
                new StudentInHostel("Sam", "O91", h3, "312"),
                new StudentInHostel("Lionel", "N23", h3, "310"),
                new StudentInHostel("Wednesday", "M007", h3, "310"),
                new StudentInHostel("KittyCat", "P56", h3, "312"));

        System.out.println("Enter Hostel title: ");
        String hostelTitle = new Scanner(System.in).next();

        for (Hostel ho : hostels) {
            if (ho.getHostelTitle().equals(hostelTitle)) {
                System.out.println(ho);
            }
        }
        ArrayList<StudentInHostel> tempForSort = new ArrayList<>();
        for (StudentInHostel stih : listStudents) {
            if (stih.getHostel().getHostelTitle().equals(hostelTitle)) {
                //System.out.println(stih);
                tempForSort.add(stih);
            }
        }

        Collections.sort(tempForSort, Comparator.comparing(StudentInHostel::getRoom));
        String numRoom = tempForSort.get(0).getRoom();
        System.out.println("Room #" + numRoom + ":");
        System.out.println(tempForSort.get(0).printNameRoom());
        for (int i = 1; i < tempForSort.size(); i++) {
            if (tempForSort.get(i).getRoom().equals(numRoom)) {
                System.out.println(tempForSort.get(i).printNameRoom());
            } else {
                numRoom = tempForSort.get(i).getRoom();
                System.out.println("Room #" + numRoom + ":");
                System.out.println( tempForSort.get(i).printNameRoom());
            }
        }

    }
}
