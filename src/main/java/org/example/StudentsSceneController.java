package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.example.model.Model;

public class StudentsSceneController {

    private Model model = new Model();

    @FXML
    private Label colorLabel;

    @FXML
    private Label bdLabel;

    @FXML
    private Label creditsLabel;

    @FXML
    private Label nameLabel;

    /*private void refresh(){
        nameLabel.setText(model.getStudent().getName());
    }*/

    @FXML
    void changeName(ActionEvent event) {
        model.getStudent().setName("Tom Smith");
       // refresh();
    }

    @FXML
    void loadData(ActionEvent event) {
       // refresh();
        nameLabel.textProperty().bind(model.getStudent().nameProperty());
        creditsLabel.setText("" + model.getStudent().getCredits());
        bdLabel.setText(model.getStudent().getDateOfBirth().toString());
    }

    @FXML
    void changeColor(ActionEvent event) {
        if (colorLabel.getText().equals("Black"))
            colorLabel.setText("White");
        else colorLabel.setText("Black");
    }
}
