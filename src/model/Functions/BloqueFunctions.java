package model.Functions;

import model.Bloque;
import model.Mapa;
import model.Piso;

import java.util.ArrayList;

public class BloqueFunctions {
    public BloqueFunctions() {
    }

    public ArrayList<Bloque> createBloque (Integer altura, String idRack, Integer x, Integer y, Integer posicion, String orientacion){
        Piso piso = new Piso(altura);
        String idBloqueA =idRack+"A"+posicion.toString()+piso.getTipo();
        String idBloqueB =idRack+"B"+posicion.toString()+piso.getTipo();
        Bloque bloque;
        Bloque bloque2;
        ArrayList<Bloque>bloques = new ArrayList<>();
        if(orientacion.compareTo("H")==0){
            bloque = new Bloque(idBloqueA,idRack,piso,x+posicion,y);
            bloque2 = new Bloque(idBloqueB,idRack,piso,x+posicion,y+1);
           bloques.add(bloque);
            bloques.add(bloque2);
        }else{
            bloque = new Bloque(idBloqueA,idRack,piso,x,y+posicion);
            bloque2 = new Bloque(idBloqueB,idRack,piso,x+1,y+posicion);
            bloques.add(bloque);
            bloques.add(bloque2);
        }
        return bloques;

    }
}
