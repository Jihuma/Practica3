import java.util.Scanner;

public class Estudiante {
    public String nombre;
    public String ncontrol;
    public String materia;
    public float calificacion;
    public String estado;

    public Estudiante(String nombre, String ncontrol, String materia, float calificacion) {
        this.nombre = nombre;
        this.ncontrol = ncontrol;
        this.materia = materia;
        this.calificacion = calificacion;
        this.estado = this.Estado(calificacion);
    }

    public Estudiante() {
        this.nombre = "";
        this.ncontrol = "";
        this.materia = "";
        this.calificacion = 0;
        this.estado = "";
    }

    public void asignarNombre(Scanner sc) {
        System.out.print("Nombre: ");
        this.nombre = sc.next();
        System.out.print("Numero de control: ");
        this.ncontrol = sc.next();
        System.out.print("Materia: ");
        this.materia = sc.next();
        System.out.print("Calificación: ");
        this.calificacion = sc.nextFloat();
        this.asignarEstado();
    }

    public String Estado(float calificacion) {
        if (calificacion >= 60)
            return "Aprobado";
        else
            return "Reprobado";
    }

    public String Estado() {
        return Estado(this.calificacion);
    }

    public void asignarEstado() {
        this.estado = this.Estado();
    }

    public String toString() {
        return "Nombre: " + nombre
                + ", Num. Control: " + ncontrol
                + ", Materia: " + materia
                + ", Calificacion: " + calificacion
                + ", Estado: " + estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNcontrol() {
        return ncontrol;
    }

    public void setNcontrol(String ncontrol) {
        this.ncontrol = ncontrol;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}