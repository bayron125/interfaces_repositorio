package co.btrujillo.poointerfaces.repositorio.lista;

import co.btrujillo.poointerfaces.modelo.Producto;
import co.btrujillo.poointerfaces.repositorio.AbstractaListRepositorio;
import co.btrujillo.poointerfaces.repositorio.Direccion;

import java.util.ArrayList;
import java.util.List;

public class ProductoListRepositorio extends AbstractaListRepositorio<Producto> {
    @Override
    public void editar(Producto producto) {
        Producto p = this.porId(producto.getId());
        p.setNombre(producto.getNombre());
        p.setPrecio(producto.getPrecio());

    }

    @Override
    public List<Producto> listar(String campo, Direccion dir) {
        List <Producto> listaOrdenada= new ArrayList<>(dataSource);
        listaOrdenada.sort((a, b) -> {
            int resultado = 0;
            if (dir == Direccion.ASC)
                resultado=ordenar(a,b,campo);
            else if (dir == Direccion.DES)
                resultado=ordenar(b,a,campo);

            return resultado;
        });


        return listaOrdenada;
    }

    public static int ordenar(Producto a , Producto b, String campo){
        int resultado = 0;

        switch (campo){
            case "id"->
                    resultado = a.getId().compareTo(b.getId());

            case "nombre" ->
                    resultado =a.getNombre().compareTo(b.getNombre());
            case "precio" ->
                    resultado =a.getPrecio().compareTo(b.getPrecio());
        }
        return resultado;
    }


}
