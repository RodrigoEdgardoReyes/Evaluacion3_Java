package evaluacion3;

import java.util.Random;

public class Producto {
    // Aca aplico el encapsulamiento
    private int id;
    private String codigo;
    private String nombre;
    private String marca;
    private double precio;

    public Producto() {}

    public Producto(int id, String nombre, String marca, double precio) {
        this.id = id;
        this.codigo = generarCodigo(nombre, marca);
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método para generar el código del producto
    private String generarCodigo(String nombre, String marca) {
        String letrasNombre = nombre.length() >= 3 ? nombre.substring(0, 3) : nombre;
        String letrasMarca = marca.length() >= 2 ? marca.substring(0, 2) : marca;
        // Genero un número aleatorio de 3 dígitos
        int numeroAleatorio = new Random().nextInt(900) + 100;
        return letrasNombre + letrasMarca + numeroAleatorio;
    }
}
