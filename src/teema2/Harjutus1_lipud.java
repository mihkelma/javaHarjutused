package teema2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


/**
 * 1. Joonista eesti lipp kasutades kolme Rectangle
 * 2. Joonista Jaapani lipp kasutades Rectangle ja Circle
 */
public class Harjutus1_lipud extends Application {          //oluline, et extends ja Application on (javafx.application)

    @Override
    public void start(Stage primaryStage) throws Exception {
        eestiLipp();
        jaapaniLipp();


    }

    private void jaapaniLipp() {
        //ei ole static class
        Stage lava = new Stage();
        Pane pane = new Pane();
        Scene stseen = new Scene(pane, 600, 300);
        lava.setScene(stseen);

        Rectangle kast = new Rectangle(0,0,600,300);     // 2 parameetrit= laius ja kõrgus; 4 parameetrit - algusx, algusy,
        kast.setFill(Color.WHITE);                    // lõppx, lõppy

        Circle kast1 = new Circle(300, 150, 100);  // alt + J valib
        kast1.setFill(Color.RED);


        pane.getChildren().addAll(kast, kast1 );

        lava.show();
    }

    private void eestiLipp() {
        //ei ole static class
        Stage lava = new Stage();
        Pane pane = new Pane();
        Scene stseen = new Scene(pane, 600, 300);
        lava.setScene(stseen);

        Rectangle kast = new Rectangle(0,0,600,100);     // 2 parameetrit= laius ja kõrgus; 4 parameetrit - algusx, algusy,
        kast.setFill(Color.BLUE);                    // lõppx, lõppy

        Rectangle kast1 = new Rectangle(0, 100, 600, 100);  // alt + J valib
        kast1.setFill(Color.BLACK);

        Rectangle kast2 = new Rectangle(0, 200, 600, 100);
        kast2.setFill(Color.WHITE);

        pane.getChildren().addAll(kast, kast1,kast2 );

        lava.show();
    }

}
