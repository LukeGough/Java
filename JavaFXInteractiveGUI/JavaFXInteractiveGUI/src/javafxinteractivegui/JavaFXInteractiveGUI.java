package javafxinteractivegui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class JavaFXInteractiveGUI extends Application {

    // start method
    @Override
    public void start(Stage stage) {
        // set stage title
        stage.setTitle("Change me JavaFX");

        // create gridpane
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        // new lable and add to grid
        Label changeMe = new Label("Change me!");
        grid.add(changeMe, 0, 1);

        // new button and add to grid
        Button btn = new Button();
        grid.add(btn, 1, 1);

        // Event Handler
        btn.setText("Click to change him!");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // change lable text
                changeMe.setText("I've changed!");
            }
        });

        // create new stage
        Scene scene = new Scene(grid, 300, 275);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        // launch starts start
        launch(args);
    }
}
