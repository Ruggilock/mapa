package model;

import com.sun.org.apache.xpath.internal.SourceTree;
import model.Collections.CollectionAlmacen;
import model.Collections.CollectionBloque;

import java.util.ArrayList;
import java.util.Collection;

public class Mapa {
     private String idMapa;
     private String rutaDeImagen;
     private String description;
     private Integer ancho;
     private Integer largo;
     private CollectionAlmacen collectionAlmacen;

     public ArrayList<ArrayList<String>> mapaDibujado;

     public Mapa(String idMapa, String rutaDeImagen, String description, Integer ancho, Integer largo) {
          this.idMapa = idMapa;
          this.rutaDeImagen = rutaDeImagen;
          this.description = description;
          this.ancho = ancho;
          this.largo = largo;
          this.collectionAlmacen = new CollectionAlmacen();
          mapaDibujado=new ArrayList<ArrayList<String>>();
     }

    @Override
    public String toString() {
        return "Mapa{" +
                "idMapa='" + idMapa + '\'' +
                ", rutaDeImagen='" + rutaDeImagen + '\'' +
                ", description='" + description + '\'' +
                ", ancho=" + ancho +
                ", largo=" + largo +
                ", collectionAlmacen=" + collectionAlmacen +
                '}';
    }
    public void crearMatriz(){

        for (int i = 0; i < largo; i++) {
            ArrayList<String> fila = new ArrayList<>();
            for (int j = 0; j < ancho; j++) {
                if(i==0 || i==largo-1){
                    fila.add ("=");
                }else if (j==0 || j==ancho-1){
                    fila.add("=");
                }else fila.add(" ");
            }
            mapaDibujado.add(fila);
        }
    }
    public void llenarMapa(){
        Collection<Almacen> almacens= collectionAlmacen.getAlmacenes();
        for (int i = 0; i <almacens.size() ; i++) {
            for (Almacen almacen:almacens) {
                Collection<Rack> racks= almacen.collectionRack.getRacks();
                for(Rack rack : racks){
                    Collection<Bloque> bloques= rack.getCollectionBloqueA().getBloques();
                    for (Bloque bloque: bloques) {
                        mapaDibujado.get(bloque.getY()).set(bloque.getX(),"r");
                    }
                    Collection<Bloque> bloques2= rack.getCollectionBloqueB().getBloques();
                    for (Bloque bloque: bloques2) {
                        mapaDibujado.get(bloque.getY()).set(bloque.getX(),"r");
                    }
                }
            }
        }
                


    }
    public void printMatriz(){
        for (int i = 0; i < largo ; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print(mapaDibujado.get(i).get(j));
            }
            System.out.println(" ");
        }
    }


    public String getIdMapa() {
          return idMapa;
     }

     public void setIdMapa(String idMapa) {
          this.idMapa = idMapa;
     }

     public String getRutaDeImagen() {
          return rutaDeImagen;
     }

     public void setRutaDeImagen(String rutaDeImagen) {
          this.rutaDeImagen = rutaDeImagen;
     }

     public String getDescription() {
          return description;
     }

     public void setDescription(String description) {
          this.description = description;
     }

     public Integer getAncho() {
          return ancho;
     }

     public void setAncho(Integer ancho) {
          this.ancho = ancho;
     }

     public Integer getLargo() {
          return largo;
     }

     public void setLargo(Integer largo) {
          this.largo = largo;
     }

     public CollectionAlmacen getCollectionAlmacen() {
          return collectionAlmacen;
     }

     public void setCollectionAlmacen(CollectionAlmacen collectionAlmacen) {
          this.collectionAlmacen = collectionAlmacen;
     }

}
