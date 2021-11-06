package co.btrujillo.poointerfaces.repositorio;

import java.util.List;

public interface IPaginableRepositorio <T> {
    List<T> listar(int desde, int hasta);


}
