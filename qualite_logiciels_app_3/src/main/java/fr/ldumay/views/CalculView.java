package fr.ldumay.views;

import fr.ldumay.Main;
import fr.ldumay.models.Calcul;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CalculView implements Initializable {
    @FXML
    private TextField textFieldNombreEntierA = new TextField();
    @FXML
    private TextField textFieldNombreEntierB = new TextField();
    @FXML
    private Button buttonValiderEntierAetB = new Button();
    @FXML
    private Label labelError = new Label();
    //-
    private String error;
    // -
    public static Scene scene;
    public static Stage primaryStage;

    public CalculView() {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        updateError(null);
        buttonValiderEntierAetB.setOnAction(event -> {
            try {
                buttonValiderEntierAetBOnAction();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    /**
     * Méthode appelée lors du clic sur le bouton "Valider"
     * Celle-ci permet de vérifier que les deux champs sont remplis et que les deux valeurs sont des entiers.
     * Si oui, appeler la méthode allRacineCarree de la classe Calcul et on affiche les résultats.
     * Si non, afficher un message d'erreur.
     */
    private void buttonValiderEntierAetBOnAction() throws IOException {
        updateError(null);
        //-
        if(textFieldNombreEntierA.getText().isEmpty() || textFieldNombreEntierB.getText().isEmpty()) {
            error = "Veuillez remplir les deux champs";
            updateError(error);
        } else {
            try {
                Main.a = Integer.parseInt(textFieldNombreEntierA.getText());
                Main.b = Integer.parseInt(textFieldNombreEntierB.getText());
                System.out.println("a = " + Main.a + " et b = " + Main.b);
            } catch (NumberFormatException e) {
                updateError("Veuillez saisir des entiers");
            }
        }
        //-
        if(Main.a != 0 && Main.b != 0) {
            Main.resultatsAllRacineCarree = Main.calcul.allRacineCarree(Main.a, Main.b);
            openCalculResultatView();
        }
    }

    private void updateError(String error) {
        if(error != null)
            labelError.setText(error);
        else
            labelError.setText("");
    }

    public void openCalculResultatView() throws IOException {
        System.out.println("Open view : About");
        //-
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("CalculResultatView.fxml"));
        scene = new Scene(fxmlLoader.load());
        primaryStage = new Stage();
        primaryStage.setScene(scene);
        primaryStage.initModality(Modality.WINDOW_MODAL);
        primaryStage.show();
    }
}