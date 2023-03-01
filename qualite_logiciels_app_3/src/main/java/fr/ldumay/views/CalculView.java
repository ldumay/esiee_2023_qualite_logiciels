package fr.ldumay.views;

import fr.ldumay.models.Calcul;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculView implements Initializable {

    @FXML
    private TextField textFieldNombreEntierA;
    @FXML
    private TextField textFieldNombreEntierB;
    @FXML
    private Button buttonValiderEntierAetB;
    private Integer a = 0;
    private Integer b = 0;
    private Calcul calcul = new Calcul();

    public CalculView() {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        buttonValiderEntierAetB.setOnAction(event -> buttonValiderEntierAetBOnAction());
    }

    /**
     * Méthode appelée lors du clic sur le bouton "Valider"
     * Celle-ci permet de vérifier que les deux champs sont remplis et que les deux valeurs sont des entiers.
     * Si oui, appeler la méthode allRacineCarree de la classe Calcul et on affiche les résultats.
     * Si non, afficher un message d'erreur.
     */
    private void buttonValiderEntierAetBOnAction() {
        if(textFieldNombreEntierA.getText().isEmpty() || textFieldNombreEntierB.getText().isEmpty()) {
            System.out.println("Veuillez remplir les deux champs");
        } else {
            try {
                a = Integer.parseInt(textFieldNombreEntierA.getText());
                b = Integer.parseInt(textFieldNombreEntierB.getText());
                System.out.println("a = " + a + " et b = " + b);
            } catch (NumberFormatException e) {
                System.out.println("Veuillez saisir des entiers");
            }
        }
        //-
        if(a != 0 && b != 0) {
            afficherAllRacineCarreeResultat(calcul.allRacineCarree(a, b));
        }
    }

    private void afficherAllRacineCarreeResultat(Double[] resultatsAllRacineCarree) {
        if(resultatsAllRacineCarree.length > 0){
            for (int i = 0; i < resultatsAllRacineCarree.length; i++) {
                System.out.println("Racine carrée de " + (a + i) + " = " + resultatsAllRacineCarree[i]);
            }
        }
    }
}
