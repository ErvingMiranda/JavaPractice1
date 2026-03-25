package uam.org.services;

import uam.org.models.Estudiante;

public interface IEstudianteService {
    Double calcularBeca(Estudiante e);
    void enviarCorreo(Estudiante e);
}
