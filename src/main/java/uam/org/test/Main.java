package uam.org.test;

import uam.org.models.Estudiante;
import uam.org.servicio.ServiceEstudiante;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("25010330", "Erving", "Miranda", "ervingmr@uamv.edu.ni");
        ServiceEstudiante.insertarEstudiante(estudiante);
        Estudiante estudiante1 = new Estudiante("0012106081009F", "Juan", "Garcia", "juangr@uamv.edu.ni");
        ServiceEstudiante.insertarEstudiante(estudiante1);
        ServiceEstudiante.listarEstudiantes();
    }
}
