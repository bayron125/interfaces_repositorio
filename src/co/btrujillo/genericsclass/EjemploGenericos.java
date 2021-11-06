package co.btrujillo.genericsclass;
import static co.btrujillo.genericsclass.TipoAnimal.*;

public class EjemploGenericos {
    public static <T> void imprimirCamion(Camion<T> camion){
        for(T c: camion){
            if(c instanceof Animal){
                System.out.println(((Animal)c).getNombre() + " " + ((Animal)c).getTipo());
            }
            else if(c instanceof  Automovil){
                System.out.println(((Automovil)c).getMarca());
            }
            else if (c instanceof Maquinaria){
                System.out.println(((Maquinaria)c).getTipo());
            }
        }
    }
    public static void main(String[] args) {

        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.addObjeto(new Animal("peregrino",CABALLO));
        transporteCaballos.addObjeto(new Animal("Grillo", CABALLO));
        transporteCaballos.addObjeto(new Animal("Tunquen",CABALLO));
        transporteCaballos.addObjeto(new Animal( "Longotoma", CABALLO));

        imprimirCamion(transporteCaballos);

        Camion <Maquinaria> transporteMaquinaria = new Camion<>(3);
        transporteMaquinaria.addObjeto(new Maquinaria("Buldoser"));
        transporteMaquinaria.addObjeto(new Maquinaria("grua orquilla"));
        transporteMaquinaria.addObjeto(new Maquinaria("perforadora"));

        imprimirCamion(transporteMaquinaria);

        Camion<Automovil> transautos= new Camion<>(3);
        transautos.addObjeto(new Automovil("Toyota"));
        transautos.addObjeto(new Automovil("Mitsubishi"));
        transautos.addObjeto(new Automovil("chevrolet"));

        imprimirCamion(transautos);
    }
}
