package wzorce.Fasada;

public class Utils {

    public static void wypiszOdNdoM(int n, int m) {
        for (int i = n; i < m; i++) {
            System.out.println(i);
        }
    }

    public static void wypiszOdNdoMPodzielnePrzezP(int n, int m, int p) {
        for (int i = n; i < m; i++) {
            if (i % p == 0) {
                System.out.println(i);
            }
        }
    }


}
