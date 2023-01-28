package lessonString;
// methods for homework basic
public class Strings {

    public static void first(String str) {
        System.out.println(str.substring(0, 4) + str.substring(9, 13));
    }

    public static void second(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.replace(5, 8, "***");
        sb.replace(14, 17, "***");
        System.out.println(sb.toString());
    }

    public static String third(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.delete(0, 5);
        sb.replace(3, 9, "/");
        sb.replace(7, 9, "/");
        sb.replace(9, 9, "/");
        return sb.toString().toLowerCase();
    }

    public static void fours(String str) {
        System.out.println("Letters: " + third(str).toUpperCase());
    }

    public static void five(String str) {
        boolean include = false;
        if (str.contains("abc") || str.contains("ABC")) {
            include = true;
        }
        System.out.println(include);
    }

    public static void six(String str) {
        boolean include = false;
        if (str.startsWith("555")) {
            include = true;
        }
        System.out.println(include);
    }

    public static void seven(String str) {
        boolean include = false;
        if (str.endsWith("1a2b")) {
            include = true;
        }
        System.out.println(include);
    }
}
