package lesson11.studentsList;

public class StudList {
    private int group;
    private String name;
    private int marks;


    public StudList() {

    }

    public StudList(int group, String name, int marks) {
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

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student: " +
                "group number: " + group +
                ", Name: " + name + ", Mark:" + marks;
    }

    public String printGroupMark (String name) {
        return "This Student: \nGroup : " + group + ", Mark: " + marks;
    }
}
