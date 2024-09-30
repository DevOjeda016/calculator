package org.utl.dsm.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrincipalController {
    @FXML
    private Button btnSumar;
    @FXML
    private Button btnMultiplicar;
    @FXML
    private Button btnRestar;
    @FXML
    private Button btnDividir;
    @FXML
    private TextField txtNum1;
    @FXML
    private TextField txtNum2;
    @FXML
    private TextField txtResultado;
    public void sumar(){
        double num1, num2,resultado;
        num1 = Double.parseDouble(txtNum1.getText());
        num2 = Double.parseDouble(txtNum2.getText());
        resultado = num1 + num2;
        txtResultado.setText(String.valueOf(resultado));
    }
    public void restar(){
        double num1, num2, resultado;
        num1 = Double.parseDouble(txtNum1.getText());
        num2 = Double.parseDouble(txtNum2.getText());
        resultado = num1 - num2;
        txtResultado.setText(String.valueOf(resultado));

    }
    public void multiplicar(){
        double num1, num2, resultado;
        num1 = Double.parseDouble(txtNum1.getText());
        num2 = Double.parseDouble(txtNum2.getText());
        resultado = num1 * num2;
        txtResultado.setText(String.valueOf(resultado));

    }
    public void dividir(){
        double num1, num2, resultado;
        num1 = Double.parseDouble(txtNum1.getText());
        num2 = Double.parseDouble(txtNum2.getText());
        resultado = num1 / num2;
        txtResultado.setText(String.valueOf(resultado));

    }
}