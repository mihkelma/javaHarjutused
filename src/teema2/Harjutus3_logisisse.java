package teema2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;

/**
 * 1. Loo sisse logimise ekraan (ainult visuaal)
 * 2. Määra üks võimalik kasutaja ja parool (andmebaasi veel ei kasuta)
 * 3. Ebaõnnestunud katse näitab kasutajale errorit
 * 4. Õnnestunud katse puhul vaheta pilt uue vastu (kasvõi roheline ring), .
 */
public class Harjutus3_logisisse extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vbox = new VBox();
        Scene stseen = new Scene(vbox);
        primaryStage.setScene(stseen);
        primaryStage.show();

        Label nimiLabel = new Label("Kasutajanimi:");
        TextField input = new TextField();
        Label paroolLabel = new Label("Parool:");
        PasswordField inputUserPass = new PasswordField();

        Button btn = new Button();
        btn.setText("Logi sisse");

        btn.setOnAction(event1 -> {
            String kasutajaSisu = input.getText();
            String paroolSisu = inputUserPass.getText();
            if (kasutajaSisu.equals("pätt") && paroolSisu.equals("häkk")) {
                System.out.println("OK");
            } else {
                System.out.println("Not OK");
            }
        });



        vbox.getChildren().addAll(nimiLabel, input, paroolLabel, inputUserPass, btn);
    }
}
