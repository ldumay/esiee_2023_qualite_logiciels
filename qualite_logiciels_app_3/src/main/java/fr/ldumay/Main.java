package fr.ldumay;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Classe : Main
 * <br/>Description : Classe principale de l'application
 * permettant d'utiliser la classe Calcul.
 *
 * @author ldumay
 */
public class Main extends Application {

    private Scene scene;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Les racines carrées entre A et B");
        primaryStage.setScene(scene);
        // scene.getStylesheets().add("/esiee_it/agilebibliorouge/gui/MainView.css");
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public void init() {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/fr/ldumay/views/CalculView.fxml"));
        } catch (IOException e) {
            System.err.println("App.init() : FXML Loader Exception\n" + e.getMessage());
        }
        this.scene = new Scene(root);
    }
    public static void main(String[] args) {
        System.out.println("App Ready !");
    }
}