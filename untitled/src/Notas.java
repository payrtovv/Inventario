import java.util.Scanner;

public class Notas {
    private float nota1;
    private float nota2;
    private float nota3;

    Scanner scanner = new Scanner(System.in);

    public Notas(){

    }

    public Notas(float nota1) {
        this.nota1 = nota1;
    }

    public Notas(float nota1, float nota2) {
        this(nota1);
        this.nota2 = nota2;
    }

    public Notas(float nota1, float nota2, float nota3) {
        this(nota1,nota2);
        this.nota3 = nota3;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public void IngresarNotas(){
        System.out.println("Ingresar la nota del progreso 1");
        float nota1 = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Ingresar la nota del progreso 2");
        float nota2 = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Ingresar la nota del progreso 3");
        float nota3 = scanner.nextFloat();
        scanner.nextLine();
        setNota1(nota1);
        setNota2(nota2);
        setNota3(nota3);
    }

    public void MostrarNotas(){
        System.out.printf(getNota1() + "         " + getNota2() + "         " + getNota3());
    }

}
