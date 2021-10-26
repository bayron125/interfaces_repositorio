package co.btrujillo.poointerfaces.repositorio;

import co.btrujillo.poointerfaces.modelo.Cliente;

import java.util.List;

public interface IPaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);


}
