package co.btrujillo.generics;

import co.btrujillo.poointerfaces.modelo.Cliente;
import co.btrujillo.poointerfaces.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {
    public static void main(String[] args) {
        List <Cliente> clientes = new ArrayList();
        clientes.add(new Cliente("Bayron","Trujillo"));

        Cliente andres= clientes.iterator().next();
        System.out.println(andres);

        ClientePremium[] clientesArreglo = {
                (new ClientePremium("Melany", "Trujillo")),
                (new ClientePremium("Luisa","Rodriguez"))
        };
        Integer [] numerosArreglo = {
                1,2,3,4,5
        };

        List <Integer> numerosLista=EjemploGenericos.arrayToList(numerosArreglo);
        List <Cliente> clientesLista= EjemploGenericos.arrayToList(clientesArreglo);
        List <ClientePremium> clientesPremiumList = EjemploGenericos.arrayToList(new ClientePremium[]{
                new ClientePremium("Mariana","Pajon"), new ClientePremium("Victor",
                "Urrea")
        });


        numerosLista.forEach(System.out::println);
        clientesLista.forEach(System.out::println);

        Integer [] arregloAnimales = {
                (1),(2), (3),(4)
        };

        List <Integer> listaGeneral = EjemploGenericos.arrayToList(arregloAnimales,(new String  []{
                ("pera"), ("mora"), ("guayaba"), ("curuba"),("banano")
        }));

        listaGeneral.forEach(System.out::println);
        clientesPremiumList.forEach(System.out::println);

        imprimir(clientes);
        imprimir(clientesLista);
        imprimir(clientesPremiumList);

        System.out.println("El valor mayor entre  " +arregloAnimales[2] + arregloAnimales[0] +
                            arregloAnimales[3] + " es "  + mayor(arregloAnimales[2],
                            arregloAnimales[0], arregloAnimales[3]));


    }

    public static <T extends Cliente> List <T> arrayToList(T[] c){
        return Arrays.asList(c);
    }

    public static <T extends Number> List <T> arrayToList(T[] c){
        return Arrays.asList(c);
    }


    public static <T extends Number, G extends String> List <T> arrayToList(T[] c, G[] x){

        for (G elemento : x){
            System.out.println(elemento);
        }
        ;
        return Arrays.asList(c);


    }

    public static void imprimir(List <? extends Cliente> c){
        c.forEach(System.out::println);
    }

    public static <T extends Comparable<T>> T mayor (T a, T b, T c){
        T max=a;
        if (b.compareTo(max)>0)
            max=b;
        if (c.compareTo(max)>0)
            max=c;

        return max;
    }
}
