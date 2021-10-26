package co.btrujillo.poointerfaces.repositorio;

import co.btrujillo.poointerfaces.modelo.Cliente;

import java.util.ArrayList;
import java.util.List;


public class ClienteListReporitorio implements OrdenablePaginableCrudRepositorio{

    private  List<Cliente> dataSource;

    public ClienteListReporitorio() {
        this.dataSource = new ArrayList<>();
    }


    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public Cliente porId(Integer id) {
        Cliente resultado = null;

        for(Cliente cliente: dataSource )
            if(cliente.getId()!=null && cliente.getId().equals(id)){
                resultado=cliente;
                break;
            }

        return resultado;
    }

    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    @Override
    public void editar(Cliente cliente) {
        Cliente c = this.porId(cliente.getId());
        c.setNombre(cliente.getNombre());
        c.setApellido(cliente.getApellido());

    }

    @Override
    public  void eliminar(Integer id) {

        this.dataSource.remove(this.porId(id));

    }

    @Override
    public List<Cliente> listar(String campo, Direccion dir) {
        List <Cliente> listaOrdenada= new ArrayList<>(dataSource);
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

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }

    public static int ordenar(Cliente a , Cliente b,String campo){
        int resultado = 0;

        switch (campo){
            case "id"->
                    resultado = a.getId().compareTo(b.getId());

            case "nombre" ->
                    resultado =a.getNombre().compareTo(b.getNombre());
            case "apellido" ->
                    resultado =a.getApellido().compareTo(b.getApellido());
        }
        return resultado;
    }

    @Override
    public int total() {
        return this.dataSource.size();
    }
}
