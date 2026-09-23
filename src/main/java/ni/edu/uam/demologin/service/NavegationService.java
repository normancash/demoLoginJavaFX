package ni.edu.uam.demologin.service;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;

public class NavegationService {

    public void cambiarVista(String fxml) throws IOException {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource(fxml)
        );
        Parent root = loader.load();
        Scene scene = root.getScene();
        scene.setRoot(root);
    }
}
