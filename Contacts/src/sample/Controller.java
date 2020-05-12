package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Controller {

    @FXML
    private TableView<?> table_view;

    @FXML
    private TableColumn<?, ?> Name;

    @FXML
    private TableColumn<?, ?> Mobile;

    @FXML
    private TableColumn<?, ?> Email;

    @FXML
    private Button add;

    @FXML
    private Button back;

    @FXML
    private Button delete;

    @FXML
    void add_action(ActionEvent event) {

    }

    @FXML
    void back_action(ActionEvent event) {

    }

    @FXML
    void delete_action(ActionEvent event) {

    }

}
