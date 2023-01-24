package lesson11.students_new;

import java.util.Random;

public class Student {
    private int group;
    private String name;
    private double marks;


    public Student() {

    }

    public Student(int group, String name, double marks) {
        this.group = group;
        this.name = name;
        this.marks = marks;
    }
    public int getGroup() {
        return group;
    }
    public void setGroup(int group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public static void printObjArray(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getGroup() + " " + arr[i].getName() + " " + arr[i].getMarks());
        }

    }

    public static int minInArray(double[] arr) {
        double min = arr[0];
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }


    public static void fillRandom(Student[] arr, int studCount, int groupCount) {
        Random random = new Random();
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < studCount; i++) {
// set group number
            int gr = random.nextInt(groupCount);
            // set random Name
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 8; j++) {
                int number = random.nextInt(str.length());
                sb.append(str.charAt(number));
            }
            String name = sb.toString();

            // set random average mark
            double mark = Math.round((random.nextDouble(4) + 1) * 100);
            mark /= 100;
// fill the array of Students
            arr[i] = new Student(gr, name, mark);
            System.out.println(arr[i].getGroup() + " " + arr[i].getName() + " " + arr[i].getMarks());
        }
    }

}

