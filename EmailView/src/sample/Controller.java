package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;

import javax.print.DocFlavor;
import java.util.ResourceBundle;

public class Controller {

    @FXML
    private AnchorPane parent;

    @FXML
    private Button Back;

    @FXML
    private Label Email;

    @FXML
    private Label Subject;

    @FXML
    private TextArea Message;

    @FXML
    private TextArea Attach;

    private double xOffSet=0;
    private double yOffset=0;


    @FXML
    void back_action(ActionEvent event) {

    }

}
