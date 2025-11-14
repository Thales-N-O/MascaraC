package AppRoot;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.stage.*;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
//        Criar o loader do fxml
        var strtMainLoader= getClass().getResource("/Template/StructureFxml/strtMain.fxml");
        FXMLLoader strtMain = new FXMLLoader(strtMainLoader);
//        Alocando o loaded fxml strtMain no stage por Scene
        Scene strtSceneMain = new Scene(strtMain.load(), 600, 200);
        stage.setScene(strtSceneMain);

        stage.setTitle("Main Scene");


        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
        System.out.println("Carregou");
    }
}