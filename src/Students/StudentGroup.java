package Students;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentGroup {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count of Students Groups: ");
        int groupCount = sc.nextInt();
        System.out.println("Enter number of Students: ");
        int studCount = sc.nextInt();
        Student[] stu = new Student[studCount];

        StudentsFill.fillRandom(stu, studCount, groupCount);

        //sort massive by GroupNumber
        Arrays.sort(stu, Comparator.comparing(Student::getGroup));
        System.out.println("----------------------------------");
        StudentsFill.printObjArray(stu);

        // calculate average and put into new array
        double[] forAvg = new double[groupCount];
        int avCount = 0;

        for (int i = 0; i < studCount; i++) {
            double averageMarks = 0;
            int countOfStud = 0;
            while (stu[i].getGroup() == avCount) {
                averageMarks += stu[i].getMarks();
                countOfStud++;
                if (i == studCount - 1) break;
                i++;
            }
            //if (i == studCount - 1) break;
            i--;
            if (avCount >= groupCount) break;
            forAvg[avCount] = averageMarks / (countOfStud);
            System.out.printf("%.2f", forAvg[avCount]);
            System.out.print(" | ");
            System.out.println();
            avCount++;

        }

        // search minimum and print group to kick out
        int kick = StudentsFill.minInArray(forAvg);
        System.out.println("The weakest group of students is # " + kick);
        for (int i = 1; i < studCount; i++) {
            if (stu[i].getGroup() == kick) {
                System.out.println(stu[i].getName() + " " + stu[i].getMarks());
            }
        }


    }
}

