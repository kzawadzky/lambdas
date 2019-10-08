package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {
    @FXML
    private Button clickbaitButton;

    public void initialize() {
        clickbaitButton.setOnAction(event -> System.out.println("That's a bait, mate..."));
    }


    // that's the same thing, without lambda.
    /*public void initialize () {
        clickbaitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("That's bait mate.");
            }
        });
    }*/

}
