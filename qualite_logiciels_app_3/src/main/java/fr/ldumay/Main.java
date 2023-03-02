package fr.ldumay;

import fr.ldumay.models.Calcul;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private String APP_NAME = "Les racines carrées entre A et B";
    private Scene scene;
    //-
    public static Calcul calcul = new Calcul();
    public static Integer a = 0;
    public static Integer b = 0;
    public static Double[] resultatsAllRacineCarree;
    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("CalculView.fxml"));
        scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle(APP_NAME);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
        System.out.println("App Ready !");
    }
}