package ni.edu.uam.demologin.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import ni.edu.uam.demologin.service.NavegationService;

public class LoginController {

    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField txtPassword;

    private final NavegationService
            navegationService = new NavegationService();

    @FXML
    private void iniciarSesion(ActionEvent actionEvent){
        String usuario = txtUsuario.getText();
        String password = txtPassword.getText();
        if (usuario.isBlank() || password.isBlank()) {
            UtilController.mostrarMensaje(
                    Alert.AlertType.WARNING,
                    "Validacion",
                    "Debe de ingresar usuario y contraseña"
            );
        }
        else {
            UtilController.mostrarMensaje(
                    Alert.AlertType.INFORMATION,
                    "Bienvenido",
                    "Inicio de sesion correcto"
            );
        }
    }

    @FXML
    private void abrirRegistro(ActionEvent actionEvent){
        try {
            navegationService.cambiarVista("registrar.fxml");
        }catch (Exception e){
            UtilController.mostrarMensaje(
                    Alert.AlertType.ERROR,
                    "Validacion",
                    "Error al cargar el registro de usuario"
            );
        }
    }

}
