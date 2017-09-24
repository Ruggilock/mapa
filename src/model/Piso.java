package model;

import java.math.BigDecimal;
import java.util.logging.Logger;

public class Piso {
    String tipo ;
    BigDecimal maxPeso;
    BigDecimal maxVolumen;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getMaxPeso() {
        return maxPeso;
    }

    public void setMaxPeso(BigDecimal maxPeso) {
        this.maxPeso = maxPeso;
    }

    public BigDecimal getMaxVolumen() {
        return maxVolumen;
    }

    public void setMaxVolumen(BigDecimal maxVolumen) {
        this.maxVolumen = maxVolumen;
    }

    @Override
    public String toString() {
        return "Piso{" +
                "tipo='" + tipo + '\'' +
                ", maxPeso=" + maxPeso +
                ", maxVolumen=" + maxVolumen +
                '}';
    }

    public Piso(Integer valor) {
        maxVolumen= new BigDecimal(1);
        switch (valor) {
            case 2: {
                tipo= "C";
                maxPeso = new BigDecimal(500);
                break;
            }
            case 1: {
                tipo= "B";
                maxPeso= new BigDecimal(700);
                break;
            }

            case 0: {
                tipo= "A";
                maxPeso=new BigDecimal(900);
                break;
            }
        }
    }
}
