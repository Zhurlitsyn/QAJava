package lessonObjects.Bankomat;

public class PrintWithdraw {
    private static String[] notesStr = new String[]{" x 100$ (hundred notes)", " x 50$ (fifty notes)", " x 20$ (twenty notes)"};

    public static void print(int[] arr) {
        System.out.println("Get the money!");

        for (int i = 0; i < 3; i++) {
            if (arr[i] != 0)
                System.out.println(arr[i] + "" + PrintWithdraw.notesStr[i]);
        }
    }
}
