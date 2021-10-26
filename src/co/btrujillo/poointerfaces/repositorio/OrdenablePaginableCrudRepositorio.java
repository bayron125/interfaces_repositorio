package co.btrujillo.poointerfaces.repositorio;

import co.btrujillo.poointerfaces.repositorio.CrudRepositorio;
import co.btrujillo.poointerfaces.repositorio.IOrdenableRepositorio;
import co.btrujillo.poointerfaces.repositorio.IPaginableRepositorio;

public interface OrdenablePaginableCrudRepositorio extends IContableRepositorio,    IOrdenableRepositorio, CrudRepositorio, IPaginableRepositorio {
}
