package HallgatoFelulet;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class StudentMain extends OpenFunctions implements Initializable {

    @FXML
    javafx.scene.web.WebView WebView;

    public static void megnyit(ActionEvent actionEvent) throws IOException {
        Parent p = FXMLLoader.load(StudentMain.class.getResource("StudentMain.fxml"));
        Scene s = new Scene(p);

        //stage információ
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        window.setScene(s);
        window.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        WebView.getEngine().load(getClass().getResource("../MainMenu/ErasmusMainMenu.html").toString());
    }
}
