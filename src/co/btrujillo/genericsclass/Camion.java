package co.btrujillo.genericsclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion <T> implements Iterable<T> {

    private List<T> objetos;
    private int max;

    public Camion(int max) {
        this.max = max;
        this.objetos = new ArrayList<>();
    }

    public Camion addObjeto(T objeto){
        if(objetos.size()<=max){
            this.objetos.add(objeto);
        }

        else{
            throw new RuntimeException("No hay mas espacio en el camión");
        }
        return this;
    }

    @Override
    public Iterator<T> iterator() {
        return objetos.iterator();
    }
}

