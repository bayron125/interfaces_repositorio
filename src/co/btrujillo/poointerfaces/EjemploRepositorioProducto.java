package co.btrujillo.poointerfaces;


import co.btrujillo.poointerfaces.modelo.Cliente;
import co.btrujillo.poointerfaces.modelo.Producto;
import co.btrujillo.poointerfaces.repositorio.Direccion;
import co.btrujillo.poointerfaces.repositorio.OrdenablePaginableCrudRepositorio;
import co.btrujillo.poointerfaces.repositorio.lista.ProductoListRepositorio;

public class EjemploRepositorioProducto {
    public static void main(String[] args) {

        OrdenablePaginableCrudRepositorio <Producto> repositorioProductos= new ProductoListRepositorio();

        repositorioProductos.crear(new Producto("Mesa",150000));
        repositorioProductos.crear(new Producto("Silla",80000));
        repositorioProductos.crear(new Producto("Lampara",125000));
        repositorioProductos.crear(new Producto("NoteBook",1900000));
        repositorioProductos.crear(new Producto("Libro", 50000));
        repositorioProductos.crear(new Producto("cama",450000));

        System.out.println("===========Original==============");
        repositorioProductos.listar().forEach(System.out::println);

        System.out.println("===========Paginable==============");
        repositorioProductos.listar(2,4).forEach(System.out::println);

        System.out.println("============Ordenar por Precio===============");
        repositorioProductos.listar("precio",Direccion.ASC).forEach(System.out::println);

        System.out.println("=========Editar Productos===========");
        repositorioProductos.editar(new Producto("cartera",52000).setId(2));
        System.out.println(repositorioProductos.porId(2));

        System.out.println("===========Lista con dato eliminado===========");
        repositorioProductos.eliminar(6);
        repositorioProductos.listar().forEach(System.out::println);

        System.out.println("=========== Cantidad de registros==========");
        System.out.println(repositorioProductos.total());




    }


}
