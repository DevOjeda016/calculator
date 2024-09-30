package org.utl.dsm.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PeliculasController {

    @FXML
    private Button btnRegistrar;

    @FXML
    private TextField txtAnio;

    @FXML
    private TextField txtDirector;

    @FXML
    private TextField txtGenero;

    @FXML
    private TextArea txtLista;

    @FXML
    private TextField txtTitulo;

    Pelicula[] peliculas = new Pelicula[10];
    int cont = 0;

    public void agregar(){
        String titulo, genero, director, anio;
        String body = "";
        titulo = txtTitulo.getText();
        genero = txtGenero.getText();
        director = txtDirector.getText();
        anio = txtAnio.getText();
        Pelicula pelicula = new Pelicula(titulo, genero, anio, director);
        peliculas[cont] = pelicula;
        cont++;
        for (Pelicula e : peliculas) {
            if (e != null) {
                body += e + "\n";
            } else {
                break;
            }
        }
        txtLista.setText(body);
        txtAnio.clear();
        txtGenero.clear();
        txtDirector.clear();
        txtTitulo.clear();
    }
}
