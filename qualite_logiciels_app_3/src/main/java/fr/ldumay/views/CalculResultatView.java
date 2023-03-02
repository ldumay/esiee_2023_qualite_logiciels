package fr.ldumay.views;

import fr.ldumay.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculResultatView implements Initializable {

    @FXML
    public TextArea textAreaResults;
    //-
    private String results;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("CalculResultatView - Affiche");
        //- Affiche les résultats
        textAreaResults.setText(results);
        System.out.println(textAreaResults.getText());
    }

    public CalculResultatView() {
        System.out.println("CalculResultatView - Init");
        chargerLesResultats();
    }

    private void chargerLesResultats(){
        results = "Les racines carrées entre A="+ Main.a + " et B=" + Main.b + " sont : ";
        //-
        if(Main.resultatsAllRacineCarree.length > 0){
            for (int i = 0; i < Main.resultatsAllRacineCarree.length; i++) {
                results += "\n--> racine carrée de " + (Main.a + i) + " = " + Main.resultatsAllRacineCarree[i];
            }
        }
    }
}
