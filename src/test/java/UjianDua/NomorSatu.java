package UjianDua;

public class NomorSatu {

    public static void main(String[] args) {
        for (int i = 9; i > 5; i--) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 1) {
                    System.out.print(j);
                } else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}
