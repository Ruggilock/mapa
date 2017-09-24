package model.Collections;

import model.Bloque;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionBloque {

    private Collection<Bloque> bloques;

    @Override
    public String toString() {
        return "CollectionBloque{" +
                "bloques=" + bloques +
                '}';
    }

    public CollectionBloque() {
        this.bloques =new ArrayList<Bloque>();
    }

    public Collection<Bloque> getBloques() {
        return bloques;
    }

    public void setBloques(Collection<Bloque> bloques) {
        this.bloques = bloques;
    }
}
