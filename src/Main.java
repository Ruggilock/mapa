import model.Almacen;
import model.Collections.CollectionAlmacen;
import model.Mapa;
import model.Rack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        Mapa mapa = new Mapa("001","../mapa","mapa de SJL",50,22);

        Almacen almacen01 = new Almacen("001","001","almacen 1","descp1","tipo1","H",8,3);
        almacen01.setPuntos(1,1,19,10);
        almacen01.ingresarRack(2,2);
        almacen01.ingresarRack(2,5);
        almacen01.ingresarRack(2,8);
        almacen01.ingresarRack(11,2);
        almacen01.ingresarRack(11,5);
        almacen01.ingresarRack(11,8);
        mapa.getCollectionAlmacen().addAlmacen(almacen01);

        Almacen almacen02 = new Almacen("002","001","almacen 2","descp2","tipo2","H",8,3);
        almacen02.setPuntos(20,1,29,10);
        almacen02.ingresarRack(21,2);
        almacen02.ingresarRack(21,5);
        almacen02.ingresarRack(21,8);
        mapa.getCollectionAlmacen().addAlmacen(almacen02);


        Almacen almacen03 = new Almacen("003","001","almacen 3","descp3","tipo3","V",8,3);
        almacen03.setPuntos(30,1,48,	10);
        almacen03.ingresarRack(31,2);
        almacen03.ingresarRack(34,2);
        almacen03.ingresarRack(37,2);
        almacen03.ingresarRack(40,2);
        almacen03.ingresarRack(43,2);
        almacen03.ingresarRack(46,2);

        mapa.getCollectionAlmacen().addAlmacen(almacen03);

        //almacen 04
        Almacen almacen04 = new Almacen("004","001","almacen 4","descp4","tipo4","V",8,3);
        almacen04.setPuntos(1,11,16,	20);
        almacen04.ingresarRack(2,12);
        almacen04.ingresarRack(5,12);
        almacen04.ingresarRack(8,12);
        almacen04.ingresarRack(11,12);
        almacen04.ingresarRack(14,12);
        mapa.getCollectionAlmacen().addAlmacen(almacen04);

        //almacen 05
        Almacen almacen05 = new Almacen("005","001","almacen 5","descp5","tipo5","H",8,3);
        almacen05.setPuntos(17,11,35,20);
        almacen05.ingresarRack(18,12);
        almacen05.ingresarRack(18,15);
        almacen05.ingresarRack(18,18);
        almacen05.ingresarRack(27,12);
        almacen05.ingresarRack(27,15);
        almacen05.ingresarRack(27,18);
        mapa.getCollectionAlmacen().addAlmacen(almacen05);

        //almacen 06
        Almacen almacen06 = new Almacen("006","001","almacen 6","descp6","tipo6","H",8,3);
        almacen06.setPuntos(36,11,45,20);
        almacen06.ingresarRack(37,12);
        almacen06.ingresarRack(37,15);
        almacen06.ingresarRack(37,18);
        mapa.getCollectionAlmacen().addAlmacen(almacen06);


    mapa.crearMatriz();
    mapa.llenarMapa();
    mapa.printMatriz();

        System.out.println(mapa.toString());
    }
}
