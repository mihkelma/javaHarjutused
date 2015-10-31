package teema2;

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Created by mmatson on 31.10.15.
 */
public class uus_harj_label extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Stage lava = new Stage();
        Pane pane = new Pane();
        Label l = new Label();

        ToggleGroup g = new ToggleGroup();
        RadioButton e1 = new RadioButton("Nupp 1");
        RadioButton e2 = new RadioButton("Nupp 2");
        RadioButton e3 = new RadioButton("Nupp 3");
        e1.setToggleGroup(g);
        e2.setToggleGroup(g);
        e3.setToggleGroup(g);
        e3.setSelected(true);

        pane.getChildren().addAll(e1, e2, e3);
        lava.show();
    }
}
