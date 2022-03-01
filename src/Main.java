import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        Estudiante[] alum = new Estudiante[10];
        Estudiante asign = new Estudiante();

        alum[0] = new Estudiante("Antonio", "1", "Matematicas", 79);
        alum[1] = new Estudiante("Jose", "2", "Ciencias", 56);
        alum[2] = new Estudiante("Manuel", "3", "Historia", 68);
        alum[3] = new Estudiante("Francisco", "4", "Geografia", 90);
        alum[4] = new Estudiante("David", "5", "Ingles", 88);

        while (!salir) {

            System.out.println("---- Menu ----");
            System.out.println("1. Capturar alumnos.");
            System.out.println("2. Mostrar alumnos.");
            System.out.println("3. Salir.");
            System.out.println("--------------");

            try {
                System.out.println("Opcion: ");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1 -> {
                        System.out.println("---- Capturar alumnos ----");

                        int i;

                        for (i = 5; i < 10; i++) {
                            System.out.println("---- Alumno " + (i+1) + "----");
                            asign.asignarNombre(sn);
                            alum[i] = new Estudiante(asign.nombre, asign.ncontrol, asign.materia, asign.calificacion);

                        }
                    }
                    case 2 -> {
                        int i;
                        System.out.println("---- Mostrar alumnos ----");
                        for (i = 0; i < 10; i++){
                            System.out.println("Estudiante "+(1+i)+" ");
                            System.out.println(alum[i]);
                        }
                    }
                    case 3 -> salir = true;
                    default -> System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }

    }
}