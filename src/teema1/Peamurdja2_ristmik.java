package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

/**
 * Täpselt nagu oli fooriga, on nüüd ristmikuga. Kuidas esiteks
 * ristmik üles ehitada loe Foori README.md-st: https://github.com/KristerV/javaHarjutused
 */
public class Peamurdja2_ristmik extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Foor foor = new Foor();
        Foor foor1 = new Foor(Foor.YLEMINE, primaryStage);
        Foor foor2 = new Foor(Foor.ALUMINE, primaryStage);
        Foor foor3 = new Foor(Foor.VASAK, primaryStage);
        Foor foor4 = new Foor(Foor.PAREM, primaryStage);

        for (int a=0; a<5; a++) {
            foor1.vahetaPunast();
            foor2.vahetaPunast();
            foor3.vahetaRohelist();
            foor4.vahetaRohelist();
            foor1.paus(5);
            foor1.kustutaPunane();
            foor2.paus(5);
            foor2.kustutaPunane();
            foor3.paus(5);
            foor3.kustutaRoheline();
            foor4.paus(5);
            foor4.kustutaRoheline();

            foor1.vahetaKollast();
            foor2.vahetaKollast();
            foor3.vahetaKollast();
            foor4.vahetaKollast();
            foor1.paus(1);
            foor1.kustutaKollane();
            foor2.paus(1);
            foor2.kustutaKollane();
            foor3.paus(1);
            foor3.kustutaKollane();
            foor4.paus(1);
            foor4.kustutaKollane();

            foor4.vahetaPunast();
            foor3.vahetaPunast();
            foor2.vahetaRohelist();
            foor1.vahetaRohelist();
            foor4.paus(1);
            foor4.kustutaPunane();
            foor3.paus(1);
            foor3.kustutaPunane();
            foor2.paus(1);
            foor2.kustutaRoheline();
            foor1.paus(1);
            foor1.kustutaRoheline();

            foor1.vahetaKollast();
            foor2.vahetaKollast();
            foor3.vahetaKollast();
            foor4.vahetaKollast();
            foor1.paus(1);
            foor1.kustutaKollane();
            foor2.paus(1);
            foor2.kustutaKollane();
            foor3.paus(1);
            foor3.kustutaKollane();
            foor4.paus(1);
            foor4.kustutaKollane();
        }


    }
}
