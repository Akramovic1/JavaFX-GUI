package home;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class Controller {
    @FXML
    private ImageView ProfilePicture;

    @FXML
    private Label NameOfUser;

    @FXML
    private Button btnInbox;

    @FXML
    private Button btnNewEmail;

    @FXML
    private Button btnContacts;

    @FXML
    private Button btnFilters;

    @FXML
    private Button btnTrash;

    @FXML
    private Button btnDetails;

    @FXML
    private Button btnSignOut;

    @FXML
    private Pane pnlCustomer;

    @FXML
    private Pane pnlOrders;

    @FXML
    private Pane pnlMenus;

    @FXML
    private Pane pnlOverview;

    @FXML
    private TextField Search;

    @FXML
    private Label TotalMessages_Counter;

    @FXML
    private Label TotalDelivered_Counter;

    @FXML
    private Label TotalSent_Counter;

    @FXML
    private Label Trash_Counter;

    @FXML
    private VBox pnItems;

    @FXML
    private TableView<?> TableView;

    @FXML
    private TableColumn<?, ?> NameOfSender;

    @FXML
    private TableColumn<?, ?> Subject;

    @FXML
    private TableColumn<?, ?> DeliveryDate;

    @FXML
    private Button CancelButton;

    @FXML
    void Close(ActionEvent event) {

    }

    @FXML
    void btnEvent_Contacts(ActionEvent event) {

    }

    @FXML
    void btnEvent_Details(ActionEvent event) {

    }

    @FXML
    void btnEvent_Filters(ActionEvent event) {

    }

    @FXML
    void btnEvent_Inbox(ActionEvent event) {

    }

    @FXML
    void btnEvent_NewEmail(ActionEvent event) {

    }

    @FXML
    void btnEvent_SignOut(ActionEvent event) {

    }

    @FXML
    void btnEvent_Trash(ActionEvent event) {

    }
}
