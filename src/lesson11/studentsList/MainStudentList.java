/*
Output of information about the Student by his Name
Using List collection
 */
package lesson11.studentsList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainStudentList {
    public static void main(String[] args) {
        List<StudList> studList = new ArrayList<StudList>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count of Students:");
        int countStud = sc.nextInt();
        for (int i = 0; i < countStud; i++) {
            System.out.println("Enter Group, Name, Mark:");
            int group = sc.nextInt();
            String studName = sc.next();
            int mark = sc.nextInt();
            studList.add(i, new StudList(group, studName, mark));
        }
        // output list of Students
        for (StudList a : studList) {
            System.out.println(a);
        }


        System.out.println("* * * * * * * * * * * * * *");
        System.out.println("Enter Student Name:");
        String studentName = sc.next();
        int counter = 0;
        for (StudList b : studList) {
            System.out.println(b.getName());
            if (b.getName().equals(studentName)) {
                System.out.println(b.printGroupMark(studentName));
                counter++;
            }
        }
        if (counter == 0) System.out.println("There is no Student with that Name!");

    }
}
