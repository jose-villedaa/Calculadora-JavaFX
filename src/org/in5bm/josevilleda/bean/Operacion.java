package org.in5bm.josevilleda.bean;

/**
 * @author Jose Mauricio Villeda Morales
 * @date 21/03/2022 
 * Codigo Tecnico : IN5BM 
 * Carne : 2021075 
 * Grupo : 2 (Lunes)
 */
public abstract class Operacion {

    //Atributos o Variables de instancia
    private float numero1;
    private float numero2;
    private float resultado;
    private char operador;

    //Constructores
    //Constructor Nulo o Sin parametros
    public Operacion() {
    }

    //Constructor con parametros
    public Operacion(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    // Getter's and Setter's
    // Numero 1
    public float getNumero1() {
        return this.numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    // Numero 2
    public float getNumero2() {
        return this.numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    // Resultado
    public float getResultado() {
        return this.resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    // Operador
    public char getOperador() {
        return this.operador;
    }

    public void setOperador(char operador) {
        this.operador = operador;
    }

    public abstract float operar();

    public abstract float operar(float numero1, float numero2);

}
