package uam.org.test;

import uam.org.models.Estudiante;
import uam.org.models.EstudianteBecado;
import uam.org.services.ClaseBecaA;
import uam.org.services.ClaseBecaB;
import uam.org.services.ServicioEstudiante;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new EstudianteBecado("25010330", "Erving", "Miranda",
                "ervingmr@uamv.edu.ni", 90.00);
        Double beca = estudiante.calcularBeca();
        System.out.println("Beca: " + beca);
        /*Estudiante estudiante = new Estudiante("25010330", "Erving", "Miranda",
                "ervingmr@uamv.edu.ni", 90.00);
        ServicioEstudianteDB.insertarEstudiante(estudiante);
        Estudiante estudiante1 = new Estudiante("0012106081009F", "Juan", "Garcia",
                "juangr@uamv.edu.ni", 0.00);
        ServicioEstudianteDB.insertarEstudiante(estudiante1);
        ServicioEstudianteDB.listarEstudiantes();
        calcularBeca(estudiante);
        EstudianteBecado becado = (EstudianteBecado) new  Estudiante();
        becado.calcularBeca();*/
    }

    public static void calcularBeca(Estudiante estudiante) {
        if (estudiante.getPromedio() >= 90){
            System.out.println("Su beca es:" + ServicioEstudiante.calcularBeca(new ClaseBecaA(), estudiante));
        }

        else if  (estudiante.getPromedio() >= 80){
            System.out.println("Su beca es:" + ServicioEstudiante.calcularBeca(new ClaseBecaB(), estudiante));
        }
    }
}
