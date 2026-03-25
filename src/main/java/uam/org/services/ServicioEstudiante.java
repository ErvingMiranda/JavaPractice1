package uam.org.services;

import uam.org.models.Estudiante;

public class ServicioEstudiante {
    public static Double calcularBeca(InterfaceEstrategiaBeca estrategia, Estudiante estudiante) {
        return estrategia.calcularBeca(estudiante);
    }
}
