package controls;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Login implements Initializable {

    @FXML
    private TextField txtLogin;

    @FXML
    private PasswordField txtPassword;

        @Override
        public void initialize(URL location, ResourceBundle resources) {

        }

        @FXML
        public void logar() throws IOException {
            new MenuPrincipal().show();
        }


}
