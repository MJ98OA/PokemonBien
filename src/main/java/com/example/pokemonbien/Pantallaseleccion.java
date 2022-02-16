package com.example.pokemonbien;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Pantallaseleccion extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Pantallaseleccion.class.getResource("PantallaSeleccion.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 900, 550);
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}