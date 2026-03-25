package uam.org.services;

import uam.org.models.Estudiante;

public interface IEstudianteServiceDB {
    Estudiante insertarEstudiante(Estudiante estudiante);
    void eliminarEstudiante(Estudiante estudiante);
    Estudiante obtenerEstudiante(Estudiante estudiante);
    Estudiante updateEstudiante(Estudiante estudiante);
}
