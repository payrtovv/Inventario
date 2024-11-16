package Temp;

class Libro {
    private String nombre;
    private String autor;
    private int cantidad;


    private static Libro[] libros = new Libro[10];
    private static int cantidadLibros = 0;


    public Libro(String nombre, String autor, int cantidad) {
        this.nombre = nombre;
        this.autor = autor;
        this.cantidad = cantidad;
    }


    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public int getCantidad() {
        return cantidad;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    public static void agregarLibro(String nombre, String autor, int cantidad) {
        if (cantidadLibros < libros.length) {
            libros[cantidadLibros] = new Libro(nombre, autor, cantidad);
            cantidadLibros++;
            System.out.println("Libro agregado exitosamente.");
        } else {
            System.out.println("No se pueden agregar más libros. El arreglo está lleno.");
        }
    }


    public static void mostrarLibros() {
        if (cantidadLibros == 0) {
            System.out.println("No hay libros en el sistema.");
        } else {
            System.out.println("\n=== Lista de Libros ===");
            for (int i = 0; i < cantidadLibros; i++) {
                Libro libro = libros[i];
                System.out.println(
                        (i + 1) + ". Título: " + libro.getNombre() +
                                ", Autor: " + libro.getAutor() +
                                ", Cantidad: " + libro.getCantidad()
                );
            }
        }
    }
}
