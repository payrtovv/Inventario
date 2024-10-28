
public class Main {
    public static void main(String[] args) {


        Universidad uni1 = new Universidad();

        Curso Curso1 = new Curso();

        Estudiantes Estudiante1 = new Estudiantes();

        Notas notas1 = new Notas();

        Estudiante1.ingresoEstudiante();
        Curso1.ingresarMateria();
        notas1.IngresarNotas();

        System.out.println("ID Banner      Universidad      Materia      Progreso 1: Progreso 2: Progreso 3: ");

        System.out.printf(Estudiante1.mostrarEstudiates());
        uni1.mostrarUni();
        Curso1.mostrarMaterias();
        notas1.MostrarNotas();
 }
}