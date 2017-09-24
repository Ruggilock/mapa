package model;

import model.Collections.CollectionBloque;
import model.Functions.BloqueFunctions;

import java.util.ArrayList;

public class Rack {
    private String idRack;
    private String idAlmacen;
    private String orientacion;
    private Integer tamaño;
    private Integer pisos;
    private Integer xIni;
    private Integer yIni;
    private CollectionBloque collectionBloqueA;
    private CollectionBloque collectionBloqueB;

    public Rack(String idRack, String idAlmacen, String  orientacion, Integer tamaño, Integer pisos, Integer xIni, Integer yIni) {
        this.idRack = idRack;
        this.idAlmacen = idAlmacen;
        this.orientacion = orientacion;
        this.tamaño = tamaño;
        this.pisos = pisos;
        this.xIni = xIni;
        this.yIni = yIni;
        collectionBloqueA = new CollectionBloque();
        collectionBloqueB = new CollectionBloque();
    }

    public void llenarRack(){

        BloqueFunctions bloqueFunctions = new BloqueFunctions();
        ArrayList<Bloque> bloques;

        for (int posicion = 0; posicion < tamaño; posicion++) {
            for (int altura = 0; altura < pisos; altura++)
            {
                bloques=bloqueFunctions.createBloque(altura,idRack,xIni,yIni,posicion,orientacion);
                collectionBloqueA.getBloques().add(bloques.get(0));
                collectionBloqueB.getBloques().add(bloques.get(1));

            }
        }


    }


    @Override
    public String toString() {
        return "Rack{" +
                "idRack='" + idRack + '\'' +
                ", idAlmacen=" + idAlmacen +
                ", orientacion='" + orientacion + '\'' +
                ", tamaño=" + tamaño +
                ", pisos=" + pisos +
                ", xIni=" + xIni +
                ", yIni=" + yIni +
                ", collectionBloqueA=" + collectionBloqueA +
                ", collectionBloqueB=" + collectionBloqueB +
                '}';
    }

    public String getIdRack() {
        return idRack;
    }

    public void setIdRack(String idRack) {
        this.idRack = idRack;
    }

    public String getIdAlmacen() {
        return idAlmacen;
    }

    public void setIdAlmacen(String idAlmacen) {
        this.idAlmacen = idAlmacen;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }

    public Integer getTamaño() {
        return tamaño;
    }

    public void setTamaño(Integer tamaño) {
        this.tamaño = tamaño;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    public Integer getxIni() {
        return xIni;
    }

    public void setxIni(Integer xIni) {
        this.xIni = xIni;
    }

    public Integer getyIni() {
        return yIni;
    }

    public void setyIni(Integer yIni) {
        this.yIni = yIni;
    }

    public CollectionBloque getCollectionBloqueA() {
        return collectionBloqueA;
    }

    public void setCollectionBloqueA(CollectionBloque collectionBloqueA) {
        this.collectionBloqueA = collectionBloqueA;
    }

    public CollectionBloque getCollectionBloqueB() {
        return collectionBloqueB;
    }

    public void setCollectionBloqueB(CollectionBloque collectionBloqueB) {
        this.collectionBloqueB = collectionBloqueB;
    }
}
