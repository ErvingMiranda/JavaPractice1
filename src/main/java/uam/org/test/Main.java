package uam.org.test;

import uam.org.models.Estudiante;
import uam.org.servicio.ServiceEstudiante;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = ServiceEstudiante.insertarEstudiante("25010330", "Erving", "Miranda", "ervingmr@uamv.edu.ni");
        System.out.println(estudiante);
    }
}
