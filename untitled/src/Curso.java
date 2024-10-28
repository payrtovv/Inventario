
import javax.swing.*;
import java.util.Scanner;

public class Curso {
    private String Materia;

    Scanner scanner = new Scanner(System.in);

    public Curso(){

    }

    public Curso(String materia) {
        Materia = materia;
    }



    public String getMateria() {
        return Materia;
    }

    public void setMateria(String materia) {
        Materia = materia;
    }



    public void ingresarMateria(){
        System.out.print("Ingresar el nombre de la materia: ");
        String nombre = scanner.nextLine();
        setMateria(nombre);
    }

    public void mostrarMaterias(){
        System.out.printf(getMateria()+"          ");
    }

}