package org.in5bm.josevilleda.controller;

import java.net.URL;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Set;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.in5bm.josevilleda.bean.*;

/**
 * @author Jose Mauricio Villeda Morales
 * @date 21/03/2022 Codigo Tecnico : IN5BM Carne : 2021075 Grupo : 2 (Lunes)
 */
public class FXMLCalculadoraController implements Initializable {

    private float resultado = 0;
    private float numero;
    private int contadorOperadores = 0;
    private String operadorAnterior;
    private boolean ingresoNuevo = false;

    @FXML
    private Label lblPantalla;
    @FXML
    private Button btnLimpiar;
    @FXML
    private Button btnPorcentaje;
    @FXML
    private Button btnResta;
    @FXML
    private Button btnDivision;
    @FXML
    private Button btnMultiplicacion;
    @FXML
    private Button btnInversoAditivo;
    @FXML
    private Button btnSuma;
    @FXML
    private Button btnCero;
    @FXML
    private Button btnUno;
    @FXML
    private Button btnDos;
    @FXML
    private Button btnTres;
    @FXML
    private Button btnCuatro;
    @FXML
    private Button btnCinco;
    @FXML
    private Button btnSeis;
    @FXML
    private Button btnSiete;
    @FXML
    private Button btnOcho;
    @FXML
    private Button btnNueve;
    @FXML
    private Button btnPunto;
    @FXML
    private Button btnIgual;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void actualizarPantalla(String digito) {

        if (ingresoNuevo) {
            lblPantalla.setText("");
        }
        lblPantalla.setText(lblPantalla.getText().concat(digito));
        ingresoNuevo = false;
        
    }

    @FXML
    private void clicUno(ActionEvent event) {
        actualizarPantalla("1");
    }

    @FXML
    private void clicDos() {
        actualizarPantalla("2");
    }

    @FXML
    private void clicTres() {
        actualizarPantalla("3");
    }

    @FXML
    private void clicCuatro() {
        actualizarPantalla("4");
    }

    @FXML
    private void clicCinco() {
        actualizarPantalla("5");
    }

    @FXML
    private void clicSeis() {
        actualizarPantalla("6");
    }

    @FXML
    private void clicSiete() {
        actualizarPantalla("7");
    }

    @FXML
    private void clicOcho() {
        actualizarPantalla("8");
    }

    @FXML
    private void clicNueve() {
        actualizarPantalla("9");
    }

    @FXML
    private void clicCero() {
        actualizarPantalla("0");

    }

    private void calcular(String operador) {
        System.out.println("operador actual: " + operador);
        this.operadorAnterior = operador;
        if (!(lblPantalla.getText().equals(""))) {

            String strPantalla = lblPantalla.getText();

            if (ingresoNuevo == false) {
                this.numero = Float.parseFloat(strPantalla);
                contadorOperadores++;

                if (contadorOperadores == 1) {
                    this.resultado = numero;
                } else if (contadorOperadores >= 2) {

                    switch (operador) {
                        case "+":
                            Suma suma = new Suma();
                            suma.setNumero1(resultado);
                            suma.setNumero2(numero);
                            this.resultado = suma.operar(suma.getNumero1(), suma.getNumero2());
                            break;
                        case "-":
                            Resta resta = new Resta();
                            resta.setNumero1(resultado);
                            resta.setNumero2(numero);
                            this.resultado = resta.operar(resta.getNumero1(), resta.getNumero2());
                            break;
                        case "÷":
                            Division division = new Division();
                            division.setNumero1(resultado);
                            division.setNumero2(numero);
                            this.resultado = division.operar(division.getNumero1(), division.getNumero2());
                            break;
                        case "×":
                            Multiplicacion multiplicacion = new Multiplicacion();
                            multiplicacion.setNumero1(resultado);
                            multiplicacion.setNumero2(numero);
                            this.resultado = multiplicacion.operar(multiplicacion.getNumero1(), multiplicacion.getNumero2());
                            break;
                        case "%":
                            Porcentaje porcentaje = new Porcentaje();
                            porcentaje.setNumero1(resultado);
                            porcentaje.setNumero2(numero);
                            this.resultado = porcentaje.operar(porcentaje.getNumero1(), porcentaje.getNumero2());
                            break;

                    }
                    lblPantalla.setText(String.valueOf(this.resultado));
                }
            }
        }
        ingresoNuevo = true;
    }

    @FXML
    private void clicRestar(ActionEvent event) {
        calcular("-");
    }

    @FXML
    private void clicSumar(ActionEvent event) {
        calcular("+");
    }

    @FXML
    private void clicDividir(ActionEvent event) {
        calcular("÷");
    }

    @FXML
    private void clicMultiplicar(ActionEvent event) {
        calcular("×");
    }

    @FXML
    private void clicPorcentaje(ActionEvent event) {
        calcular("%");
    }

    public void inversoAditivo() {
    InversoAditivo inverso = new InversoAditivo();
    this.resultado=Float.parseFloat(lblPantalla.getText());
    float inversoNum = inverso.inversoAditivo(this.resultado);
    lblPantalla.setText(String.valueOf(inversoNum));
    }

    @FXML
    private void clicInvertir() {
        inversoAditivo();
    }

    @FXML
    private void clicIgual(ActionEvent event) {
        calcular(String.valueOf(this.operadorAnterior));

        lblPantalla.setText(String.valueOf(this.resultado));
    }

    public void agregarPunto() {

        if (ingresoNuevo) {
            lblPantalla.setText("");
        }

        String cadena = lblPantalla.getText();

        if (cadena.length() <= 0) {
            lblPantalla.setText("0.");
            ingresoNuevo = false;
        } else if (!(lblPantalla.getText().contains("."))) {
            actualizarPantalla(".");
        }

    }

    @FXML
    private void clicPunto() {
        agregarPunto();
    }

    @FXML
    private void clicLimpiar() {
        limpiar();
        resultado = 0;
        numero = 0;
        contadorOperadores = 0;
        operadorAnterior = " ";
        contadorOperadores = 0;
        ingresoNuevo = false;

    }

    public void limpiar() {
        lblPantalla.setText("");
    }

}
