package com.example.bai4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;

/**
 * JavaFX App
 */
public class App extends Application{

    @Override
    public void start(Stage stage) throws Exception{
        FXMLLoader loader = new FXMLLoader(
                App.class.getResource("/fxml/Bai4.fxml")
        );
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
        stage.setTitle("Bài toán chuyển nhiệt độ");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}