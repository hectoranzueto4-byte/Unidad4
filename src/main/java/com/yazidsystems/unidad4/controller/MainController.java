package com.yazidsystems.unidad4.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    @FXML
    void OnArboles(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(
                getClass().getResource("/com/yazidsystems/unidad4/arbol-view.fxml")
        );

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root, 600, 400));
        stage.setTitle("Árboles Binarios");
        stage.show();
    }

    @FXML
    void OnGrafos(ActionEvent event) {
        // Luego aquí cargas grafos-view.fxml
        System.out.println("Grafos aún no implementado");
    }
}
