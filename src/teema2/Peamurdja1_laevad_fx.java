package teema2;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;

/**
 * Joonista laevade pommitamine kasutades JavaFXi.
 */
public class Peamurdja1_laevad_fx extends Application{
    Stage lava;
    GridPane laud;
    int lauaPikkusLaevades = 5;
    int laevaServaPikkusPikslites = 150;
    int lauaKoguPikkusPikslites = lauaPikkusLaevades * laevaServaPikkusPikslites;
    StackPane maailm;


    @Override
    public void start(Stage primaryStage) throws Exception {
        lava = primaryStage;
        seadistaLava();
        paigutaLaevad();
        reageeriKlikile();
        laevuOnAlles();
        // gameover();

    }

    private void reageeriKlikile() {
        laud.setOnMouseClicked(event -> {
            Rectangle ruut = (Rectangle) event.getTarget();                     // sulud teevad type casting
            String ruuduId = ruut.getId();
            Image image = new Image("teema2/pirate.png");
            ImagePattern ip = new ImagePattern(image);

            if (ruuduId.equals("laev")) {
                System.out.println("Pihtas");
                ruut.setId("pihtas");
                ruut.setFill(ip);
            } else if (ruuduId.equals("meri")) {
                System.out.println("MÖÖDA");
                ruut.setFill(Color.RED);
            } else if (ruuduId.equals("Pihtas")) {
                System.out.println("Kõmmutad laipa");
            }

            if (!laevuOnAlles()) {
                System.out.println("GAMEOVER");
                gameover();
            }

        });
    }

    private void gameover() {
        Label lopp = new Label("Võitsid");
        lopp.setFont(new Font(30));
        lopp.setTextFill(Color.BLACK);
        maailm.getChildren().add(lopp);
    }

    private boolean laevuOnAlles() {
        for (Node ruut : laud.getChildren()) {
            if (ruut.getId().equals("laev")) {
                return true;
            }
        }
        return false;
    }

    private void paigutaLaevad() {
        for (int i = 0; i < lauaPikkusLaevades; i++) {
            for (int j = 0; j < lauaPikkusLaevades; j++) {
                Rectangle ruut = new Rectangle(laevaServaPikkusPikslites, laevaServaPikkusPikslites);
                int a = (int) (Math.random()*2);
                if(a == 1) {
                    ruut.setId("laev");
                } else if(a == 0) {
                    ruut.setId("meri");
                }
                ruut.setStroke(Color.BLACK);
                ruut.setFill(Color.BLUE);
                laud.add(ruut, i, j);

            }

        }
    }

    private void seadistaLava() {
        //lava, stseen, layout
        laud = new GridPane();
        maailm = new StackPane();
        maailm.getChildren().add(laud);

        // määrame lava mõõtmed vastavalt ruutude arvule ja külejpikkusele
        Scene manguStseen = new Scene(maailm, lauaKoguPikkusPikslites, lauaKoguPikkusPikslites);
        lava.setScene(manguStseen);
        lava.show();
        lava.setOnCloseRequest(event -> System.exit(0));
    }
}
