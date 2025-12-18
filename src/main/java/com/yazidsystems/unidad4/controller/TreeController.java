package com.yazidsystems.unidad4.controller;

import com.yazidsystems.unidad4.funciones.BinaryTree;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class TreeController {

    private BinaryTree arbol = new BinaryTree();

    @FXML
    private ListView<String> Listview;

    @FXML
    private Label lblMensaje;

    @FXML
    private TextField txtBuscar;

    @FXML
    private TextField txtNumero;

    @FXML
    void OnResultado(ActionEvent event) {
        try {
            int numero = Integer.parseInt(txtNumero.getText());
            arbol.insertar(numero);
            Listview.getItems().add(String.valueOf(numero));
            lblMensaje.setText("Número insertado correctamente");
            txtNumero.clear();
        } catch (NumberFormatException e) {
            lblMensaje.setText("Ingrese un número válido");
        }
    }

    @FXML
    void onBuscar(ActionEvent event) {
        try {
            int buscar = Integer.parseInt(txtBuscar.getText());
            boolean encontrado = arbol.buscar(buscar);

            if (encontrado) {
                lblMensaje.setText("El número SÍ está en el árbol");
            } else {
                lblMensaje.setText("El número NO está en el árbol");
            }
        } catch (NumberFormatException e) {
            lblMensaje.setText("Ingrese un número válido para buscar");
        }
    }
}
