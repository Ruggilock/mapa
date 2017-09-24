package model;

import model.Collections.CollectionRack;

import java.util.ArrayList;
import java.util.Collection;

public class Almacen {
    private String idAlmacen;
    private String idMapa;
    private String nombre;
    private String description;
    private String tipo;
    private String orientacion;
    private Integer tamaño;
    private Integer pisos;

    public Collection<Integer> puntos;/*pos0,1,2,3 = xIni,yIni,xFin,yFin*/
    public CollectionRack collectionRack;

    public void setPuntos(Integer xIni, Integer yIni, Integer xFin, Integer yFin){
        puntos.add(xIni);
        puntos.add(yIni);
        puntos.add(xFin);
        puntos.add(yFin);
    }


    public void ingresarRack (Integer xIni,Integer yIni){
        String idRack="";
        Integer contador =collectionRack.getRacks().size();
        if (contador==0) contador =1;
        Integer longitud=(int)(Math.log10(contador)+1);
        switch (longitud){
            case 1 : {
                idRack= "00"+contador;
                break;
            }
            case 2: {
                idRack= "0"+ contador;
                break;
            }
            case 3:{
                idRack= ""+contador;
                break;
            }
        }

        Rack rack = new Rack(idRack, idAlmacen, orientacion, tamaño,pisos, xIni, yIni);
        rack.llenarRack();
        collectionRack.getRacks().add(rack);
    }

    @Override
    public String toString() {
        return "Almacen{" +
                "idAlmacen='" + idAlmacen + '\'' +
                ", idMapa='" + idMapa + '\'' +
                ", nombre='" + nombre + '\'' +
                ", description='" + description + '\'' +
                ", tipo='" + tipo + '\'' +
                ", orientacion='" + orientacion + '\'' +
                ", tamaño=" + tamaño +
                ", pisos=" + pisos +
                ", puntos=" + puntos +
                ", collectionRack=" + collectionRack +
                '}';
    }

    public Almacen(String idAlmacen, String idMapa, String nombre, String description, String tipo, String orientacion, Integer tamaño, Integer pisos) {
        this.idAlmacen = idAlmacen;
        this.idMapa = idMapa;
        this.nombre = nombre;
        this.description = description;
        this.tipo = tipo;
        this.orientacion = orientacion;
        this.tamaño = tamaño;
        this.pisos = pisos;
        this.puntos = new ArrayList<>();
        this.collectionRack= new CollectionRack();
    }


}
