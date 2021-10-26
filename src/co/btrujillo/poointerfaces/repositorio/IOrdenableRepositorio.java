package co.btrujillo.poointerfaces.repositorio;

import co.btrujillo.poointerfaces.modelo.Cliente;

import java.util.List;

public interface IOrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);


}
