import java.util.Scanner;

public class Estudiantes {
    private String IDBanner;

    Scanner scanner = new Scanner(System.in);

    public Estudiantes(){

    }

    public Estudiantes(String IDBanner) {
        this.IDBanner = IDBanner;
    }

    public String getIDBanner() {
        return IDBanner;
    }

    public void setIDBanner(String IDBanner) {
        this.IDBanner = IDBanner;
    }

    public void ingresoEstudiante() {

        System.out.print("Ingrese el ID del estudiante: ");
        String nombre = scanner.nextLine();
        setIDBanner(nombre);
    }


        public String mostrarEstudiates() {
        String ID = getIDBanner() + "          ";
        return ID;
    }
}