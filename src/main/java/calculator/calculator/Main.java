package calculator.calculator;

import calculator.calculator.controller.MainWindowController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("controller/MainWindow.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.setResizable(false);
        stage.initStyle(StageStyle.TRANSPARENT);
        scene.setFill(Color.TRANSPARENT);
        stage.setTitle("Calculator");
        stage.show();
//        Image image = new Image("image/icon.png");
//        stage.getIcons().add(image);
        ((MainWindowController)loader.getController()).init(stage);
    }
    public static void main(String[] args) {
        launch();
    }
}
