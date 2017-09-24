package model;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Bloque {
    private String idBloque;
    private String idRack;
    private Piso z;
    private Integer x;
    private Integer y;

    public Bloque(String idBloque, String idRack, Piso z, Integer x, Integer y) {
        this.idBloque = idBloque;
        this.idRack = idRack;
        this.z = z;
        this.x = x;
        this.y = y;
    }


    @Override
    public String toString() {
        return "Bloque{" +
                "idBloque='" + idBloque + '\'' +
                ", idRack='" + idRack + '\'' +
                ", z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public String getIdBloque() {
        return idBloque;
    }

    public void setIdBloque(String idBloque) {
        this.idBloque = idBloque;
    }

    public String getIdRack() {
        return idRack;
    }

    public void setIdRack(String idRack) {
        this.idRack = idRack;
    }

    public Piso getZ() {
        return z;
    }

    public void setZ(Piso z) {
        this.z = z;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }
}
