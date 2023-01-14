package lesson8;

public enum DayOfWeek {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");
    private String title;

    DayOfWeek(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public static void printDays() {
        DayOfWeek[] temp = DayOfWeek.values();
        for (DayOfWeek a : temp)
            if (a.getTitle() == "Saturday"  || a.getTitle() == "Sunday") {
                System.out.println(a.getTitle() + " - It's dayoff");
            } else System.out.println(a.getTitle() + " - It's a workday.");
    }
}
