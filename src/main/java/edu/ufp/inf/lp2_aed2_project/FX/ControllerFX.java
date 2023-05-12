package edu.ufp.inf.lp2_aed2_project.FX;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ControllerFX {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Create Graph!");
    }
}