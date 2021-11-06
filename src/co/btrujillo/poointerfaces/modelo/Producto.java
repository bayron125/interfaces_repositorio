package co.btrujillo.poointerfaces.modelo;

public class Producto extends BaseEntity{
    private String nombre;
    private Double precio;

    public Producto(String nombre, double precio) {
        super();
        this.nombre = nombre;
        this.precio = precio;
    }
    public Producto setId(Integer id ){
        this.id= id;
        return this;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public Double getPrecio() {
        return precio;
    }

    public Producto setPrecio(Double precio) {
        this.precio = precio;
        return this;
    }

    @Override
    public String toString() {
        return "Producto" +
                "id=" + id +
                ", nombre='" + nombre +
                ", precio=" + precio ;
    }
}
