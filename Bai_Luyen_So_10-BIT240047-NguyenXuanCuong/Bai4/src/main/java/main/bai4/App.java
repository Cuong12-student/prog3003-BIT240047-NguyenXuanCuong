package main.bai4;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
/**
 * JavaFX App
 */
public class App extends Application {
    
    public void start(Stage stage){
            try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("calculater.fxml"));
            Parent root = loader.load();
            
            Scene scene = new Scene(root);
            
            stage.setScene(scene);
            stage.setTitle("Máy tính của tôi");
            stage.setResizable(false);
            stage.show();
            
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Lỗi nạp FXML: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        launch(args);
    }

}