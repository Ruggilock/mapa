package model.Collections;

import model.Bloque;
import model.Rack;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionRack {
    Collection<Rack>racks;

    public Collection<Rack> getRacks() {
        return racks;
    }

    public void setRacks(Collection<Rack> racks) {
        this.racks = racks;
    }

    public CollectionRack() {
        this.racks = new ArrayList<>();

    }

    @Override
    public String toString() {
        return "CollectionRack{" +
                "racks=" + racks +
                '}';
    }
}
