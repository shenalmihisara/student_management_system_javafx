package controler;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginPageControler {

    @FXML
    private Button BtnLogin;

    @FXML
    private PasswordField TxtPassword;

    @FXML
    private TextField txtUserName;

    @FXML
    void BtnLoginOnAction(ActionEvent event) {
        String name = txtUserName.getText();
        String password = TxtPassword.getText();
        boolean b = checkUsernameAndPassword(name,password);

        if (b){
            Stage stage = new Stage();
            try {
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/Home_Page.fxml"))));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.show();
        }
    }

    private boolean checkUsernameAndPassword(String name, String password) {
        if (name.equals("Nimal") && password.equals("1234")) {
            return true;
        }
            return false;
    }

}
