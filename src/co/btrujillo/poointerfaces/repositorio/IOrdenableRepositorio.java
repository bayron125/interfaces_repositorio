package co.btrujillo.poointerfaces.repositorio;

import java.util.List;

public interface IOrdenableRepositorio <T>{
    List<T> listar(String campo, Direccion dir);


}
