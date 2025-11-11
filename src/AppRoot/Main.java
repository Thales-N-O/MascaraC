package AppRoot;
import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;
public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception{
       stage.setTitle("Tab #1");
       stage.show();
    }
    public static void main(String[] args){
        launch(args);
        System.out.println("Carregou");
    }
}