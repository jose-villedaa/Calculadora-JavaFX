

package org.in5bm.josevilleda.bean;
/**
 * @author Jose Mauricio Villeda Morales
 * @date 21/03/2022 
 * Codigo Tecnico : IN5BM 
 * Carne : 2021075 
 * Grupo : 2 (Lunes)
 */

public class Porcentaje extends Operacion {
    
    @Override
    public float operar() {
        setOperador('%');
        setResultado(getNumero1() / 100* getNumero2());
        return getResultado();
    }

    @Override
    public float operar(float numero1, float numero2) {
        setNumero1(numero1);
        setNumero2(numero2);
        setOperador('%');
        setResultado(getNumero1() / 100 * getNumero2());
        return getResultado();
    }
}

