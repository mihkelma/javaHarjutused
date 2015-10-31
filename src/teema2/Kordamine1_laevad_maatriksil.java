package teema2;

import java.util.Arrays;
import java.util.Scanner;


/**
 * Loo laevade pommitamine, kus on vaid 1x1 laevad ja kasutaja saab arvuti laevasid pommitada 9x9 maatriksil.
 */
public class Kordamine1_laevad_maatriksil {
    //esimene asi - main meetod!
    static int [][] laud;
    static int lauaLaius = 3;
    static int lauaKorgus = 3;


    public static void main(String[] args) {
        genereeriLaud();
        laevadeGenereerimine();
        while (kasOnVeelAllesLaevu() != false) {
            int[] xy = kysiPommitamiseAsukoht();
            kontrolliTabamust(xy);
            kasOnVeelAllesLaevu();
        }
        gameOver();

    }

    private static void gameOver() {
        System.out.println("Mäng läbi!");
    }

    private static boolean kasOnVeelAllesLaevu() {
        //võta laud
        boolean x = false;
        for (int i = 0; i < lauaKorgus; i++) {
            for (int j = 0; j < lauaLaius; j++) {
                if(laud[i][j] == 1) {
                    x = true;
                }
            }
        }
        return x;
        //vaata, kas on veel ühtesid
        //kui on, küsi veel
        //
    }

    private static void kontrolliTabamust(int[] xy) {
        int x = xy[0];
        int y = xy[1];
        int sihtpunkt = laud [y][x];
        if(sihtpunkt == 1) {
            System.out.println("Pihtas!");
            laud[y][x] = 2;
        } else if (sihtpunkt == 0) {
            System.out.println("Mööda");
        }
    }

    private static int[] kysiPommitamiseAsukoht() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ütle veeru number: ");
            int x = sc.nextInt() -1;
            System.out.println("Ütle rea number: ");
            int y = sc.nextInt() - 1;
            int[] xy = {x, y};
            return xy;

        } catch (Exception e) {
            System.out.println("Kirjuta ikka number!");
        }
        return kysiPommitamiseAsukoht();                // kui katki, siis käivita see meetod uuesti, kuni kõik ok

    }

    private static void laevadeGenereerimine() {
        for (int i = 0; i < lauaKorgus; i++) {
            for (int j = 0; j < lauaLaius ; j++) {
                laud [i][j] = (int) (Math.random() * 2);
            }
            System.out.println(Arrays.toString(laud[i]));
        }
    }


    private static void genereeriLaud() {
        laud = new int[lauaKorgus][lauaLaius];
    }

}
