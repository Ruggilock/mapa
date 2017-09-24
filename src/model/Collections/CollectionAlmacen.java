package model.Collections;

import model.Almacen;
import model.Rack;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionAlmacen {
    Collection<Almacen> almacenes;

    public CollectionAlmacen() {
        this.almacenes = new ArrayList<Almacen>();
    }

    public Collection<Almacen> getAlmacenes() {
        return almacenes;
    }

    public void setAlmacenes(Collection<Almacen> almacenes) {
        this.almacenes = almacenes;
    }

    public void addAlmacen(Almacen almacen){
        almacenes.add(almacen);
    }
    @Override
    public String toString() {
        return "CollectionAlmacen{" +
                "almacenes=" + almacenes +
                '}';
    }

}
