package uam.org.test;

import uam.org.models.Estudiante;
import uam.org.servicio.ClaseBecaA;
import uam.org.servicio.ClaseBecaB;
import uam.org.servicio.ServicioEstudiante;
import uam.org.servicio.ServicioEstudianteDB;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("25010330", "Erving", "Miranda",
                "ervingmr@uamv.edu.ni", 90.00);
        ServicioEstudianteDB.insertarEstudiante(estudiante);
        Estudiante estudiante1 = new Estudiante("0012106081009F", "Juan", "Garcia",
                "juangr@uamv.edu.ni", 0.00);
        ServicioEstudianteDB.insertarEstudiante(estudiante1);
        ServicioEstudianteDB.listarEstudiantes();
        calcularBeca(estudiante);
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
