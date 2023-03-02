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
    private TextArea textAreaResults = new TextArea();

    @FXML
    private Button buttonCloseResults = new Button();

    @Override
    public void initialize(URL location, ResourceBundle resources) {}

    public CalculResultatView() {
        init();
    }

    private void init(){
        textAreaResults = new TextArea();
        buttonCloseResults = new Button();
    }

    public void chargerLesResultats(int a, int b, Double[] resultatsAllRacineCarree){
        String results = "Les racines carrées entre A="+ a + " et B=" + b + " sont : ";
        //-
        if(resultatsAllRacineCarree.length > 0){
            for (int i = 0; i < resultatsAllRacineCarree.length; i++) {
                results += "\n--> racine carrée de " + (a + i) + " = " + resultatsAllRacineCarree[i];
            }
        }
        //-
        textAreaResults.setText(results);
    }
}
