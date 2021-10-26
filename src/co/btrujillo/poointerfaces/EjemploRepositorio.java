package co.btrujillo.poointerfaces;

import co.btrujillo.poointerfaces.modelo.Cliente;
import co.btrujillo.poointerfaces.repositorio.*;

public class EjemploRepositorio  {
    public static void main(String[] args) {

        OrdenablePaginableCrudRepositorio repositorioClientes= new ClienteListReporitorio();

        repositorioClientes.crear(new Cliente("Bayron","Trujillo"));
        repositorioClientes.crear(new Cliente("Sebastian","Leon"));
        repositorioClientes.crear(new Cliente("Andres","Escobar"));
        repositorioClientes.crear(new Cliente("Fernanda","Becerra"));
        repositorioClientes.crear(new Cliente("Majory", "Souza"));
        repositorioClientes.crear(new Cliente("Lorena","Garzon"));

        System.out.println("===========Original==============");
        repositorioClientes.listar().forEach(System.out::println);

        System.out.println("===========Paginable==============");
        repositorioClientes.listar(2,4).forEach(System.out::println);

        System.out.println("============Ordenar por nombre===============");
        repositorioClientes.listar("nombre",Direccion.ASC).forEach(System.out::println);

        System.out.println("=========Editar CLiente===========");
        repositorioClientes.editar(new Cliente("Sandra","Perez").setId(4));
        System.out.println(repositorioClientes.porId(4));

        System.out.println("===========Lista con dato eliminado===========");
        repositorioClientes.eliminar(6);
        repositorioClientes.listar().forEach(System.out::println);

        System.out.println("=========== Cantidad de registros==========");
        System.out.println(repositorioClientes.total());




    }


}
