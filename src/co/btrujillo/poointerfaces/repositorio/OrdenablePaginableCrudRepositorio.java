package co.btrujillo.poointerfaces.repositorio;

import co.btrujillo.poointerfaces.repositorio.CrudRepositorio;
import co.btrujillo.poointerfaces.repositorio.IOrdenableRepositorio;
import co.btrujillo.poointerfaces.repositorio.IPaginableRepositorio;

public interface OrdenablePaginableCrudRepositorio <T>extends IContableRepositorio,
        IOrdenableRepositorio<T>, CrudRepositorio<T>, IPaginableRepositorio<T> {
}
